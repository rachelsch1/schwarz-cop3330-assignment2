package assignment2.ex36.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class ex36 {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean isValid = false;
        String str = "";
        int num = 0;

        while(!isValid) {
            System.out.print("Enter a number: ");
            str = input.nextLine();
            if(str.equals("done")) {
                isValid = true;
            } else {
                num = Integer.parseInt(str);
                list.add(num);
            }
        }

        double average = average(list);
        int max = max(list);
        int min = min(list);
        double std = std(list);

        System.out.print("Numbers: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(i < (list.size() - 1) ? list.get(i) + ", ": list.get(i) + "\n");
        }

        System.out.println("The average is " + df.format(average) + "\nThe minimum is " + min + "\nThe maximum is " + max + "\nThe standard deviation is " + df.format(std));
    }

    public static double average(ArrayList<Integer> list) {
        int total = 0;

        for (int i : list) {
            total = total + i;
        }

        double avge = total / list.size();

        return avge;
    }

    public static int max(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i : list) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

    public static int min(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    public static double std(ArrayList<Integer> list) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = list.size();

        for(double num : list) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: list) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
