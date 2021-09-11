package com.prepare.java8.lambda;

interface CalculatorSwitchOn {

    void switchOn();

}

public class CalculatorApi {

    public static void main(String[] args) {

        CalculatorSwitchOn switch_on = () -> System.out.println("Switch On");
        switch_on.switchOn();

    }
}
