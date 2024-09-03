package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("d://a/b/mytest");

        boolean test = Files.exists(fp);
        System.out.println("파일존재 유무 = "+test);

//       파일이 있으면 createFile 하면 안되고
//       파일이 없으면 createFile 해야한다.
        if (!test)
            fp = Files.createFile(fp);

        System.out.println("파일이 없으면 if를 지나쳐온다.");

        byte []buf = {0x15,0x16,0x17};
        System.out.println(Arrays.toString(buf));

//        파일이 없으면 새로 만들어서 내용을 추가하여라.
        Files.write(fp, buf,StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        byte[] buf2 = Files.readAllBytes(fp);
        System.out.println(Arrays.toString(buf2));
    }
}
