package com.pmh.test02.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //객체를 주입해줘
public class TestController {

    @GetMapping("aa")
    public String aa(){
        return "aaaa";
    }
}
