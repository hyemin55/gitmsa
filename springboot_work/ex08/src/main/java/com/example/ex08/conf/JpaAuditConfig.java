package com.example.ex08.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class JpaAuditConfig {

    @Bean // <-객체야
    public AuditorAware<String> auditorAware(){

        AuditorAware<String> auditorAware =
                ()-> Optional.of("술도녀");
        return auditorAware;
    }
}
