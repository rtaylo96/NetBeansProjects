/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;

/**
 *
 * @author Rachel
 */
public class lab2Help {

    public static void cellPhoneCost(){
        Scanner input = new Scanner(System.in);
        String pckage;
        float data;
        int price;
        
        System.out.println("Enter current cell phone plan letter: A, B, or C");
        pckage = input.nextLine();
        System.out.println("Enter amount of data used (in GB) ");
        data = input.nextFloat();
        
        if ("A".equals(pckage)){
            System.out.println("Plan A final price: $" + planA(data));
            
            if (planA(data) > planB(data)){
                    //planB would have been cheaper, show savings for B
                    System.out.println("You would have saved: $" + (planA(data) - planB(data)) + 
                            " if you switched to plan B.");
                }
                if (planA(data) > planC()){
                    //planB would have been cheaper, show savings for B
                    System.out.println("You would have saved: $" + (planA(data) - planC()) + 
                            " if you switched to plan C.");
                }
        }
        
        //Reapeat for Plan B and C
    }
    
    public static double planA(double dataUsed){
        double finalPrice = 0;
        if (dataUsed <= 3){
            finalPrice = 29.95;
        }
        else if (dataUsed % 1 == 0){
            //dataUsed has no decimal value, dont increase price by $10
            double newTotal = dataUsed - 3;            
            finalPrice = (29.95 + (10 * newTotal));
        }
        else{
            double newTotal = (int) Math.ceil((dataUsed - 3));           
            finalPrice = (29.95 + (10 * newTotal));            
        }
        return finalPrice;
    }
    
    public static double planB(double dataUsed){
        double finalPrice = 0;
        if (dataUsed <= 5){
            finalPrice = 49.95;
        }
        else if (dataUsed % 1 == 0){
            //dataUsed has no decimal value, dont increase price by $10
            double newTotal = dataUsed - 5;            
            finalPrice = (49.95 + (8 * newTotal));
        }
        else{
            double newTotal = (int) Math.ceil((dataUsed - 5));//This rounds up to the next whole number 
            finalPrice = (49.95 + (8 * newTotal));            
        }
        return finalPrice;
    } 
    
    public static double planC(){
        double finalPrice = 69.95; //Price is for unlimited data
        return finalPrice;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        cellPhoneCost();
    }
}
