package com.prepare.java8.challanges;

import java.util.*;
import java.util.stream.Collectors;

//Hint user flat map
public class ListWithHashMapPrintProblem {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap();
        map.put(1,"Deepak");
        map.put(2,"Sharma");
        map.put(3,"Sam");
        List<Map> list = new ArrayList<>();
        list.add(map);

        list.stream().flatMap(elem -> elem.entrySet().stream()).forEach(System.out::println);

        List<String> studentClassA = Arrays.asList("Deep", "Ram", "Sam");
        List<String> studentClassB = Arrays.asList("Harry", "Poter", "Justine");

        List<List<String>> wholeClass =  new ArrayList<>();
        wholeClass.add(studentClassA);
        wholeClass.add(studentClassB);

        System.out.println(wholeClass);

        List<String> collect = wholeClass.stream().flatMap(elem -> elem.stream()).collect(Collectors.toList());
        System.out.println(collect);


    }
}
