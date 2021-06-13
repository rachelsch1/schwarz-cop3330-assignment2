package assignment2.ex26.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;
import java.lang.Math;

public class ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        String str1 = input.nextLine();
        double balance = Integer.parseInt(str1);

        System.out.print("What is the APR on the card (as a percent)? ");
        String str2 = input.nextLine();
        double apr = Integer.parseInt(str2);
        apr = apr / 100;

        System.out.print("What is the monthly payment you can make? ");
        String str3 = input.nextLine();
        double monthly = Integer.parseInt(str3);

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthly);

        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
