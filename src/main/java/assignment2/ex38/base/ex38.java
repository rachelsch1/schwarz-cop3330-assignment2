package assignment2.ex38.base;

/*
UCF COP3330 Summer 2021 Assignment 2 Solution
Copyright 2021 Rachel Schwarz
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String str = input.nextLine();

        int[] ints = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        Integer[] evens = filterEvenNumbers(ints);

        System.out.print("The even numbers are ");
        for(Integer i : evens) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public static Integer[] filterEvenNumbers(int[] ints) {
        List<Integer> evens = new ArrayList<>();

        for(int i = 0; i < ints.length; i++) {
            if((ints[i] % 2) != 0) {
                continue;
            }
            evens.add(ints[i]);
        }

        Integer[] array = new Integer[evens.size()];
        array = evens.toArray(array);

        return array;
    }
}
