package org.example;

class Counter{
    private int count = 0;

    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    public int getCount(){
        return count;
    }
}
public class Ex03 {

    public static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException {


        Runnable run1 = () ->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };
        Runnable run2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };
        Thread th1 = new Thread(run1);
        Thread th2 = new Thread(run2);
//       start를 실행하는 순간 비동기로 바뀐다.
        th1.start();
        th2.start();

//        th1.join();
//        th2.join();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

        System.out.println(counter.getCount());
    }
}
