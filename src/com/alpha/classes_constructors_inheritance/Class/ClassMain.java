package com.alpha.classes_constructors_inheritance.Class;

public class ClassMain {
    public static void main(String[] args) {
        Car ramRebel = new Car();
        Car nissanGTR = new Car();

        ramRebel.setColor("Blue");
        ramRebel.getColor();

        ramRebel.setModel("1500");
        System.out.println("Model is " + ramRebel.getModel());


        //Testing Challenge
        BankAccount myAccount = new BankAccount("12345", 0.00, "John Wayne", "555-555-5555", "johnW@email.com"); //calling a Constructor and passing values to Field Params

        //setting values without using Constructor
//        myAccount.setAccountNumber("12345");
//        myAccount.setCustomerName("John Wayne");
//        myAccount.setEmailAddress("johnW@email.com");
//        myAccount.setPhoneNumber("555-555-5555");

        //Testing BankAccount Constructor Field values
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getPhoneNumber());
        System.out.println(myAccount.getEmailAddress());

        myAccount.withdrawFunds(300.00);
        myAccount.depositFunds(500.00);
        myAccount.withdrawFunds(300.00);

    }
}

// Class - blueprint for building Objects
// Objects get created/instantiated with new keyword
// Each Object built is known Instance of the Class
// Reference - location of the object (reference to an Object in memory),
// can pass references as Params to Constructors and Methods
//example:
//House blueHouse = new House("blue);
//House anotherHouse = blueHouse;
//above are two References pointing to the same Object in Memory
//In Java you always have references to an Object in Memory
//there is no way to access an Object directly,
//everything is done using a reference

//All Classes you create automaticall extend Java 'Object' Class
