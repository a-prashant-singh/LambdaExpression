package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PrintDouble {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer,Double> doubleFunction= integer -> integer.doubleValue();
       //or
        /*Function<Integer,Double> doubleFunction= Integer::doubleValue;*/

        numbers.forEach(n->{
            System.out.println("Mth6: Foreach lambda double value: "+doubleFunction.apply(n));
        });

        numbers.forEach(n-> System.out.println(n*2.0));


        Consumer<Integer> myListAction=n->{
            System.out.println("Using Consumer funtional interface : "+n*2.0);
        };

        numbers.forEach(myListAction);
    }
}
