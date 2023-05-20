package com.example;

public class MyRunableMain2 {
    public static void main(String[] args) {
        MyRunable myRunable = new MyRunable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        RunableExecute  runableexecute = new RunableExecute();
        System.out.println("-----------------------------------");
        runableexecute.execute(myRunable);

        System.out.println("-----------------------------------");
        runableexecute.execute(new MyRunable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
    }
}
