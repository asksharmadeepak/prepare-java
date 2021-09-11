package com.prepare.java8.streams.filter_map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {

        // Old Approach // finding some of values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = 0;
        for(int num:integers){
            sum = sum +num;
        }
        System.out.println(sum);

        int sum1 = integers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer sum3 = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum3);

        Optional<Integer> sum4 = integers.stream().reduce(Integer::sum);
        System.out.println(sum4.get());

        Integer multiplicationOfAllValues = integers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplicationOfAllValues);

        //Find Max value in Integer array
        Integer maxValueInStream = integers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValueInStream);

        //Find the max char in strem         //ToDo : !important!
        Integer maxValueInStreamMethodReference = integers.stream().reduce(Integer::max).get();
        System.out.println(maxValueInStreamMethodReference);

        //Find the Longest char present in the stream
        //ToDo : !important!
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        String longestInTheStringArray = words.stream().reduce((word1, word2) ->
                word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestInTheStringArray);


        //ToDo : !important!
        // evalute average salary of Grade A emplopyee

        // get employee whose Grade is A
        // get salary of employee
        //
        double asDouble = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade() == "A")
                .map(employee -> employee.getSalary())
                .mapToDouble(sal -> sal)
                .average().getAsDouble();
        System.out.println(asDouble);

    }
}

class EmployeeDatabase {


    public static List<Employee> getEmployees(){
        return  Stream.of(new Employee(101,"john","A",60000),
                new Employee(109,"peter","B",30000),
                new Employee(102,"mak","A",80000),
                new Employee(103,"kim","A",90000),
                new Employee(104,"json","C",15000))
                .collect(Collectors.toList());
    }
}

class Employee {
    private int id;
    private String name;
    private String grade;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}