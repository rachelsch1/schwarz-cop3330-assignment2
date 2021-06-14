package assignment2.ex30.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

// multiplication table

public class ex30 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1; a <= 12; a++)
        {
            for (b = 1; b <= 12; b++)
            {
                System.out.printf("%4d", (a * b));
            }
            System.out.println();
        }
    }
}
