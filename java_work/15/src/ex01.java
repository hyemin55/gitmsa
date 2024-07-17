/*
오버로딩은
메서드 생성자 이름이 같지만 파라메터가 다를 때 사용가능하다.
 */

import aa.Person;

public class ex01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("900505");
        Person p3 = new Person("900505","EX035F23021");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.show();
        p2.show();
        p3.show();
    }
}
