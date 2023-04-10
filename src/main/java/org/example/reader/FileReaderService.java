package org.example.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderService {

    public void readFile(String path)  {
        File file = new File(path);
        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }


        System.out.println("Test code");

    }
}
