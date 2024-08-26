package org.example;

import java.util.*;

class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ROBOT", "BOX", "LAMDA", "AA", "기역");
        list = new ArrayList<>(list);

        System.out.println(list);

//      위의 오버라이딩을 사용해 글자 길이 비교하여 출력된다.
        MyComparator myComparator = new MyComparator();
        Collections.sort(list, myComparator);

//      위와 동일한데 람다식이다.
//      Collections.sort(list,(a,b)->a.length()-b.length());
        System.out.println(list);
    }
}