package com.zigzag;

import java.util.Scanner;

public class Main {

    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter a word: ");
            String word = console.nextLine();
            System.out.print("Enter number of rows: ");
            int rows = console.nextInt();
            Zigzag zigzag = new Zigzag(rows, word);
            System.out.println(zigzag.getResult());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
