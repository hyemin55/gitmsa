package org.example.friend;
/*
배열에서
 - 클래스 다형성 문법으로 Friend 클래스 배열로 친구관리를 할 수 있는 프로그램
 - 부모 참조변수는 자식 인스턴스를 참조할 수 있다.
    Object obj = new String();
    Object aa = new A();
오버라이드
 - @Override 부모클래스에서 존재하는 메서드를 재정의 할 때만 사용할 수 있다.<생략가능>
                            존재하지 않는 메서드에 @Override를 적으면 에러가난다.
 - toString 메서드
  - final ->변수에 사용 시 값이 변하지 않는다. 클래스에 사용 시 다른 클래스에 상속불가.
    변수, 상수에 사용
    메서드에 오버라이드 불가
    클래스에 상속불가
 */
public class Friend {
    /*    상속받은 곳의 toString에 name과 phone을 사용할 수 있게 하기위해
     *     private를 사용하지 않고
     *     protected를 사용하거나 같은 패키지 안에 있기 때문에 없애준다.
     */
    String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 = " + name);
        System.out.println("연락처 = " + phone);
    }
}
