package org.example;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
class MyConsumer implements Consumer<String>
{
    static List<String> myList=  List.of("parshya","robin","rahul","amit","master");

    @Override
    public void accept(String t) {
        System.out.println("Method 2: Cosumer impl value : "+ t);
    }


    /*public static void main(String[] args) {
        MyConsumer action=new MyConsumer();
        myList.forEach(action);
    }*/


}

public class ForEachExample {




    public static void main(String[] args) {


     List<Integer> myList=  List.of(1,43,9,45,12,6,564,33,3);

     //Method 1: Traversing using iterator
      Iterator<Integer> list= myList.iterator();
      while (list.hasNext())
            System.out.println(list.next());


     //Method 2: Traversing with Consumer Interface Implementaion
        MyConsumer action=new MyConsumer();
        action.myList.forEach(a-> System.out.println(a));

        //Method 3: Traversing with Anonymous consumer interface implementation

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println("Mth 3: foreach anonymous class value: "+i);
            }
        });

        // or
        /*myList.forEach(i-> System.out.println(i));
        myList.forEach(System.out::println);*/

        //Method 4: Explicit Lambda Expression

        Consumer<Integer> myListAction=n->{
            System.out.println("Mth 4: foreach lambda impl values : "+n);
        };
        myList.forEach(myListAction);

        //Method 5: Implicit lambda funtion
        myList.forEach(n->{
            System.out.println("Mth 5: foreach lambda impl values : "+n);

        });

    }
}
