package assignment2.ex34.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = 0;

        String[] employees = {"Josh Jacobs", "Alan Rider", "Alice Wang", "Ethan Winters", "Niki Niha"};

        System.out.println("There are " + employees.length + " employees: ");
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.print("\nEnter an employee's name to remove: ");
        String remove = input.nextLine();

        for(int i = 0; i < employees.length; i++) {
            if(employees[i].equals(remove)) {
                index = i;
                break;
            }
        }

        int j = 0;
        String[] newEmployees = new String[employees.length - 1];
        for(int i = 0; i < employees.length; i++) {
            if(employees[i].equals(remove)) {
                continue;
            }
            newEmployees[j] = employees[i];
            j++;
        }

        System.out.println("\nThere are " + newEmployees.length + " employees: ");
        for(int i = 0; i < newEmployees.length; i++) {
            System.out.println(newEmployees[i]);
        }
    }
}
