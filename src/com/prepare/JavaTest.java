package com.prepare;

public class JavaTest {

    public void show(Integer i){
        System.out.println("Show from Integer");
    }

    public void show(String s){
        System.out.println("Show from string");
    }

    public static void main(String[] args) {

        JavaTest javaTest = new JavaTest();
        //javaTest.show(null); // This will show compile time error

    }
}
