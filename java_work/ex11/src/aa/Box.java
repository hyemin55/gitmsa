package aa;

import javax.xml.namespace.QName;//클래스 정의.
public class Box {
    String name;
    int count;

    /*
기본생성자는 생략가능 하지만 다른 생성자를 선언할 시 기본생성자 생략 불가하다.

접근제어지시자 = public, protected, default, private
 */

    public String toString(){
        return "Box name = "+ name+" count = "+count;
    }

    public Box(){
        System.out.println("기본생성자 호출");
    }
    public Box(String n){
        name = n;
        System.out.println("n 다른생성자 호출");
    }
    public Box(String n,int c){
        name = n;
        count = c;
        System.out.println("n c 다른생성자 호출");
    }


}
