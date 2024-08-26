package org.example;

import java.util.List;

public class Main {
    private  DBRepository dbRepository = new DBRepository();

    public Main() {

        int a = dbRepository.test();

        List<Member> list = dbRepository.select();

//        아래 두가지 방법으로 출력이 가능하다.
//        stream을 사용하면 더 깔꼼하다네.
//        System.out.println(list);
        list.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {

        new Main();
    }
}