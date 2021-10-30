package com.prepare.java8.static_default_methods;

public class StaticInterfaceMethodExample {

    public static void main(String[] args) {
//        Vehicle::getMeterReading;
    }
}


interface Vehicle {

    static String getMeterReading(){
        return "100";
    }
}