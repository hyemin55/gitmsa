package org.example;

// cloneable 인터페이스를 재정의해서
// Clone 메서드를 사용하게 되면 객체 복사가 일어난다.
public class ex02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1.getXpos(), p1.getYpos());

        p1.showPoint();
        p2.showPoint();

        p1.setYpos(30);
        p1.setXpos(40);

        p1.showPoint();
        p2.showPoint();


    }
}
