package assignment2.ex27.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.Scanner;
import java.lang.Character;

public class ex27 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        int fnFlag = validateFirstName(firstName);

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        int lnFlag = validateLastName(lastName);

        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        //int zip = Integer.parseInt(str1);
        int zipFlag = validateZip(zip);

        System.out.print("Enter the employee ID: ");
        String id = input.nextLine();
        //int id = Integer.parseInt(str2);
        int idFlag = validateId(id);

        int errors = 1;
        String fnError = "", lnError = "", zipError = "", idError = "";

        if(fnFlag == 1) {
            fnError = "The first name must be filled in.\nThe first name must be at least 2 characters long.\n";
        } else if(fnFlag == 2) {
            fnError = "The first name must be at least 2 characters long.\n";
        }

        if(lnFlag == 1) {
            lnError = "The last name must be filled in.\nThe last name must be at least 2 characters long.\n";
        } else if(fnFlag == 2) {
            lnError = "The last name must be at least 2 characters long.\n";
        }

        if(zipFlag == 1) {
            zipError = "The ZIP code must be filled in.\nThe ZIP code must be a number.\n";
        } else if(zipFlag == 2) {
            zipError = "The ZIP code must be a number.\n";
        }

        if(idFlag == 1) {
            idError = "The employee ID must be filled in.\nThe employee ID must be in the format of AB-1234\n";
        } else if(idFlag == 2) {
            idError = "The employee ID must be in the format of AB-1234\n";
        }

        if((fnFlag == 0) && (lnFlag == 0) && (zipFlag == 0) && (idFlag == 0)) {
            errors = 0;
        }

        System.out.println((errors == 0) ? "There were no errors found." : fnError + lnError + zipError + idError);

        /* for names: 1 -> no entry, two error messages (must be filled in and must be more than 2 char)
                      2 -> less than 2 chars, one error message
           for zip: 1 -> no entry, two error messages
                    2 -> contains non numeric char, one error message
           for id: 1 -> no entry, two error messages
                   2 -> incorrect format, one error message
         */

    }

    public static int validateFirstName(String firstName) {
        int flag = 0;
        if(firstName.length() == 0) {
            flag = 1;
        } else {
            if(firstName.length() < 2) {
                flag = 2;
            }
        }

        return flag;
    }

    public static int validateLastName(String lastName) {
        int flag = 0;
        if(lastName.length() == 0) {
            flag = 1;
        } else {
            if(lastName.length() < 2) {
                flag = 2;
            }
        }

        return flag;
    }

    public static int validateZip(String zip) {
        char[] zipArr = zip.toCharArray();
        int x, flag = 0;

        if(zip.length() == 0) {
            flag = 1;
        } else {
            for(x = 0; x < zip.length(); x++) {
                if(!Character.isDigit(zipArr[x])) {
                    flag = 2;
                }
            }
        }

        return flag;
    }

    public static int validateId(String id) {
        char[] idArr = id.toCharArray();
        int x, flag = 0;

        if(id.length() == 0) {
            flag = 1;
        } else {
            for(x = 0; x < 1; x++) {
                if(!Character.isLetter(idArr[x])) {
                    flag = 2;
                    return flag;
                }
            }
            if(Character.compare(idArr[2], '-') != 0) {
                flag = 2;
                return flag;
            }
            for(x = 3; x < id.length(); x++) {
                if(!Character.isDigit(idArr[x])) {
                    flag = 2;
                    return flag;
                }
            }
        }

        return flag;
    }
}
