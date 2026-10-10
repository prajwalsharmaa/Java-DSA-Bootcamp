package com.prajwal.lambdafunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }
//        arr.forEach((item)->{
//            System.out.println(item * 2);
//        });
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);
        System.out.println();

        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        //We can implement this without using lambda expressions using anonymous classes
        Operation divide = new Operation() {
            @Override
            public int operation(int a, int b) {
                return a/b;
            }
        };

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,6,prod));
        System.out.println(myCalculator.operate(12,6,divide));
    }
    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }
    int sum(int a, int b){
        return a + b;
    }
}
//these interfaces are functional interfaces
interface  Operation{
    int operation(int a,int b);
}
