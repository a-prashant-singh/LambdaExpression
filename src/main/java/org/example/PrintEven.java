package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PrintEven {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6,8,14,31);

        // Define the predicate logic for checking even numbers
        Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;

        numbers.forEach(n->
        {
            System.out.println("Mth 7: Foreach value of "+n+" Check for even:  "+isEven.test(n));
        });
        // Print only even numbers
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);
    }

}
