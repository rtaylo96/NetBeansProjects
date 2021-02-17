/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;
import java.util.*;

/**
 *
 * @author Rachel
 */
public class Lab1 {
   
    public static int sumForLoop(int[] numbers){
        int sum = 0;
        int i;
        
        for (i = 0; i < numbers.length; i++)
            sum += numbers[i];
        
        return sum;
    }
    
    public static double calculateAverageTestScore(double score1, double score2, double score3){
        double testAverage = 0;
        testAverage = (score1 + score2 + score3)/3; 
        return testAverage;
    }
    
    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            System.out.println(number);
            if (number > max){
                max = number;
            }
        }
        return max;        
    }
    
    public static void main(String[] args) {
        // main code for sumForLoop
        int[] arr = {12,3,4,15};
        System.out.println("The Sum of the given array is " +sumForLoop(arr));
        
        // main code for Calculate Average
        Scanner input = new Scanner(System.in);
        System.out.println("Test Score 1: ");
        double sc1 = input.nextDouble();
        System.out.println("Test Score 2: ");
        double sc2 = input.nextDouble();
        System.out.println("Test Score 3: ");
        double sc3 = input.nextDouble();
        
        calculateAverageTestScore(sc1, sc2, sc3);
        
        // main code for findMax
        int[] array = {92, -103, 4, -2};
        System.out.println("The Max Number of the given Array is: " +findMax(array));
        
        
    }
    
}
