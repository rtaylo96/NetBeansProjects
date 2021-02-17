package lab2;
import java.util.Scanner;
/**
 *
 * @author Taylor
 * @version 09/23/2020
 */
public class Lab2 {

    /**
    * This method gets a student's info from user's input then displays the info.
    * @author Taylor
    */
    public static void studentInfo(){
        Scanner scnr = new Scanner(System.in);
        String name, streetName, city, state, major;
        int streetNumber, zip, studentId;
        
        System.out.println("Enter name: ");
        name = scnr.nextLine();
        System.out.println("Enter street number");
        streetNumber = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter street name: ");
        streetName = scnr.nextLine();        
        System.out.println("Enter city: ");
        city = scnr.nextLine();
        System.out.println("Enter state: ");
        state = scnr.nextLine();
        System.out.println("Enter zip: ");
        zip = scnr.nextInt();        
        System.out.println("Enter student ID: ");
        studentId = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Enter major: ");
        major = scnr.nextLine();
    
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + streetNumber + " " + streetName + "\n\t" + city
        + ", " + state + " " + zip);
        System.out.println("Student Id: " + studentId);
        System.out.println("Major: " + major);
        
    }
    
    /**
    * This method gets the plan and amount of data used from the user. It then
    * prints out the price for the plan as well as the savings if another plan would
    * have been used
    * @author Taylor
    */
    public static void cellPhoneCost(){
        Scanner scnr = new Scanner(System.in);
        String packageOption;
        float dataUsed;
        int price;
        
        System.out.println("Enter current cell phone plane letter: A, B, or C");
        packageOption = scnr.nextLine();
        System.out.println("Enter amount of data used (in GB)");
        dataUsed = scnr.nextFloat();
        
        switch(packageOption){
        
            case "A":
                System.out.println("Plan A final price: $" + planA(dataUsed));                
                //Show cost comparison vs B and C
                if (planA(dataUsed) > planB(dataUsed)){
                    //planB would have been cheaper, show savings for B
                    System.out.println("You would have saved: $" + (planA(dataUsed) - planB(dataUsed)) + 
                            " if you switched to plan B.");
                }
                if (planA(dataUsed) > planC()){
                    //planB would have been cheaper, show savings for B
                    System.out.println("You would have saved: $" + (planA(dataUsed) - planC()) + 
                            " if you switched to plan C.");
                }
                break;
                
            case "B":
                System.out.println("Plan B final price: $" + planB(dataUsed));                
                //Show cost comparison vs C
                if (planB(dataUsed) > planC()){
                    //planB would have been cheaper, show savings for B
                    System.out.println("You would have saved: $" + (planA(dataUsed) - planC()) + 
                            " if you switched to plan C.");
                }
                break;
                
            case "C":
                System.out.println("Price C final price: $" + planC());
                System.out.println("No savings, this is the most cost effective plan.");
                break;
                
        }
    }            
    /**
    * This method calculated the price for plan "A" and sets the price based on how much
    * data was used.
    * @author Taylor
    * @param dataUsed this is the amount of data used by the user
    * @return returns the final price of the plan for the user
    */
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
    /**
    * This method calculated the price for plan "B" and sets the price based on how much
    * data was used.
    * @author Taylor
    * @param dataUsed this is the amount of data used by the user for their plan
    * @return returns the final price of the plan for the user
    */
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
    /**
    * This method calculated the price for plan "C" and sets the price based on the unlimited plan.
    * @author Taylor
    * @return returns the final price of the plan for the user
    */
    public static double planC(){
        double finalPrice = 69.95; //Price is for unlimited data
        return finalPrice;
    }
    
    /**
    * This method gets a number between 1-15 from the user then prints a square based on the number
    * @author Taylor
    */
    public static void square(){
        int userNum = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number between 1-15");
        userNum = scnr.nextInt();
        while (userNum < 1 || userNum > 15){
            System.out.println("User did not enter number between 1-15. Please enter correct number: ");
            userNum = scnr.nextInt();
        }
        
        for (int i = 0; i < userNum; i++){
            for (int j = 0; j < userNum; j++){
                System.out.print("X");
            }
            System.out.println("");
        }            
    }
    

    /**
    * Main method is going to be used to call each method for each part of the lab.
    * @author Taylor
    * @param args 
    */
    public static void main(String[] args) {
        
        //studentInfo(); //Part A of Lab 2
        
        //cellPhoneCost(); //Part B of Lab 2
        
        square(); //Part D of Lab 2 
        
    }    
}
