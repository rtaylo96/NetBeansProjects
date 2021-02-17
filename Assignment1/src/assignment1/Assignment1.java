package assignment1;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * @author Rachel Taylor
 * @version Jan 12th, 2021
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalNumWins = 0;
        int totalNumLosses = 0;

        for (int i = 1; i <= 100000; i++) {


            boolean runCrapsGame = sumOfDice(i);

            if (runCrapsGame == true) {
                totalNumWins++;
                if (i <= 10){
                System.out.println("Wins:" + totalNumWins + " Losses:" + totalNumLosses);
                }
            } else {
                totalNumLosses++;
                if (i <= 10){
                System.out.println("Wins:" + totalNumWins + " Losses:" + totalNumLosses);
                }
                }
        }
        System.out.println("Overall: ");
        System.out.println(totalNumWins + " win(s) " + totalNumLosses + " loss(es)");
     
    }

    public static int rollOfDice(int round) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int x = (int) (Math.random() * range) + min;
        int y = (int) (Math.random() * range) + min;
        int sum = x + y;
        if (round <= 10){
        System.out.print(" Die1: " + x + ",");
        System.out.print(" Die2: " + y + " --");
        System.out.println(" Total: " + sum);
        }

        return sum;
    }

    public static boolean sumOfDice(int round) {
        boolean winOrLose = true;
        int roll = 1;
        if (round <= 10){
        System.out.print("Round " + round + " Roll " + roll + " --");   
        }
        int sum = rollOfDice(round);
        int point;


        if ((sum == 7 || sum == 11)) {
            if (round <= 10){
            System.out.println("Win!");
            }
            return winOrLose;
        }
            
        if ((sum == 2 || sum == 3 || sum == 12)) {
            if (round <= 10){
            System.out.println("Loss!");
            }
            return false;
        } else {
            point = sum;
            if (round <= 10){
            System.out.println("Point is " + point);
            roll++;
            }
        }
        boolean gameRun = true;
        while (gameRun) {
            if (round <= 10){
            System.out.print("Round " + round + " Roll " + roll + " --");  
            }
            int continueGame = rollOfDice(round);
            if (continueGame == point) {
                if (round <= 10){
                System.out.println("WIN!");
                }
                winOrLose = true;
                gameRun = false;
                roll++;
            }
            if (continueGame == 7) {
                if (round <= 10){
                System.out.println("LOSS!");
                }
                winOrLose = false;
                gameRun = false;
            }
            roll++;
        }
        return winOrLose;
    }

}
