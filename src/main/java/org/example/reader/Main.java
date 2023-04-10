package org.example.reader;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FileReaderService reader = new FileReaderService();

        while (true) {
            System.out.print("Введіть шлях до файлу: ");
            String path = scanner.nextLine();
            reader.readFile(path);
        }
    }
}
