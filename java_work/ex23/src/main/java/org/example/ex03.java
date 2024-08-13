package org.example;

class MyBox<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
public class ex03 {
    public static void main(String[] args) {
        MyBox<Integer> myBox1 = new MyBox<>();

//        타입인자 제한의 효과.
//        MyBox<T extends Number>를 사용해서 String이 들어갈 수 없다.
//        MyBox<String> myBox2 = new MyBox<>();
    }
}
