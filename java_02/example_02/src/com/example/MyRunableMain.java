package com.example;

public class MyRunableMain {
    public static void main(String[] args) {
        MyRunable r = new MyRunable() {
            @Override
            public void run() {
                System.out.println("myrunable run !!");
            }
        };

        r.run();
    }
}
