package pkg1213lab4;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       System.out.println("\n=====addUserInput========");
       System.out.println("The sum is: " + addUserInput());
      
       System.out.println("\n=====divideUserInput========");
       System.out.println("The quotient is: " + divideUserInput());
       
       System.out.println("\n=====divideFromFile========");
       divideFromFile();
       
       scanner.close();
    }
    
    public static int addUserInput(){
        boolean isValid = false;
        int int1 = 0, int2 = 0;
        
        while(!isValid){
            try{
                System.out.println("Please enter an integer: ");
                int1 = scanner.nextInt();
                isValid = true;
            }catch(InputMismatchException ime){
                System.out.println("Invalid input.");
                scanner.nextLine();
                isValid = false;
            }catch(ArithmeticException ae){
                System.out.println("Invalid arithmetic.");
                scanner.nextLine();
                isValid = false;
            }   
        }
        
        isValid = false;
        
        while(!isValid){
            try{
                System.out.println("Please enter a second integer: ");
                int2 = scanner.nextInt();
                isValid = true;
            }catch(InputMismatchException ime){
                System.out.println("Invalid input.");
                scanner.nextLine();
                isValid = false;
            }catch(ArithmeticException ae){
                System.out.println("Invalid arithmetic.");
                scanner.nextLine();
                isValid = false;
            }
        }
        
        int sum = int1 + int2;
        return sum;
    }
    
    public static int divideUserInput(){
        boolean isValid = false;
        int integer = 0, divisor = 0;
        
        while(!isValid){
            try{
                System.out.println("Please enter an integer: ");
                integer = scanner.nextInt();
                isValid = true;
            }catch(InputMismatchException ime){
                System.out.println("Invalid input.");
                scanner.nextLine();
                isValid = false;
            }catch(ArithmeticException ae){
                System.out.println("Invalid arithmetic.");
                scanner.nextLine();
                isValid = false;
            }
        }
        
        isValid = false;
        
        while(!isValid){
            try{
                System.out.println("Please enter an integer divisor: ");
                divisor = scanner.nextInt();
                isValid = true;
            }catch(InputMismatchException ime){
                System.out.println("Invalid input.");
                scanner.nextLine();
                isValid = false;
            }catch(ArithmeticException ae){
                System.out.println("Invalid arithmetic.");
                scanner.nextLine();
                isValid = false;
            }
        }
        
        int quotient = (integer/divisor);
        return quotient; 
    }
    
    public static void divideFromFile(){
        String fileName;
        boolean isValid = false;
        double integer = 0.0, divisor = 0.0, quotient = 0.0;
        
        try{
            while(!isValid){
                try{
                    System.out.println("Please enter the file name: ");
                
                    fileName = scanner.next();
                
                    File myFile = new File(fileName);
                    Scanner fileScan = new Scanner(myFile).useDelimiter(",");
                    integer = fileScan.nextDouble();
                    divisor = fileScan.nextDouble();
                    isValid = true;
                }catch (FileNotFoundException fnf){
                    System.out.println("File does not exist.");
                }
            }
        }catch(InputMismatchException ime){
            System.out.println("The file did not contain valid data. ");
        }
        try{
            quotient = integer/divisor;
            System.out.println("The quotient is:" + quotient);
        }catch(ArithmeticException ae){
            System.out.println("Invalid arithmetic.");
        }
   }
}

