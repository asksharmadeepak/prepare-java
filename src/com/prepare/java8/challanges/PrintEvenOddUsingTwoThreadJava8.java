package com.prepare.java8.challanges;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintEvenOddUsingTwoThreadJava8 {

    static AtomicInteger atomicNumber = new AtomicInteger(1);

    public static void main(String[] args) {
        Runnable print = () -> {
            while (atomicNumber.get() < 10) {
                synchronized (atomicNumber) {
                    if ((atomicNumber.get() % 2 == 0) && "Even".equals(Thread.currentThread().getName())) {
                        System.out.println("Even" + ":" + atomicNumber.getAndIncrement());
                    } else if ((atomicNumber.get() % 2 != 0) && "Odd".equals(Thread.currentThread().getName())) {
                        System.out.println("Odd" + ":" + atomicNumber.getAndIncrement());
                    }
                }
            }
        };

        Thread t1 = new Thread(print);
        t1.setName("Even");
        t1.start();
        Thread t2 = new Thread(print);
        t2.setName("Odd");
        t2.start();

    }
}
