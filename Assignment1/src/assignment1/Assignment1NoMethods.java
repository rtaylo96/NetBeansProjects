/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Rachel Taylor
 * @version Jan 12th 2021
 */
public class Assignment1NoMethods {
    public static void main(String[] args) {        
        int rollNum = 1; //Declaring variables to be used later.
        int roundNum = 1;
        int winCount = 0;
        int lossCount = 0;
        int point;
        int newScore;





        for (int i = 0; i < 10; i++){ //this For loop handles the first 10 rolls in the set.

            int dice1 = (int)(Math.random()*6)+1; //create two die that roll 1 through 6
            int dice2 = (int)(Math.random()*6)+1;
            int diceTotal = (dice1 + dice2); //add the amounts of each die
            System.out.println("Round " + roundNum + ", Roll " + (rollNum++) + " -- Dice 1: " + dice1 + " , Dice 2: " + dice2 + " -- Total: " + diceTotal);
            if ((diceTotal == 7) || (diceTotal == 11)){ //if the total is 7 or 11, count as a win and move on to the next round.
                System.out.println("WIN!");
                winCount++;
                rollNum = 1;
                roundNum++;
                System.out.println("Win(s): " + winCount + " , Loss(es) " + lossCount);
            }

            else if ((diceTotal == 2) || (diceTotal == 3) || (diceTotal == 12)){ //if the total is 2, 3, or 12, count as a loss and move on to the next round.
                System.out.println("LOSS!");
                lossCount++;
                rollNum = 1;
                roundNum++;
                System.out.println("Win(s): " + winCount + " , Loss(es) " + lossCount);
            }

            else {
                //if the total is not 2, 3, 7, 11, or 12, set the total as the point value and continue to the subsequent rolls.
                point = diceTotal;
                System.out.println("Point is " + point);
                while (true){ //use a continuous While loop to continue rolls until a win or loss is met.

                    dice1 = (int)(Math.random()*6)+1; //roll the die again and assign the new sum to newScore
                    dice2 = (int)(Math.random()*6)+1;
                    newScore = dice1 + dice2;


                    System.out.println("Round " + roundNum + ", Roll " + (rollNum++) + " -- Dice 1: " + dice1 + " , Dice 2: " + dice2 + " -- Total: " + newScore);

                    if (newScore == 7){ //if a 7 is rolled before the point, break the While loop, mark it as a loss and return to the initial For loop.
                        System.out.println("LOSS!");
                        lossCount++;
                        rollNum = 1;
                        roundNum++;
                        System.out.println("Win(s): " + winCount + " , Loss(es) " + lossCount);
                        break;

                    }

                    if (newScore == point){ //if the point value is rolled, break the While loop, mark it as a win and return to the initial For loop.
                        System.out.println("WIN!");
                        winCount++;
                        rollNum = 1;
                        roundNum++;
                        System.out.println("Win(s): " + winCount + " , Loss(es) " + lossCount);
                        break;
                    }

                }
            }
        }

        System.out.println("10-ROUND SUMMARY: Win(s): " + winCount + " , Loss(es): " + lossCount); //print the summary for the first 10 rounds.



        for (int i = 0; i < 99990; i++){ //use this For loop to perform the rest of the rolls in the 100,000 roll set. This loop lacks the detailed print statements.
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;
            int diceTotal = (dice1 + dice2);
            if ((diceTotal == 7) || (diceTotal == 11)){
                winCount++;
            }

            if ((diceTotal == 2) || (diceTotal == 3) || (diceTotal == 12)){
                lossCount++;
            }

            else if ((diceTotal == 4) || (diceTotal == 5) || (diceTotal == 6) || (diceTotal == 8) || (diceTotal == 9) || (diceTotal == 10)){
                point = diceTotal;

                while (true){
                    dice1 = (int)(Math.random()*6)+1;
                    dice2 = (int)(Math.random()*6)+1;
                    newScore = dice1 + dice2;


                    if (newScore == 7){
                        lossCount++;
                        break;

                    }else if (newScore == point){
                        winCount++;
                        break;
                    }

                }
            }
        }
        System.out.println("OVERALL SUMMARY: Win(s): " + winCount + " , Loss(es): " + lossCount);
    }
}