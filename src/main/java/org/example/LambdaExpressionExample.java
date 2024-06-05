package org.example;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        IMathFunction add= Integer::sum;
        IMathFunction multiply= (x,y)->x*y;
        IMathFunction divide=(a,b)->a/b;

        IMathFunction addd=new IMathFunction() {
            @Override
            public int calculate(int a, int b) {
                return a*b;
            }
        };

        System.out.println(add.calculate(6,5));
        System.out.println(multiply.calculate(6,5));
        System.out.println(divide.calculate(6,3));

        //Passing lambda expression as funtion paramter to print result using static funtion

        IMathFunction.printResult(2,5,"Addtion",add);
        IMathFunction.printResult(2,5,"Multiply",multiply);
        IMathFunction.printResult(10,5,"Division",divide);
    }


}
