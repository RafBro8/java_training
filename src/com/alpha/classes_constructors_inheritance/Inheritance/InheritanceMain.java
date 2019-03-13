package com.alpha.classes_constructors_inheritance.Inheritance;

import com.alpha.classes_constructors_inheritance.Inheritance.challenge_exercise.DodgeRamRebel;

public class InheritanceMain {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 7);

        Dog dog = new Dog("Pomarenian", 8, 5, 2, 2, 2, 4, 1, 5, "Long");

        dog.eat();
        dog.walk();
        dog.run();

        DodgeRamRebel dodgeRamRebel = new DodgeRamRebel("2019");
        dodgeRamRebel.steer(45);
        dodgeRamRebel.accelerate(30);
        dodgeRamRebel.accelerate(20);
        dodgeRamRebel.accelerate(-42);

    }
}


