package assignment2.ex31.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

// heart rate calculator

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;

        int pulse = 0;
        while(!isValid) {
            System.out.print("Enter your resting pulse: ");
            if (input.hasNextInt()) {
                pulse = input.nextInt();
                isValid = true;
            }
            else {
                System.out.println("Please enter a number.");
            }
            input.nextLine();
        }

        isValid = false;
        int age = 0;
        while(!isValid) {
            System.out.print("Enter your age: ");
            if (input.hasNextInt()) {
                age = input.nextInt();
                isValid = true;
            }
            else {
                System.out.println("Please enter a number.");
            }
            input.nextLine();
        }

        System.out.println("Resting pulse: " + pulse + "        Age: " + age + "\n");
        System.out.println("Intensity   | Rate");
        System.out.println("____________|________");

        double rate;
        double intensity;
        for(intensity = .55; intensity < 1; intensity += .05) {
            rate = pulse + (intensity *((220 - age) - pulse));
            System.out.println((int)(intensity*100) + "%         | " + (int)rate + " bpm");
        }
    }
}
