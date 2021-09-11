package com.prepare.java8.streams.exception_handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        //Todo list of string convert it into Integer

        List<String> list = Arrays.asList("44", "123", "456");
        List<Integer> integerList = list.stream().map(element -> Integer.parseInt(element)).collect(Collectors.toList());
        List<Integer> integerList1 = list.stream().map(Integer :: parseInt).collect(Collectors.toList());
        System.out.println(integerList);
        System.out.println(integerList1);
        //Todo : how to handle expcetion in Stream api

        List<String> correcptedList = Arrays.asList("44", "123", "xyz");
        correcptedList.forEach( elem -> {
            try {
                System.out.println(Integer.parseInt(elem));
            }catch (Exception ex){
                System.out.println("Exception : "+ex.getMessage());
            }
        });
        // Todo wrong approach above

        correcptedList.forEach(handleException(elem -> System.out.println(Integer.parseInt(elem))));

        //Todo For thread sleep : handle checked exception

        List<Integer> list2 = Arrays.asList(10,20);

        list2.forEach(handleCheckedExceptionConsumer(i->{
            Thread.sleep(i);
            System.out.println(i);
        }));

    }

    static Consumer<String> handleException(Consumer<String> stringPayload){
        return elem -> {
            try {
                stringPayload.accept(elem);
            }catch (Exception ex){
                System.out.println("Exception : "+ex.getMessage());
            }
        };
    }

    static  <Target> Consumer<Target> handleCheckedExceptionConsumer
            (CheckedExceptionHandlerConsumer<Target,Exception> handlerConsumer){
        return obj -> {
            try {
                handlerConsumer.accept(obj);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
