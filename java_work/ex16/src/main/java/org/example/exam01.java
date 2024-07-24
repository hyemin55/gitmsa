/*
1. int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값,최솟값을 찾아서 반환하는 메소드를
각각 다음의 형태로 정의하자
public static int minValue(int[] arr){}
public static int maxValue(int[] arr){}

단 반복문을 사용할때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는
새로운 for(enhanced for문)을 사용하기로 하자
 */
package org.example;

import java.util.Arrays;

public class exam01 {

    public static int minValue(int[] arr) {
        int j = 0;
        int d = maxValue(arr);
        for (int e : arr) {
            if (e < d) {
                d = e;
            }
        }
        return d;
    }

    public static int maxValue(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > j) {
                j = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1, 85, 90, 45, 13, 8, 6, 7, 50};

        System.out.println(exam01.minValue(arr));
        System.out.println(exam01.maxValue(arr));
    }
}
