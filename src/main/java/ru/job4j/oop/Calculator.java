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

    public int sumAllOperation(int y, int a1, int a2, int a3) {
        int result = sum(y) + multiply(a1) + divide(a2) + minus(a3);
        return result;
    }

    public static void main(String[] args) {
        int result1 = Calculator.sum(10);
        System.out.println(result1);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(5);
        System.out.println(result2);
        int result3 = calculator.divide(15);
        System.out.println(result3);
        int result4 = calculator.minus(20);
        System.out.println(result4);
        int result5 = calculator.sumAllOperation(10, 5, 15, 20);
        System.out.println(result5);
    }
}
