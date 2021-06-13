package assignment2.ex35.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ex35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean isValid = false;

        String name;
        while(!isValid) {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            if(name.isEmpty()) {
                isValid = true;
            } else {
                list.add(name);
            }
        }

        double randomNum = Math.random() * (list.size() + 1);
        int rand = (int) randomNum;

        System.out.println("The winner is... " + list.get(rand));
    }
}
