package org.example;

@FunctionalInterface
public interface IMathFunction {

    int calculate(int a,int b);

    static void printResult(int a,int b,String funtion , IMathFunction obj)
    {
        System.out.println("Result of "+ funtion+" is "+obj.calculate(a,b));
    }
}
