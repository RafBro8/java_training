package com.alpha.conditionals;

public class Conditionals {

    public static void main(String [] args ) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");

        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if (gameOver == true) {        //can also use if (gameOver) instead
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


//CHALLENGE--------------------------------------------------------------------------------------------------


//Re-use the variables from above or create new ones like newScore, or use methods()
       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        if (score < 5000 && score > 2000) {
            System.out.println("Your score was less than 5000, but greater than 2000");
        } else if (score < 12000) {
            System.out.println("Your score was less than 10000");
        } else {
            System.out.println("Got here");
        }


        if (gameOver == true) {        //can also use if (gameOver) instead
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
