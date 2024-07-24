/*
2. 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
public static void addOneDArr(int[] arr, int add){
    for(int i =0; i<arr.length; i++){
        arr[i] += add;
    }
}
위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 전부를 두번째 매개변수로 전달된 값의 크기만큼
증가시키는 메소드를 다음의 형태로 정의하자
public static void addTwoDArr(int[][] arr, int add){
    // 이안에 addOneDArr 메소드를 호출한다.
}
 */
package org.example;

import java.util.Arrays;

public class exam02 {


    /*  arr[][] <= 참조변수의 특성으로 main 함수에 있는 arr배열과
        addOneDArr,addTwoDArr에 있는 arr은 같은 참조변수를 가리키고 있기 때문에
        add값이 추가된 결과가 main함수에서 출력되는걸 볼 수 있다.
    */

    public static void addOneDArr(int[] arr, int add) {//2
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;

        }
    }

    public static void addTwoDArr(int[][] arr, int add) { //1
        for (int i = 0; i < 2; i++) {
            exam02.addOneDArr(arr[i], add);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 8, 56, 6, 89, 4, 3, 6, 41},
                {10, 1, 8, 89, 15, 4, 56, 0, 89, 44, 25}};

        exam02.addTwoDArr(arr, 10);

        for (int[] e : arr) {
            System.out.println(Arrays.toString(e));
        }
    }
}
