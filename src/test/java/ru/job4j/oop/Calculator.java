package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int dvide(int a) {
        return x / a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + dvide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int rsl1 = Calculator.minus(2);
        System.out.println(rsl1);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl3 = calculator.dvide(5);
        System.out.println(rsl3);
        int rsl4 = calculator.sumAllOperation(5);
        System.out.println(rsl4);

    }
}
