package com.prajwal.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardEg<T extends Number> {//restricts the generic type to be only numbers or subclasses of number ie integer, float, double, short etc
    private Object [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public WildCardEg(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getLists(List<Number> list){//here we only can pass the number type
        //do something
    }
    public void getList(List<? extends Number> list){//here we can pass number and its subclasses
        //do something
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public void resize(){
        Object [] temp = new Object[data.length *2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T removed = (T)data[size--];
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    static void main() {
        WildCardEg<Float> list = new WildCardEg<>();
        for (int i = 0; i < 15; i++) {
            list.add((float)i*2);
        }
        System.out.println(list);

    }
}
