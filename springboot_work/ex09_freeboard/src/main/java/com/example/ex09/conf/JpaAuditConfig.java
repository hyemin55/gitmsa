package com.example.ex09.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class JpaAuditConfig {

//     FreeBoard의  @CreatedBy @LastModifiedBy에 담을 객체이다.
    @Bean // <-객체야
    public AuditorAware<String> auditorAware(){

        AuditorAware<String> auditorAware =
                ()-> Optional.of("술도녀");
        return auditorAware;
    }
}
