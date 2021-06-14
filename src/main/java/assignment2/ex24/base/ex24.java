package assignment2.ex24.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

// anagram tester

import java.util.Scanner;
import java.util.Arrays;

public class ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        boolean anagram = isAnagram(word1, word2);

        if(anagram) {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }

    }

    public static boolean isAnagram(String word1, String word2) {
        boolean status;

        if(word1.length() != word2.length()) {
            status = false;
        } else {
            char[] arrWord1 = word1.toLowerCase().toCharArray();
            char[] arrWord2 = word2.toLowerCase().toCharArray();

            Arrays.sort(arrWord1);
            Arrays.sort(arrWord2);

            if(Arrays.equals(arrWord1, arrWord2)) {
                status = true;
            } else {
                status = false;
            }
        }

        return status;
    }

}
