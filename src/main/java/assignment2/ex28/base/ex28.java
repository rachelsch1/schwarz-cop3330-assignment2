package assignment2.ex28.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;

/* flowchart:

    make scanner -> declare counter -> declare total -> declare num & str -> enter loop
                                                                                -> prompt for number -> record input -> -> convert to int -> ad input to total
                                                                          -> exit loop -> print total -> end
 */

public class ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, num, total = 0;
        String str;

        for(x = 0; x < 5; x++) {
            System.out.print("Enter a number: ");
            str = input.nextLine();
            num = Integer.parseInt(str);
            total = total + num;
        }

        System.out.print("The total is " + total + ".");
    }
}
