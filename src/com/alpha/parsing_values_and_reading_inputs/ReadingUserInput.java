package com.alpha.parsing_values_and_reading_inputs;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");

        boolean hasNextInt = scanner.hasNextInt();   //check if the next input entered is a number (int)
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine();  //handle Enter Key press
            System.out.println("Enter your name: ");

            String name = scanner.next();

            int age = 2018 - birthYear;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid Year of Birth");
            }
        } else {
            System.out.println("Unable to parse Year of Birth");   //check if invalid year number was entered
        }

        scanner.close();
    }
}

//System.in - allows to type input into the Console which then gets return back to the Program
//Class Scanner uses parse methods internally
//scanner.close() to terminate scanner and save memory being used by Scanner

//IntelliJ Console Output:

//    Enter your birth year:
//        1983
//
//        Enter your name:
//        Raf
//
//        Your name is Raf, and you are 35 years old.
//
//        Process finished with exit code 0