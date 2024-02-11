package com.example.demo;

import java.util.Comparator;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
      Integer min = Stream.of(1, 2, 3, 4, 5, 6,7)
                        .min(Comparator.comparing(Integer::valueOf))
                        .get();
    System.out.println("The Minimum number is: " + min);
    }
}