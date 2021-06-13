package assignment2.ex37.base;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.*;

public class ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        List<Character> numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        List<Character> specChars = Arrays.asList('?', '!', '@', '#', '$', '%', '&', '*');
        boolean isValid = false;

        System.out.print("What's the minimum length? ");
        int minLength = input.nextInt();
        System.out.print("How many special characters? ");
        int spCharCount = input.nextInt();
        System.out.print("How many numbers? ");
        int nums = input.nextInt();

        if((minLength - spCharCount - nums) < (spCharCount + nums)) {
            int length = 0;
            while(!isValid) {
                System.out.print("Not enough letters. Please enter a new length: ");
                length = input.nextInt();
                if(((length - spCharCount - nums) < (spCharCount + nums))) {
                    continue;
                } else {
                    isValid = true;
                }
            }
            minLength = length;
        }

        int randLength = (int) Math.random() * ((minLength + 3) - minLength) + minLength;

        double rand = 0, numLetter = randLength - spCharCount - nums;
        List<Character> pass = new ArrayList<>();
        for(int i = 0; i < numLetter; i++) {
            rand = Math.random() * 27;
            pass.add(letters.get((int)rand));
        }
        for(int i = 0; i < spCharCount; i++) {
            rand = Math.random() * 8;
            pass.add(specChars.get((int)rand));
        }
        for(int i = 0; i < nums; i++) {
            rand = Math.random() * 10;
            pass.add(numbers.get((int)rand));
        }

        Collections.shuffle(pass);
        String passStr = "";
        for(char c : pass)
        {
            passStr = passStr + c;
        }

        System.out.println("Your password is: " + passStr);
    }
}
