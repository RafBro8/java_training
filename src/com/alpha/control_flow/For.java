package com.alpha.control_flow;

public class For {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        //for(init; condition; increment){}

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " times!");
        }

        //CHALLENGE
        //using the For loop, call the calculateInterest method with the amount of 1000 with interestRate of 2,3,4,5,6,7,8, print the results
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, i));
        }

        //CHALLENGE
        //modify For Loop to start with 8% and work back to 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, i));
        }

        //CHALLENGE
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        int count = 0;

        for (int i = 20; i < 40; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 5) {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}