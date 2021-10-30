package com.prepare.java8.static_default_methods;

public class DefaultMethodExample implements DefaultMethodInterfaceOne, DefaultMethodInterfaceTwo {

    @Override
    public void defaultMethod() {
        // custom implementation
//        DefaultMethodInterfaceOne.super.defaultMethod();
    }


    public static void main(String[] args) {

        DefaultMethodInterfaceTwo si = new DefaultMethodExample();
        si.defaultMethod();;
    }

}


interface DefaultMethodInterfaceOne {

    default void defaultMethod(){
        System.out.println("This is default method in interface one, default public");
    }
}

interface DefaultMethodInterfaceTwo {

    default void defaultMethod(){
        System.out.println("This is default method in interface two, default public");
    }
}



