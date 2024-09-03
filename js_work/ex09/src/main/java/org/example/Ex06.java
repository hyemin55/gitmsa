package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex06 {
    public static void main(String[] args) throws IOException {

        Path src = Paths.get("myfile");
        Path target = Paths.get("targetfile");

//        (복사할파일,복사될파일)
        Files.copy(src,target);

        Files.move(src,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
