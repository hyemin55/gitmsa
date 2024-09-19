package org.home.conf;

import org.home.components.AA;
import org.home.components.BB;
import org.home.components.CC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

    @Bean
    public AA aa(){
        return new AA();
    }

    @Bean
    public BB bb(){
        return new BB();
    }

    @Bean
    public CC cc(){ return new CC(); }
}
