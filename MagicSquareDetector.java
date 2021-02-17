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
public class MagicSquareDetector {
   private int[][] array2D = null;
   private int size = 0;
  
   public MagicSquareDetector(){
       array2D = new int[20][];
       size = 0;
   }
  
  
  
   public int[][] getArray2D() {
       return array2D;
   }

   public int getSize() {
       return size;
   }

public String getNumbers(){
   String numbers = "";
   for(int i = 0; i < size; i++){
       for(int j = 0; j < array2D[i].length;j++){
           numbers = numbers + array2D[i][j]+" ";
       }
   }
  
   return numbers;
}

   public void insertRow(int[] rowData){
       array2D[size] = rowData;
       size++;
   }
  
   public boolean isMagicSquare(){
       boolean result = false;
       if(is2dArraySquare() && eachNumUnique() && isSumEqual()){
           result = true;
       }
       return result;
   }
  
   private boolean is2dArraySquare(){
       boolean result = true;
       for(int i = 0; i < size;i++){
           if(array2D[i].length != size){
               result = false;
               break;
           }
       }
      
       return result;
   }
  
   private boolean eachNumUnique(){
       boolean result = true;
       int currentNum;
       for(int i = 0; i < size ; i++){
           for(int j = 0; j < array2D[i].length ; j++){
               currentNum = array2D[i][j];
               if(getNumberCount(currentNum) > 1){
                   result = false;
                   break;
               }
           }
       }
      
       return result;
   }
  
   private int getNumberCount(int number){
       int count = 0;
       for(int i = 0; i < size ; i++){
           for(int j = 0; j < array2D[i].length ; j++){
               if(array2D[i][j] == number){
                   count++;
               }
           }
       }
      
       return count;
   }
  
   private boolean isSumEqual(){
       if(is2dArraySquare()){
           int sumArray[] = new int[2*size + 2];
           int count = 0;
           int sum = 0;
          
          
           //store row sum
           for(int i = 0; i < size ; i++){
               sum = 0;
               for(int j = 0; j < size ; j++){
                   sum += array2D[i][j];
               }
               sumArray[count++] = sum;
           }
          
           //store column sum
           for(int i = 0; i < size ; i++){
               sum = 0;
               for(int j = 0; j < size ; j++){
                   sum += array2D[j][i];
               }
               sumArray[count++] = sum;
           }
          
           //store left diagonal sum
           sum = 0;
           for(int i = 0 ; i < size ; i++){
               sum += array2D[i][i];
           }
           sumArray[count++] = sum;
          
           //store right diagonal sum
           sum = 0;
           for(int i = 0; i < size; i++){
               sum += array2D[i][size-1-i];
           }
           sumArray[count] = sum;
          
           int currentCount = sumArray[0];
           boolean result = true;
           for(int i =1; i < size; i++){
               if(sumArray[i] != currentCount){
                   result = false;
                   break;
               }
           }  
           return result;
       }
       return false;
   }
}