package com.prajwal.exceptionhandling;

public class Main {
    static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            divide(a,b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e ){
            System.out.println("normal exception");
        }
        finally {
            System.out.println("This will always execute no matter exception is thrown or not");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please Do not divide by zero");
        }
        return a/b;
    }
}
