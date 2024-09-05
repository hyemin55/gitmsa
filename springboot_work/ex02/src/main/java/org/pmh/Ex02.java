package org.pmh;

import org.pmh.components.CC;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//@Autowired 자동으로 가져오기
//private final 변수선언 @RequiredArgsConstructor 자동으로 가져오기
//두가지 방법이 있는데 바로 위 방법을 더 선호한다.

public class Ex02 {
//    스프링 프레임워크를 사용하지 않은 싱클톤
    public static void main(String[] args) {

        CC cc1 = CC.getInstance();
        System.out.println(cc1);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        System.out.println(cc1==cc2);
    }
}
