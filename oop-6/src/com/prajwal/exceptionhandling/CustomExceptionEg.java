package com.prajwal.exceptionhandling;

public class CustomExceptionEg {
    static void main() {
        try{
            String name = "Prajwal";
            if(!name.equals("Prajwal")){
                throw new MyException("Name is Prajwal");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
