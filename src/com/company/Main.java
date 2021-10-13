package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your word?");
        int num = 0;
        String word = scan.nextLine();

        System.out.println("What is your letter?");

        char character = scan.next().charAt(0);

        int length = word.length();

        System.out.println("Your word/phrase " + word + " has " + length + " characters");

        for (int howMany = 0; howMany < word.length(); howMany++) {

            if (word.charAt(howMany) == character) {
                num++;

            }
        }


        if(num > 1) {
            System.out.println("Your word " + word + " has " + num + " " + character + "'s in it.");
        }
        if (num <= 1) {
            System.out.println("Your word " + word + " has " + num + " " + character + " in it.");
        }
    }

}