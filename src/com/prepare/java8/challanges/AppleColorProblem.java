package com.prepare.java8.challanges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppleColorProblem {

    public static void main(String[] args) {

        //1. A color is passed for apple, you have to find "green apple" from it
        //2. find the vendor who sales "green apple" in minimum price.

        List<Apple> apples = Arrays.asList(new Apple("green",
                        Arrays.asList(
                                new Vendor("vendor1", 101),
                                new Vendor("vendor2", 102))),
                        new Apple("red", Arrays.asList(
                                new Vendor("vendor3", 103),
                                new Vendor("vendor4", 104)
                        )
                )
        );

        List<Apple> greenApples = findAppleBasedOnColor(apples, "green");
        System.out.println("GreenApples  "+greenApples);

        //With Flatmap
        int colorWithMinimumPrice = findAppleBasedOnColorWithMinimumPrice(apples, "green");
        System.out.println("colorWithMinimumPrice  "+colorWithMinimumPrice);


    }

    private static List<Apple> findAppleBasedOnColor(List<Apple> apples, String color) {
        return apples.stream().filter(apple -> apple.getColor().equals(color)).collect(Collectors.toList());
    }

    private static int findAppleBasedOnColorWithMinimumPrice(List<Apple> apples, String color) {

        int minPriceOfApple = apples.stream()
                .filter(apple -> apple.getColor() == color)
                .flatMap(apple -> apple.getVendorList().stream())
                .map(vendor -> vendor.getPrice())
                .mapToInt(price -> price)
                .min().getAsInt();

        return minPriceOfApple;
    }

}


class Apple {
    private String color;
    private List<Vendor> vendorList;

    public Apple(String color, List<Vendor> vendorList) {
        this.color = color;
        this.vendorList = vendorList;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Vendor> getVendorList() {
        return vendorList;
    }

    public void setVendorList(List<Vendor> vendorList) {
        this.vendorList = vendorList;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", vendorList=" + vendorList +
                '}';
    }
}

class Vendor {
    private String name;
    private int price;

    public Vendor(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}