package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import org.apache.el.stream.Optional;

public class MapExample {
    public static void main(String[] args) {

        Stream<Integer> numStream = Stream.of(14, 75, 1, 1899, 63, 2);
        List<Integer> even = numStream.filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);

        Stream<Integer> numStream = Stream.of(10, 25, 50, 75, 100);
        List<Integer> numbersDoubled = numStream.map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(numbersDoubled);

        Stream<Integer> numStream = Stream.of(59, 78, 1, 7, 35, 35, 7, 1);
        List<Integer> numList = numStream.distinct()
                .collect(Collectors.toList());
        System.out.println(numList);
        Stream<Integer> numStream11 = Stream.of(59, 78, 1, 7, 35);
        List<Integer> numList = numStream11.map(n -> n * n)
                .peek(n -> System.out.println("squared " + n))
                .collect(Collectors.toList());
        System.out.println(numList);

        Stream<Integer> numStream = Stream.of(10, 25, 50, 75, 100);
        List<Integer> numbersDoubled = numStream.map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(numbersDoubled);

        Stream<Integer> numStream1 = Stream.of(59, 78, 1, 7, 35, 35, 7, 1);
        List<Integer> numList = numStream1.distinct()
                .collect(Collectors.toList());
        System.out.println(numList);

        Stream<Integer> numStream2 = Stream.of(59, 78, 1, 7, 35);
        List<Integer> numList2 = numStream2.map(n -> n * n)
                .peek(n -> System.out.println("squared " + n))
                .collect(Collectors.toList());
        System.out.println(numList);

        Stream<Integer> numStream3 = Stream.of(59, 78, 1, 7, 35);
        numStream3.sorted().forEach(n -> System.out.println(n));

        Stream<Integer> numStream4 = Stream.of(59, 78, 1, 7, 35);
        numStream4.forEach(n -> System.out.println(n));

        Stream<Integer> numStream5 = Stream.of(59, 78, 1, 7, 35);
        System.out.println(numStream5.count());

        List<Integer> numbers = Arrays.asList(43, 65, 1, 98, 63);
        List<Integer> oddsSquared = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(oddsSquared);

        Stream<Integer> numStream6 = Stream.of(2, 90, 0, 1280, 72);
        int smallest = numStream6.min((m, n) -> Integer.compare(m, n)).get();
        System.out.println("Smallest number: " + smallest);
        numStream6 = Stream.of(32, 1, 638, 9, 78, 234);
        int largest = numStream6.max((m, n) -> Integer.compare(m, n)).get();
        System.out.println("Largest number: " + largest);

        Stream<Integer> numStream7 = Stream.of(2, 90, 0, 1280, 72);
        // Optional<Integer> optional = numStream7.findFirst();
        // System.out.println(optional);
        // numStream7 = Stream.empty();
        // optional = numStream7.findAny();
        // System.out.println(optional);

        Stream<Integer> numStream8 = Stream.of(2, 90, 0, 1280, 72);
        boolean matchResult = numStream.allMatch(n -> n > 1);
        System.out.println(matchResult);
        numStream8 = Stream.of(2, 90, 0, 1280, 72);
        matchResult = numStream8.anyMatch(n -> n > 2);
        System.out.println(matchResult);
        numStream8 = Stream.of(2, 90, 0, 1280, 72);
        matchResult = numStream8.noneMatch(n -> n == 1);
        System.out.println(matchResult);
    }
}
