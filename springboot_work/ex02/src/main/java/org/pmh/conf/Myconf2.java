package org.pmh.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// "org.pmh.components" 디렉토리를 읽어서 객체 DI 해라.
@ComponentScan(basePackages = "org.pmh.components")
public class Myconf2 {

}
