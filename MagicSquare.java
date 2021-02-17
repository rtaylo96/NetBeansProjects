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
public class MagicSquare {

   private int[] magicSquare;
   private Integer magicConstant = null;
   private int order;
  
   public MagicSquare(int[][] data, int size){
       magicSquare = new int[size*size];
       int count = 0;
       for(int i = 0; i < size; i++){
           int sum = 0;
           for(int j = 0; j < size ; j++){
               magicSquare[count++]= data[i][j];
               sum += data[i][j];
           }
           if(magicConstant == null){
               magicConstant = sum;
           }
       }
      
       order = size;
      
      
   }

   public int getMagicConstant() {
       return magicConstant;
   }
  

   public void setMagicSquare(int[] magicSquare) {
       this.magicSquare = magicSquare;
   }
  
   private String getNumberInOrder(){
       String numbers = "";
       for(int i = 0 ; i < magicSquare.length; i++){
           numbers = numbers + magicSquare[i]+" ";
       }
       return numbers;
   }

   @Override
   public String toString() {
       return "The combination of numbers "+ getNumberInOrder()+" is a magic square of order "+ order+"."+
               "The magic constant is "+getMagicConstant()+".";
   }
  
  
  
  
}
