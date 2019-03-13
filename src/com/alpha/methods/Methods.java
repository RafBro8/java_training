package com.alpha.methods;

public class Methods {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 100;
//        int bonus = 100;
//        calculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = calculateScore(true, 800, 5, 100); // create local variable highScore and assign to it the method call
        System.out.println("Your final score was " + highScore);


//        score = 1000;
//        levelCpmpleted = 8;
//        bonus = 200;
//        calculateScore(gameOver, score, levelCompleted, bonus);

         highScore = calculateScore(true, 10000, 8, 200);//method is called and passed arguments for parameters + assigned to local variable
         System.out.println("Your final score was " + highScore);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {        //can also use if (gameOver) instead
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}


//NO RETURN TYPE
//    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver == true) {        //can also use if (gameOver) instead
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//    }

