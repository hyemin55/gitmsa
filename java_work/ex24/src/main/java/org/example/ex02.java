package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동",20);
        Person p2 = new Person("김길동",30);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        Iterator<Person> interator = plist.iterator();

        while(interator.hasNext()){
            Person p = interator.next();
            System.out.println(p);
//            plist 내용 삭제
            interator.remove();
        }
        System.out.println(plist);
    }
}
