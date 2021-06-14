package assignment2.ex29.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

// calc years to double investment

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        int i, rate = 1;

        while(!isValid) {
            rate = 1;
            System.out.print("What is the rate of return? ");
            if (input.hasNextInt()) {
                rate = input.nextInt();
                if(rate == 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    input.nextLine();
                    continue;
                }
                isValid = true;
            }
            else {
                System.out.println("Sorry. That's not a valid input.");
            }
            input.nextLine();
        }

        int years = 72 / rate;

        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}
