package com.alpha.control_flow;

public class Switch {

    public static void main(String[] args) {

        printDayOfTheWeek(5);
        printDayOfTheWeek(6);



//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value is 1");
//        } else if (value == 2){
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is 3");
//        }

//--------------------------------------------------------------------------------------------------------------------
        //with switch you only test 1 variable, with if() you can test many different variables
        //switch is good when you test 1 Variable and want to test different values for that Variable
        //switch can be used with 4 primitive types: byte, short char, and int and Strings
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                case4:
                case5:
                System.out.println("Was a 3, or 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
        }

        char myChar = 'A';

        switch (myChar) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
            case 'E':
                System.out.println("Character is D, or E");
                break;

            default:
                System.out.println("Could not find Characters!");
        }

        String month = "MAy";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "april":
                System.out.println("Apr");
                break;
            case "may":
                System.out.println("May is the best month! " + month);
                break;

            default:
                System.out.println("All other months!");
        }

    }


//CHALLENGE

//Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//The method should not return any value (hint: void)
//Using a switch statement print Sunday, Monday, ... ,Saturday if the int parameter day is 0, 1, ... , 6 respectively, otherwise it should print Invalid day.
//
//Bonus:
//Write a second solution using if then else, instead of using switch.

    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("FRIDAY!!!");
                break;
            case 6: case 7:
                System.out.println("Saturday and Sunday");
                break;

                default:
                    System.out.println("Invalid Day");

        }

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("FRIDAAAAYYY!!!");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}

