package com.prajwal.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {
    static void main() {
        List<String> fruits = Arrays.asList("Apple","Banana","Mango");//source

        Stream<String> stream = fruits.stream();
        List<String> list = stream
                .map((element) ->element.toUpperCase())
                .toList();
        System.out.println(list);
    }
}
