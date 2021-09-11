package com.prepare.java8.streams.sorting_stream;

import com.prepare.puzzle.Employee;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("five", 5);
        map.put("ten", 10);
        map.put("one", 1);

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

//        Collections.sort(entries, (Map.Entry o1, Map.Entry o2) -> o1.getKey().equals(o2.getKey()));

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        // Custom object sort for Map of employee and rating
        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId() - o2.getId();
            }
        });

        Map<Employee, Integer> employeeMapLambdaWay = new TreeMap<>((o1, o2) -> o2.getId() - o1.getId());

        employeeMap.put(new Employee(176, "Roshan"), 60);
        employeeMap.put(new Employee(388, "Bikash"), 20);
        employeeMap.put(new Employee(470, "Bimal"), 40);
        employeeMap.put(new Employee(624, "Sourav"), 30);
        employeeMap.put(new Employee(176, "Prakash"), 80);

        System.out.println(employeeMap);
        System.out.println(employeeMapLambdaWay);


        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId))).forEach(System.out::println);
    }
}
