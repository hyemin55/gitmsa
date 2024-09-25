package com.example.ex10.freeboard;

import com.example.ex10.error.BizException;
import com.example.ex10.error.ErrorCode;
import com.example.ex10.file.FileEntity;
import com.example.ex10.file.FileRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("freeboard")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j // log.info에 사용. sout보다 자세히(log내용들) 나온다.
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;
    private final FileRepository fileRepository;
    private final ModelMapper modelMapper;

//    welcome 안에 application의 my.value의 값이 들어간다.
    @Value("$my.value")
    private String welcome;

    @GetMapping("test")
    public String test(){
        return welcome;
    }
    @GetMapping
    public ResponseEntity<FreeBoardResponsePageDto> findAll(@RequestParam(name = "pageNum", defaultValue = "0") int pageNum,
                                                            @RequestParam(name = "size", defaultValue = "5") int size) {
        Sort sort = Sort.by(Sort.Direction.DESC, "idx");

//        pageNum = 0;
//        내용이 보여지는 갯수
//        size = 5;


        Pageable pageable = PageRequest.of(pageNum, size, sort);
        Page<FreeBoard> page = freeBoardRepository.findAll(pageable);

        System.out.println("elements = " + page.getTotalElements());
        System.out.println("pages = " + page.getTotalPages());

        FreeBoardResponsePageDto freeBoardResponsePageDto
                = new ModelMapper()
                .map(page, FreeBoardResponsePageDto.class);

        List<FreeBoardResponseDto> list = new ArrayList<>();
        for (FreeBoard freeBoard : freeBoardResponsePageDto.getContent()) {
            FreeBoardResponseDto freeBoardResponsDto
                    = new ModelMapper()
                    .map(freeBoard, FreeBoardResponseDto.class);

            DateTimeFormatter dateTimeFormatter
                    = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");

            freeBoardResponsDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
            freeBoardResponsDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));

            list.add(freeBoardResponsDto);
        }
        freeBoardResponsePageDto.setList(list);
//        return  ResponseEntity.ok(list.getContent());
        return ResponseEntity.ok(freeBoardResponsePageDto);
    }

    @GetMapping("view/{idx}")
    public ResponseEntity<FreeBoardResponseDto> findOne(@PathVariable(name = "idx") long idx) {
        FreeBoard freeBoard = freeBoardRepository.findById(idx)
                .orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

//        FreeboardController의 EAGER모드 사용할 때.
        System.out.println(freeBoard.getList());

        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");

        freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));
        return ResponseEntity.ok(freeBoardResponseDto);
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<FreeBoard> save(
            @Valid @RequestPart(name = "data") FreeBoardReqDto freeBoardReqDto,
                @RequestPart(name = "file", required = false) MultipartFile file){


        System.out.println(freeBoardReqDto);
        if(file!=null) {
//            System.out.println(file.getOriginalFilename());
            String myFilePath = Paths.get("ex10/images/file/").toAbsolutePath()+"\\"+file.getOriginalFilename();

            try {
                File destFile = new File(myFilePath);
                file.transferTo(destFile);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        freeBoardRepository.save(freeBoard);

        FileEntity fileEntity = new FileEntity();
//        파일 이름까지 들어간다.
        fileEntity.setName(file.getOriginalFilename());
//        DB칼럼에 url주소 넣기
        fileEntity.setPath(Paths.get("images/file/").toAbsolutePath().toString());
        fileEntity.setFreeBoard(freeBoard);
        fileRepository.save(fileEntity);

        return ResponseEntity.status(200).body(freeBoard);

    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> deleteByID(@PathVariable(name = "idx")long idx){
        freeBoardRepository.findById(idx).orElseThrow(()->new BizException(ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(idx);

        return ResponseEntity.ok("삭제되었습니다.");
    }
}
