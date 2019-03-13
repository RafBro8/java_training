package com.alpha.control_flow;

public class While {

    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {         //no variable i in While
            System.out.println("Count value is " + count);
            count++;
            //FOR LOOP EQUIVALENT
            //for(count=0; count !=5; count++)

//While loop is good when you don't know how many times you want to loop. Loop terminates when condition turns false
            }

        count = 1;
        while(true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;

        }

// do while ALWAYS executes at least once
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 5);



        //Part of CHALLENGE BELOW
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

            //CHALLENGE2
            //Modify the while code from above
            //Make it also record the total number of even numbers it has found
            //and break once 5 are found, and at the end, print out number of even numbers

            number = 4;
            finishNumber = 20;
            int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    //CHALLENGE1
    //Create a method called isEvenNumber that takes a parameter of type int
    //Its purpose is to determine if the argument passed to the method is
    //an even number or not
    //return true if an even number, else return false

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}
