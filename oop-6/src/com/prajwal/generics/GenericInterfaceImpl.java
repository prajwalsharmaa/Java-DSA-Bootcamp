package com.prajwal.generics;

public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void display(String value) {
        System.out.println(value);
    }
}
