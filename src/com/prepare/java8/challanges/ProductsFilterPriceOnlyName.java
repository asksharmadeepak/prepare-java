package com.prepare.java8.challanges;

//Filter the product based on price range (input = 5000 -10000)
//Generic method
//Product names which belong to the input range

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductsFilterPriceOnlyName {

    public static void main(String[] args) {
        Predicate<Product> productRule= product -> product.getPrice() > 10 && product.getPrice() < 200;
        Predicate<Product> productRuleGreaterThen= product -> product.getPrice() > 10;
        Predicate<Product> productRuleLessThen =  product -> product.getPrice() < 200;

        List<Product> products = Product.getProducts();
        //Filter Product
        List<Product> productList = products.stream()
                .filter(productRule)
                .collect(Collectors.toList());

        //GetOnly Names
        List<String> productListOnlyNames = products.stream()
                .filter(productRule)
                .map(product -> product.getName())
                .collect(Collectors.toList());

        //GetOnly Names with linking predicate
        List<String> productListOnlyNames2 = products.stream()
                .filter(productRuleGreaterThen.and(productRuleLessThen))
                .map(product -> product.getName())
                .collect(Collectors.toList());

        System.out.println(productList);
        System.out.println(productListOnlyNames);
    }
}


class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static List<Product> getProducts(){
        return Arrays.asList(new Product(1, "Iphone", 100),
                new Product(2, "Android", 200),
                new Product(3, "Windows", 300)
                );
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}