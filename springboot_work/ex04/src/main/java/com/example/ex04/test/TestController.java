package com.example.ex04.test;

import com.example.ex04.obj.AA;
import com.example.ex04.obj.BB;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

//    스프링컨테이너에서 직접 관리하는 방식.
    private final AA aa;
    private final BB bb;


//    JVM에서 직접 관리를 하고
//    AA aa = new AA(); 필요
    @GetMapping("aa")
    public String aa(){
        aa.doA();
        return "aaaaaaa";
    }

    @PostMapping("bb")
    public String bb(){
        bb.doB();
        return "bbbbbb";
    }
}
