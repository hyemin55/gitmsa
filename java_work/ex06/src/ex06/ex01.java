package ex06;

import java.util.Iterator;

/* 반복문 안에 반복문
 * i = 0~2 일 때 j는 0~2까지 반복해라
 */
public class ex01 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println("i = " + i + " j = " + j);
			}
		}
//		System.out.println("j = " + j);
//		j값은 i값을 구하는 for구문 안에 들어있기 때문에 j값이 도출되지 않는다.
	}
}
