package org.example.throwExample;

public class Main {
    public static void main(String[] args) {
        System.out.println(toUpperCase(null));
    }

    public static String toUpperCase(String s){
        if (s == null){
            throw new IllegalArgumentException("Переданий аргумент не може бути null ");
        }

        return s.toUpperCase();
    }
}
