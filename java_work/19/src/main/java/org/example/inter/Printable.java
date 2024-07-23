package org.example.inter;

// interface는 몸체가 없기 때문에 참조만 가능하고 내용 수정이 불가능하다.
// public static final가 생략되어 있다.
public interface Printable {

//  아래 public static final가 생략되어 있다.
    public static final int HEIGHT = 70;
    int WIDTH = 120;

    public void print(String mydoc);

//    interface 클래스 안에서 몸체를 만들어 주고 싶을땐 default를 사용해준다.
//    그러면 main 함수등..에서 객체생성을 하고 변수를 통해 메서드 호출이 가능하다.
    default void clean(){
        System.out.println("청소기능 추가");
    }

//  interface 클래스 안에서 static을 사용하면 메모리에 저장되어
//  다른 클래스에서 바로 호출이 가능하다.
    static void printLine(){
        System.out.println("한줄 출력할때 줄바꿈");

}
}
