package com.prajwal.objectcloning;

public class Human implements Cloneable{//this is just telling the jvm that it has to perform clone in this class
    int age;
    String name;
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();//it is only shallow copy ie primitives will be copied but non primitive will only point to the original object of propoerties
    }
}
