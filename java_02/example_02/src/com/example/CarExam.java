package com.example;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a() 매서드 오버라이딩");
            }
        };

        Bus b1 = new Bus();

        c1.a();

        Car c2 = new Bus();

    }
}
