package com.alpha.classes_constructors_inheritance.Inheritance.challenge_exercise;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        //specific to Vehicle class
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degress");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }



    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
  }



//CHALLENGE
//Start with a base class of a Vehicle,
// then create a Car class that inherits from that base Vehicle class.
//Finally, create another Class, a specific type of Car that inherits from the Car class.
//You should be able to handle stirring, changing gears and moving (speed in other words).
//And you needed to solve where to put the appropriate stated behaviors
// (fields and methods) that are appropriate for each class.
//And you wanna create some unique behavior that is specific
//to that final class that inherits from the Car class as well.

