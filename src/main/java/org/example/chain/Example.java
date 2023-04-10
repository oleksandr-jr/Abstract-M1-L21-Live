package org.example.chain;

public class Example {


    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void method1() throws Exception {
        System.out.println("In 1");
        method2();
        System.out.println("Out 1");
    }

    public static void method2() throws Exception {
        System.out.println("In 2");
        method3();
        System.out.println("Out 2");
    }

    public static void method3() throws Exception {
        System.out.println("Out 3");
        throw new Exception();
    }
}
