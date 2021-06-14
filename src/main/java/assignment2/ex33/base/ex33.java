package assignment2.ex33.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

// magic 8 ball

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] fortune = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.print("What's your question?\n> ");
        input.nextLine();

        double randomNum = Math.random() * 4;
        int rand = (int) randomNum;

        System.out.println("\n" + fortune[rand]);
    }
}
