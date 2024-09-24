package com.example.ex10.file;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

@RestController
@RequestMapping("file")
@CrossOrigin
public class FileController {

    private final Path imagePath;

    public FileController() {
//        toAbsolutePath는 상대경로를 절대경로로 바꿔준다.
//        html에서 ./main/java/com.example/ex10/images/file/이랑 같다.
        this.imagePath = Paths.get("ex10/images/file/").toAbsolutePath();

        try {
//            주어진 경로에 디렉토리를 생성한다. 중간경로에 디렉토리가 없으면 그 디렉토리까지 생성된다.
            Files.createDirectories(this.imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(this.imagePath);
    }

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @PostMapping(value = "upload",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestPart(name = "file") MultipartFile file,
                         @RequestPart(name = "fileDto") HashMap<String, String> map) {
        System.out.println(file);
        System.out.println(map);
        return "upload";
    }

    @Data
    class FileDto {
        private String name;
    }
}
