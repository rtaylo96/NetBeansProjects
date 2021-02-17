/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author cogen
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment4 {
  
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter filename: ");
       String fileName = sc.nextLine();
      
       try{
           sc = new Scanner(new File(fileName));
       }catch(FileNotFoundException fe){
           System.out.println("The file "+fileName+ " is NOT Found!");
           return;
       }
      
       MagicSquareDetector msd = new MagicSquareDetector();
       while(sc.hasNextLine()){
           String line = sc.nextLine();
           String[] dataArr = line.split(" ");
           int[] data = new int[dataArr.length];
           for(int i = 0 ; i < dataArr.length ; i++){
               data[i] = Integer.parseInt(dataArr[i]);
           }
           msd.insertRow(data);
       }
      
       if(msd.isMagicSquare()){
           MagicSquare ms = new MagicSquare(msd.getArray2D(), msd.getSize());
           System.out.println(ms);
       }else{
           System.out.println("The combination of numbers "+ msd.getNumbers()+" is not a magic square");
       }
      
       sc.close();  
   }
}