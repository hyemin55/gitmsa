package org.home.conf;

import org.home.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //싱글톤 객체를 담는 통
@ComponentScan(basePackages = "org.home.components") //어떤 디렉토리를 읽어서 객체 DI(조립) 해라.
public class MyConf2 {

    @Autowired
    MemberRepository memberRepository;
}
