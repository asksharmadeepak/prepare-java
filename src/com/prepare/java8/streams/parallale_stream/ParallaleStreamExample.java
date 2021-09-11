package com.prepare.java8.streams.parallale_stream;

import java.util.stream.IntStream;

public class ParallaleStreamExample {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1,10).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream tool time: "+(end-start));

        //There are 2 ways to create parallal stream 1. paralle(), 2. parallelStream()
        System.out.println("=====================================================");
        start = System.currentTimeMillis();
        IntStream.range(1,10).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream tool time: "+(end-start));
    }
}
