package com.alpha.methods;

public class MethodOverloading {
    //Overloading - using same Method names, but different Parameters
    //need to change number of Parameters to make each Method unique and separate from each other

    //Overriding (use @Override annotation) override Parent Method settings (Inheritance)

    public static void main(String[] args) {
        int newScore = calculateScore("Raf", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unknown player, no score");
        return 0;
    }
}


