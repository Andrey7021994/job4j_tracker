package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public static int minus(int a) {
        return a - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int sumAllOperation(int y, int a) {
        int result = sum(y) + multiply(a) + divide(a) + minus(a);
        return result;
    }

    public static void main(String[] args) {
        int result1 = Calculator.sum(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(6);
        System.out.println(result2);
        int result3 = calculator.divide(6);
        System.out.println(result3);
        int result4 = calculator.minus(6);
        System.out.println(result4);
        int result5 = calculator.sumAllOperation(10, 6);
        System.out.println(result5);
    }
}
