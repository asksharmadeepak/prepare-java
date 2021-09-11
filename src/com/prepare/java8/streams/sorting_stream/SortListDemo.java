package com.prepare.java8.streams.sorting_stream;

import com.prepare.java8.streams.filter_foreach.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        //traditional approach
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(5);
        integers.add(3);
        integers.add(10);
        Collections.sort(integers); // Asecnding Order
        Collections.reverse(integers); // Revere order
        System.out.println(integers);
        // Sorting of Premitive datatypes
        //Assending order
        integers.stream().sorted().forEach( elem -> System.out.println(elem));

        //Descending order
        integers.stream().sorted(Comparator.reverseOrder()).forEach( elem -> System.out.println(elem));

        //custom class sorting ex: employee
        //

        List<Employee> employees = getEmployees();
        employees.stream().sorted(Comparator.comparing(Employee::getId)).forEach(emp -> System.out.println(emp));

        //employee descing order
        employees.stream().sorted(Comparator.comparing(Employee::getId).reversed()).forEach(emp -> System.out.println(emp));


    }

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000));
        list.add(new Employee(388, "Bikash", "CIVIL", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000));
        list.add(new Employee(624, "Sourav", "CORE", 400000));
        list.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
        return list;
    }
}
