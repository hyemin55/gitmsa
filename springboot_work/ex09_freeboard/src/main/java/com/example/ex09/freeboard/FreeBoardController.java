package com.example.ex09.freeboard;

import com.example.ex09.error.BizException;
import com.example.ex09.error.ErrorCode;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    private final ModelMapper modelMapper;

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

        FreeBoardResponseDto freeBoardResponseDto = modelMapper.map(freeBoard, FreeBoardResponseDto.class);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm");
        freeBoardResponseDto.setRegDate(dateTimeFormatter.format(freeBoard.getRegDate()));
        freeBoardResponseDto.setModDate(dateTimeFormatter.format(freeBoard.getModDate()));
        return ResponseEntity.ok(freeBoardResponseDto);
    }

    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);

    }

    @DeleteMapping("delete/{idx}")
    public ResponseEntity<String> deleteByID(@PathVariable(name = "idx")long idx){
        freeBoardRepository.findById(idx).orElseThrow(()->new BizException(ErrorCode.NOT_FOUND));
        freeBoardRepository.deleteById(idx);

        return ResponseEntity.ok("삭제되었습니다.");
    }
}
