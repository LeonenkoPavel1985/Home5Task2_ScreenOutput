package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world!");
        String path;
        System.out.println("Enter file path or file name:");
        Scanner scanner = new Scanner(System.in);
        path = scanner.next();

        File file = new File(path);
        FileInputStream input = new FileInputStream(file);

        String absPath = file.getAbsolutePath();
        System.out.println("Path to your file: " + absPath);

        BufferedReader obj = new BufferedReader(new FileReader(file));
        String string;

        System.out.println("Text in the file: ");
        while ((string = obj.readLine()) != null) {
            String[] list = string.split(" ");
            for (String it : list) {
                System.out.printf("%s\n", it);
            }
            System.out.println();
        }
    }
}