package com.pmh.test02.conf;

import com.pmh.test02.obj.AA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.pmh.test02.obj")
public class Myconf {

    @Bean
    public AA aa(){
        return new AA();
    }
}
