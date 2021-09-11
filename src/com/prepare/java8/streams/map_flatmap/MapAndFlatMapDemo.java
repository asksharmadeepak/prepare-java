package com.prepare.java8.streams.map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {

    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        //From the list of customer to get email ids. -> Data Transformation
        // List<Customer> convert List<String> -> Data Transformation
        //customer -> customer.getEmail() one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).
                collect(Collectors.toList());
        System.out.println(emails);

        // Non flattred data example , phone number of customers.

        List<List<String>> phoneNumerbs = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumerbs);
        // Above is incorrect because one cutomers has many phone number;
        // Or we can say one to may mapping
        // cusomter -> cusromer.getPhoneNumerbs() -> one to many mapping
        // when want to play wish nested we can go with flatMap
        List<String> phoneNumbersFlattred = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());

        System.out.println(phoneNumbersFlattred);

    }
}
