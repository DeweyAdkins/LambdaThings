package org.example;

public class CustomFunctionalInterfaces {
    public static void main(String[] args) {
        StringOperation concat = (a, b) -> a + " " + b;
        System.out.println("Concatenation: " + concat.operate("Hello", "World"));

        NumberCheck isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.check(4));
        System.out.println("Is 7 even? " + isEven.check(7));
    }

    @FunctionalInterface
    interface StringOperation {
        String operate(String a, String b);
    }

    @FunctionalInterface
    interface NumberCheck {
        boolean check(int n);
    }
}

