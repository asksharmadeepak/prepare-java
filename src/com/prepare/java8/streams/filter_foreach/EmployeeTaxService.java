package com.prepare.java8.streams.filter_foreach;

import java.util.List;
import java.util.stream.Collectors;

// This will check which employee is eligible for tax, using forEach and filter
public class EmployeeTaxService {

    public static void main(String[] args) {
        List<Employee> employees = DataBase.getEmployees();
        List<Employee> employyeWithTax = employees.stream()
                .filter(emp -> emp.getSalary() > 500000)
                .collect(Collectors.toList());

        System.out.println(employyeWithTax);
    }

}
