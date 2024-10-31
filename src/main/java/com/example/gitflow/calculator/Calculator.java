package com.example.gitflow.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("계산기 애플리케이션 v3.0 - 덧셈, 뺄셈 기능");
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("5 - 3 = " + subtract(5, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}