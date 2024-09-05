package org.example;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex04 {
    public static void main(String[] args) {
        Runnable run1 = () -> {
            int n1 = 10;
            int n2 = 20;
            System.out.println(Thread.currentThread().getName()+" "+(n1+n2));
        };

//        쓰레드를 1개만 구동시킬 수 있다.
        ExecutorService exr = Executors.newSingleThreadExecutor();
//        쓰레드를 3개 구동시킨다.
//        ExecutorService exr = Executors.newFixedThreadPool(3);
        exr.submit(run1);

        System.out.println("end "+Thread.currentThread().getName());
        exr.shutdown();
    }
}
