package com.alpha.classes_constructors_inheritance.Inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveFins() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveFins();
        super.move(speed);

    }
}

//keyword super is used to access/call the parent Class members (Variables and Methods)
//super is commonly used with Method Overriding
//keyword this is used to call the current Class members (Variables and Methods)
//this is required when we have a Param with the same name as Instance Variable (Field)
//can't use this or super in static code
