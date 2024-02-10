package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 25, 50, 75, 100);
        List<Integer> numbersDoubled = numStream.map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(numbersDoubled);
    }
}
