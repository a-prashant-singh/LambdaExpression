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
    }


}
