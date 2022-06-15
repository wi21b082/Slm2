package com.example.demo;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;

    }

    public int sub(int a, int b) {
        return a - b;
    }

    public String div(int a, int b) {
        if (b != 0) {
        }
        return String.format("%d", a / b);
    }


    public int quad(int a, int b){
        return a * b;
    }

    public int pow(int a, int b){
        return (int) Math.pow(a, b);
    }
}
