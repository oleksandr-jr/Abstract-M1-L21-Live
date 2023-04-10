package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println(5 / 0);

        int[] arr = {1, 2, 3, 4, 5};



        try {
//            System.out.println(5/0);
            System.out.println(arr[7]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ми зловили виключення" + e);
        }


        System.out.println("кінець програми");
    }
}