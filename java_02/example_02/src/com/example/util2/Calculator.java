package com.example.util2;

public class Calculator {
    public int divide(int x, int y){
        return x/y;
    }

    public static void main(String[] args){
        com.example.util.Calculator cal = new com.example.util.Calculator();
        int value = cal.plus(10, 100);
        System.out.println(value);
    }
}
