package org.example;

import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        int[] copynum1 = Arrays.copyOf(num,2);
        int[] copynum2 = Arrays.copyOfRange(num,2,5);

        System.out.println(Arrays.toString(copynum1));
        System.out.println(Arrays.toString(copynum2));
    }
}
