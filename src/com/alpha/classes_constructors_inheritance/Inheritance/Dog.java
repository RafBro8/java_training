package com.alpha.classes_constructors_inheritance.Inheritance;

public class Dog extends Animal {


    //Fields specific only to Dog object and not Animal object
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //Inherit Fields from Animal Class
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);     //super means these fields inherit from Animal Class
        //super(name, 1, 1, size, weight); can also do something like this

        //initialize Dog specific Fields in a Constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chew() Mrthod called");
    }

    @Override             //Override eat() Method in Animal
    public void eat() {

        System.out.println("Dog eat() Method called (Override method)");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walk() Method called");
        move(5);
    }

    public void run() {
        System.out.println("Dog run() Method called");
        move(10);
    }
}


// public void eat() Print Output:
//Dog eat() Method called (Override method)
//Dog chew() Mrthod called
//Animal eat() Method called in Dog

// public void walk() Print Output:
//Dog walk() Method called
//Animal is moving at 5

// public void run() Print Output:
//Dog run() Method called
//Animal is moving at 10
