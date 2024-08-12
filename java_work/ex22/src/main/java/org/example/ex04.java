package org.example;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int arr[] = {10,2,3,5,19,5};

//        오름차순 자동정렬(사용은 잘 안함.mysql에서 order by 사용한당)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        for (int a:arr){
            System.out.println(a);
        }
    }
}
