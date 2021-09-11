package com.prepare.java8.challanges;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayProblem {

    public static void main(String[] args) {
        // [1,2,3,4,5,6,7,8,9,10]  // output will mutiply of 5.

        Integer[] inputArr= new Integer[] {1,2,3,4,5,6,7,8,9,10 };
        List<Integer> asList = Arrays.asList(inputArr);
//        Arrays.stream(inputArr).map(elem -> elem * 2).collect(Collectors::toList);

        List<Integer> integerListFromArr = asList.stream().map(elem -> elem * 2).collect(Collectors.toList());

        //With reduce method
        asList.stream().reduce(0, (a, b) -> a * 2);

        List<Integer> list = Arrays.asList(10,20,30);

        List<Integer> integerList = list.stream().map(elem -> elem * 2).collect(Collectors.toList());
        System.out.println(integerList);

        // india is my country // count how many time "i" is apprearing


        String str = "india is my country";
        List<Character> chars = str.chars().mapToObj(c-> (char) c).collect(Collectors.toList());
        Map<Character, Integer> countMap = new HashMap<>();

        chars.forEach( elem -> {
            if(elem != ' ' ){
                if(countMap.containsKey(elem)){
                    countMap.put(elem,countMap.get(elem)+1);
                }else{
                    countMap.put(elem,1);
                }
            }
        });

        System.out.println(countMap);


    }
}
