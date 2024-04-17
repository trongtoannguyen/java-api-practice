package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* two types of Operations in Streams:
    Intermediate Operations
    Terminate Operations*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n This is a Java Stream Tutorial.");
        List<Integer> numbers = Arrays.asList(3, 1, 4, 5, 7, 2, 8, 8, 2, 1);

        // Intermediate Operations : map(), filter(), sorted(), distinct()

        // filter() - filters the elements based on the given Predicate
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // map() - transforms the elements into another form
        List<Integer> squareOfNumbers = numbers.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
        System.out.println("Square numbers: " + squareOfNumbers);

        // sorted() - sorted(Comparator<? super T> comparator)
        List<Integer> sortedNumbers = numbers.stream()
                .sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);
        List<Integer> sortedNumbersByComparator = numbers.stream()
                .sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println("Sorted numbers by Comparator: " + sortedNumbersByComparator);

        // distinct() - returns a stream of distinct elements
        List<Integer> distinctNumbers = numbers.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);

        // Terminate Operations : collect(), forEach(), count(), min(), max()

        // collect() - collects the elements of the stream into a collection
        // forEach() - performs an action for each element of the stream
        numbers.stream()
                .distinct().filter(n -> n % 2 == 0).sorted()
                .forEach(n -> System.out.println("item: " + n));

        // count() - returns the count of elements in the stream
        long count = numbers.stream().distinct().filter(n -> n % 2 == 0)
                .count();
        System.out.println("Count of numbers: " + count);
    }
}