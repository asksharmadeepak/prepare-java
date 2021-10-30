package com.prepare.java8.challanges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSalaryOfEmployees {

    public static void main(String[] args) {

        Employee e1= new Employee(101, 10000.0);
        Employee e2= new Employee(102, 20000.0);
        Employee e3= new Employee(103, 30000.0);
        Employee e4= new Employee(104, 40000.0);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        List<Employee> employees1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        employees1.stream().forEach( employee -> System.out.println(employee.getSalary()));


    }
}

class Employee{
    private int empNo;
    private double salary;

    public Employee(int empNo, double salary) {
        this.empNo = empNo;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}