package org.example;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {

        Operation add = (a, b) -> a + b;

        Operation subtract = (a, b) -> a - b;

        Operation multiply = (a, b) -> a * b;

        Operation divide = (a, b) -> a / b;


        System.out.println("Addition: " + add.operate(10, 5));
        System.out.println("Subtraction: " + subtract.operate(10, 5));
        System.out.println("Multiplication: " + multiply.operate(10, 5));
        System.out.println("Division: " + divide.operate(10, 5));
    }

    @FunctionalInterface
    interface Operation {
        double operate(double a, double b);
    }
}

