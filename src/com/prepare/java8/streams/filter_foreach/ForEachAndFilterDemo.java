package com.prepare.java8.streams.filter_foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ForEachAndFilterDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sam");
        names.add("Rohit");
        names.add("John");

        // forEach accept Consumer funtional interface for iterate

        names.stream().forEach((element) -> System.out.println(element));

        // forEach with filter example
        names.stream().filter((element)-> element.startsWith("S")).forEach((elem) -> System.out.println("Filter with for each  "+elem));


        //iterate map using foreach method
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((k,v) -> System.out.println("Key is:  - "+k +" Value is : - "+v ));

    }
}
