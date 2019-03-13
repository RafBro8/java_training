package com.alpha.parsing_values_and_reading_inputs;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        //can also use below instead of boolean first = true; check above
       //int min = Integer.MAX_VALUE;
       //int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {              //to make sue first number entered is 1 not 0
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;    //test against number entered by the user
                }
                if (number < min) {
                    min = number;   //test against number entered by the user
                }
            } else {
                break;
            }

            scanner.nextLine();  //handle Enter key
        }

        System.out.println("min = " + min + ", max = " + max);

        scanner.close();
    }
}

//Min and Max CHALLENGE

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message ÅgEnter number:Åh
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

//Hint:
//-Use an endless while loop.