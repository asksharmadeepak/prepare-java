package com.prepare.java8.optional;

import com.prepare.java8.streams.map_flatmap.EkartDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(101, "jhon", null, Arrays.asList("123456","123456"));
        //Three ways to check optional
        // empty
        // of
        // ofNullable

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        //Optional<String> email1 = Optional.of(customer.getEmail());
        //System.out.println(email1); This will give null pointer

//        Optional<String> email2 = Optional.ofNullable(customer.getEmail());

//        System.out.println(email2);
//
//        if(email2.isPresent()){
//            System.out.println(email2.get());
//        }
//        System.out.println(email2.orElse("tempemail@gmail.com"));
        //System.out.println(email2.orElseThrow(() -> new IllegalArgumentException("email not present")));

        getCustomerByEmail("pqr");

    }

    public static com.prepare.java8.streams.map_flatmap.Customer getCustomerByEmail(String email) throws Exception {
        List<com.prepare.java8.streams.map_flatmap.Customer> customers =  EkartDataBase.getAll();
        return customers
                .stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findAny().orElseThrow(() -> new Exception("No customer email present"));
    }
}
