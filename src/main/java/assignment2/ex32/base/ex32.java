package assignment2.ex32.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;

        int difficulty = 0;
        while(!isValid) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            if (input.hasNextInt()) {
                difficulty = input.nextInt();
                isValid = true;
            }
            else {
                System.out.println("Please enter a number.");
            }
            input.nextLine();
        }

        double randD;
        int rand = 0;
        if(difficulty == 1) {
            randD = Math.random() * 10;
            rand = (int) randD;
        } else if(difficulty == 2) {
            randD = Math.random() * 100;
            rand = (int) randD;
        } else if(difficulty == 3) {
            randD = Math.random() * 1000;
            rand = (int) randD;
        }

        int guess, numGuess = 0;
        boolean isCorrect = false;
        System.out.print("I have my number. What's your guess? ");
        while(!isCorrect) {
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if(guess < rand) {
                    System.out.print("Too low. Guess again: ");
                    numGuess++;
                } else if(guess > rand) {
                    System.out.print("Too high. Guess again: ");
                    numGuess++;
                } else {
                    numGuess++;
                    isCorrect = true;
                }
            }
            else {
                System.out.println("Incorrect Guess again: ");
                numGuess++;
            }
            input.nextLine();
        }

        System.out.println("You got it in " + numGuess + " guesses!");
    }
}
