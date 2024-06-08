package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PrintDouble {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(n-> System.out.println(n*2.0));

        Consumer<Integer> myListAction=n->{
            System.out.println("Using Consumer funtional interface : "+n*2.0);
        };

        numbers.forEach(myListAction);
    }
}
