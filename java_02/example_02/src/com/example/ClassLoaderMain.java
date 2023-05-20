package com.example;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
        //Bus b1 = new Bus();
        //b1.a();

        // className 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.

        String className = "com.example.Bus";
        Class clazz = Class.forName(className);

        Method[] declareMethods = clazz.getDeclaredMethods();

        for(Method m : declareMethods){
            System.out.println(m.getName());
        }

        Object o = clazz.newInstance();
        Bus b1 = (Bus)o;
        b1.a();

        String className2 = "com.example.SuperCar";
        Class clazz2 = Class.forName(className2);
        Object o2 = clazz2.newInstance();
        Car b2 = (Car)o2;
        b2.a();

        String className3 = "com.example.Bus";
        Class clazz3 = Class.forName(className3);
        Object o3 = clazz3.newInstance();
        Car b3 = (Car)o3;
        b3.a();

        String className4 = "com.example.MyHome";
        Class clazz4 = Class.forName(className4);
        Object o4 = clazz4.newInstance();

        Method m = clazz4.getDeclaredMethod("a", null); // a 매소드 정보를 가지고 있는 method를 반환해라 !!
        m.invoke(o4 ,null); // object o4가 참조하는 m 매소드를 실행해라.

    }
}
