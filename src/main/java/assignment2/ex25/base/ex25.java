package assignment2.ex25.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;
import java.lang.Character;

public class ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your password: ");
        String inputPass = input.nextLine();
        String strengthStr = " ";

        int strength = passwordValidator(inputPass);


        if(strength == 1) {
            strengthStr = "very weak";
        } else if(strength == 2) {
            strengthStr = "weak";
        } else if(strength == 3) {
            strengthStr = "strong";
        } else if(strength == 4) {
            strengthStr = "very strong";
        }

        System.out.println("The password '" + inputPass + "' is a " + strengthStr + " password.");
    }

    public static int passwordValidator(String inputPass) {
        int strength;
        int x, count1 = 0, count2 = 0, count3 = 0;
        char[] passArr = inputPass.toCharArray();

        if(inputPass.length() < 8) {
            for(x = 0; x < inputPass.length(); x++) {
                if(Character.isLetter(passArr[x])) {
                    count1++;
                } else if(Character.isDigit(passArr[x])) {
                    count1 += 2;
                }
            }
            if(count1 == inputPass.length()) {
                strength = 2;
            } else if(count1 == (2 * inputPass.length())) {
                strength = 1;
            } else {
                strength = 2;
            }
        } else {
            for(x = 0; x < inputPass.length(); x++) {
                if(Character.isLetter(passArr[x])) {
                    count1++;
                } else if(Character.isDigit(passArr[x])) {
                    count2++;
                } else if((Character.compare(passArr[x], '?') == 0) || (Character.compare(passArr[x], '!') == 0) || (Character.compare(passArr[x], '@') == 0) || (Character.compare(passArr[x], '@') == 0) || (Character.compare(passArr[x], '#') == 0) || (Character.compare(passArr[x], '$') == 0) || (Character.compare(passArr[x], '%') == 0) || (Character.compare(passArr[x], '&') == 0) || (Character.compare(passArr[x], '*') == 0)) {
                    count3++;
                }
            }

            if((count1 > 0) && (count2 > 0) && (count3 == 0)) {
                strength = 3;
            } else if((count1 > 0) && (count2 > 0) && (count3 > 0)) {
                strength = 4;
            } else {
                strength = 2;
            }
        }

        return strength;
    }
}
