package com.prepare.java8.functional_interface.singular_functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    //this is old approach we can use lambda approach
    @Override
    public String get() {
        return "Hello supplier will return only";
    }

    public static void main(String[] args) {
        Supplier<String> supplierDemo = new SupplierDemo();
        System.out.println(supplierDemo.get());

        //lambda form for supplier
        Supplier<String> supplierDemoLambda  = () -> "Hello supplier will return only";
        System.out.println(supplierDemoLambda.get());


        // We can use supplier in case of dummy response we have return after filteration,
        // findAny user orElse method which accept suuplier

        List<String> integerList = Arrays.asList("a", "b");

        // if findAny does not found anything it will retunr supplier
        System.out.println(integerList.stream().findAny().orElseGet(supplierDemoLambda));
        System.out.println(integerList.stream().findAny().orElseGet(() -> "Hello supplier inline return"));

    }


}
