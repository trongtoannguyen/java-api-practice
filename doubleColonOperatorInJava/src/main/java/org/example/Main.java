package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Get the stream
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
        stream.forEach(System.out::println);
        System.out.println();

        // Print using method reference
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEK");

        // call the static method
        // using double colon operator
        list.forEach(Main::someFunction);
    }

    // static function to be called
    static void someFunction(String s) {
        System.out.println(s);
    }
}