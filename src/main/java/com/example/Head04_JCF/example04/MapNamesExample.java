package com.example.Head04_JCF.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, String> nameUpperCase = new Function<String, String>() {
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }
        };

        names.stream()
                .map(nameUpperCase)
                .forEach(upper -> System.out.println("Name legnth: " + upper));
    }
}
