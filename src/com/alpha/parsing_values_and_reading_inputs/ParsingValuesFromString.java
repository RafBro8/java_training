package com.alpha.parsing_values_and_reading_inputs;

public class ParsingValuesFromString {

    public static void main(String[] args) {

        //Converting Value from String to int using parseInt() method

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);  //parseInt will try to convert numberAsString into an Integer, Integer is a class type
        System.out.println("number = " + number);

        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


        //Converting Value from Integer to Double

        double numba = Double.parseDouble(numberAsString);        //Double is a Class type, double is Primitive type
        System.out.println("number = " + numba);


    }
}
