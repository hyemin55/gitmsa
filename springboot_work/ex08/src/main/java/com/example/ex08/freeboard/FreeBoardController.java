package com.example.ex08.freeboard;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
public class FreeBoardController {

    private final FreeBoardRepository freeBoardRepository;

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

    @PostMapping
    public ResponseEntity<FreeBoard> save(@Valid @RequestBody FreeBoardReqDto freeBoardReqDto) {

        FreeBoard freeBoard = new ModelMapper().map(freeBoardReqDto, FreeBoard.class);
        freeBoardRepository.save(freeBoard);
        return ResponseEntity.status(200).body(freeBoard);

    }
}
