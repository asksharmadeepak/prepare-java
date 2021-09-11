package com.prepare.java8.functional_interface.bi_functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Pass 2 list of argument and find the duplicate, remove the duplicate amnd return
//Unique list object


public class BiFunctionDemo implements BiFunction<List<Integer>,List<Integer>, List<Integer> > {

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        BiFunction biFunction = new BiFunctionDemo();
        List<Integer> list1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
        List<Integer> list2 = Stream.of(11, 3, 43, 6, 7, 19).collect(Collectors.toList());
        System.out.println("Traditional Approach "+biFunction.apply(list1, list2));

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(integers, integers2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };

        System.out.println("Anonymous Approach "+biFunction1.apply(list1, list2));

        //Todo : Convert traditional approach to lambda expression
        // As per lambda we dont need any method singnture and paramater

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = (l1, l2) ->  {
            return Stream.of(l1, l2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        System.out.println("Lambda approach"+ biFunction2.apply(list1, list2));

        //Todo : use case for increasing keys of bifunction with Map
        //Todo : replaceAll(<Bifunction>) metghod accept BiFcuntion

        Map<String, Integer> map=new HashMap<>();
        map.put("basant",5000);
        map.put("santosh",15000);
        map.put("javed",12000);

        BiFunction<String,Integer,Integer> increaseSalaryBiFunction= new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value+1000;
            }
        };

        //map.replaceAll(increaseSalaryBiFunction);


        //BiFunction<String,Integer,Integer> increaseSalBiFunction= ( key,  value) ->  value+2000;

        map.replaceAll(( key,  value) ->  value+2500);

        System.out.println(map);

        //ToDo BiFunction also has method called andThen which can work on output of apply
        Function<List<Integer>, List<Integer>> sortedFunction = (lists) -> lists.stream().sorted().collect(Collectors.toList());

        System.out.println("Use of Bifunction with andThen method" +biFunction2.andThen(sortedFunction).apply(list1,list2));

    }

}
