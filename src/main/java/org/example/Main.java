package org.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Aplicatia primului scenariu
        UIProduct uiProduct = new UIProduct();
        uiProduct.run();

        System.out.println("-------------------------------");

        // Aplicatia celui de-al doilea scenariu
        UIMovie uiMovie = new UIMovie();
        uiMovie.run();
    }
}