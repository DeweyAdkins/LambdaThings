package org.example;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Interfaced {
    public static void main(String[] args) {

        Predicate<Integer> isGreaterThanTen = (n) -> n > 10;
        System.out.println("Is 15 greater than 10? " + isGreaterThanTen.test(15));
        System.out.println("Is 5 greater than 10? " + isGreaterThanTen.test(5));

        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        Consumer<String> printMessage = (message) -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");

        Supplier<String> defaultMessage = () -> "Default Message";
        System.out.println("Supplier provides: " + defaultMessage.get());
    }
}
