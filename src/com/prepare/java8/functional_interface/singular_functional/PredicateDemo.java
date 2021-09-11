package com.prepare.java8.functional_interface.singular_functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    //this is old approach we can use lambda apparoach
    @Override
    public boolean test(Integer integer) {
        if(integer% 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Predicate<Integer> and(Predicate<? super Integer> other) {
        return null;
    }

    @Override
    public Predicate<Integer> negate() {
        return null;
    }

    @Override
    public Predicate<Integer> or(Predicate<? super Integer> other) {
        return null;
    }

    public static void main(String[] args) {
        // Old way
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(5));

        //New way
       Predicate<Integer> predicateLambda =  (input) -> {
            if(input % 2 == 0){
                return true;
            }else{
                return false;
            }
        };
        // More better way
        Predicate<Integer> predicateLambda2 =  (input) -> input % 2 == 0;
        System.out.println(predicateLambda2.test(5));


        // java8 stream api there is method called filter() this will accept predicate functional interface

        List<Integer> integerList = Arrays.asList(2, 3, 4, 10, 1);

        integerList.stream().filter((input) -> input % 2 == 0).forEach(element -> System.out.println(element));

    }



}
