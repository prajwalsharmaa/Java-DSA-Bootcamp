package com.prajwal.objectcloning;

public class Main {
    static void main() throws CloneNotSupportedException {
        Human human1 = new Human(45,"Prajwal Sharma");
        Human human2 = new Human(human1);//this object cloning method uses a lot of time

        Human human3 = (Human)human1.clone();
        System.out.println(human3);
    }
}
