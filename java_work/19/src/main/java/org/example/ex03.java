package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외구문

/*
interface

int A = 변수. public static final은 이미 적혀있어서 안적어도된다.
void doA();몸체가 없는 메서드. public은 이미 적혀있어서 안적어도된다.

class를 만들어 interface를 inimplements로상속 받아야 한다.
doA() 메서드는 재정의가 필요하다.

default() static() 추가가 가능하다. 굳이 주고 싶다면.
메서드 안에 존재가능하다.

default() 사용법은: 새로운 객체를 생성하여 사용할 수 있다.
default() -> new

static() 사용법은: 바로 참조하여 사용할 수 있다.
static() -> Printable.doA();

람다 규칙은
interface 하나의 추상메서드가 존재 해야한다.
() -> {}

 */
public class ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("a : ");
            int a = scan.nextInt();
            System.out.println("b : ");
            int b = scan.nextInt();



            System.out.println("나누기 시작");
            System.out.println(a / b);
//            0으로 나눌 수 없기에 catch로 이동한다.
            System.out.println("나누기 끝");

            int c[] = new int[3];
            System.out.println(c[4]);

//      연산 오류일때.
        } catch (ArithmeticException e) {
//       예외 원인을 담고 있는 문자열을 반환.
            System.out.println(e.getMessage());
//      예외 원인을 담고 있는 문자열을 오류알림 부분에 반환.
            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다.");
//      연산할 수 없는 문자가 들어갔을때.
        } catch (InputMismatchException ie) {
            System.out.println("숫자 이외에 넣으면 안되요");
        } catch (Exception p) {
            System.out.println("이것은 모든 예외 상황");
        }
        System.out.println("정상 종료 되었습니다.");
    }
}
