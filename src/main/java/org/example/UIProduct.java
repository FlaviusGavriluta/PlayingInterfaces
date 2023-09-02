package org.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UIProduct {
    public void run() {
        List<Product> products = List.of(
                new Product("Laptop", 1200, 10),
                new Product("Phone", 800.75, 25),
                new Product("TV", 1500.00, 5),
                new Product("Mouse", 30.00, 100)
        );
        Predicate<Product> isExpensive = product -> product.getPrice() > 1000;
        Predicate<Product> isInStock = product -> product.getStock() > 0;

        List<Product> expensiveProducts = products.stream()
                .filter(isExpensive.and(isInStock))
                .collect(Collectors.toList());

        System.out.println("Expensive products in stock: ");
        expensiveProducts.forEach(System.out::println);
    }
}
