package com.prepare.java8.functional_interface.singular_functional;

import com.prepare.java8.streams.exception_handling.CheckedExceptionHandlerConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {

    //this is old approach we can use lambda apparoach
    @Override
    public void accept(Integer integer) {
        System.out.println("printing : ...." +integer);
    }

    @Override
    public Consumer<Integer> andThen(Consumer<? super Integer> after) {
        return null;
    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = input -> System.out.println("printing : ...." + input);
        consumer.accept(10);
        // java8 stream api there is method called forEach() this will accept consumer functional interface

        List<Integer> integerList = Arrays.asList(2, 3, 4, 10, 1);

        integerList.stream().forEach(consumer);

    }


}
