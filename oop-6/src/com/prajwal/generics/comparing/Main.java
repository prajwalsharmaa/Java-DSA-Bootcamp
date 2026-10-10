package com.prajwal.generics.comparing;

import java.util.Arrays;

public class Main {
    static void main() {
        Student prajwal = new Student(2,54.45f);
        Student rahul = new Student(3,64.55f);
        Student ramesh = new Student(1,34.55f);
        Student rekha = new Student(5,24.55f);
        Student gurpreet = new Student(4,14.55f);
        System.out.println(prajwal.compareTo(rahul));
        Student [] list = {prajwal,rahul,ramesh,rekha,gurpreet};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if(prajwal.compareTo(rahul)<0){
            System.out.println("Rahul has more marks");
        }
    }
}
