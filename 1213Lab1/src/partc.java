/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rachel
 */
public class partc {

    public static void main(String[] args) {
        // TODO code application logic here
        String str = "stringsEqual"; 

        char Stringa = str.charAt(1);
        char Stringb = str.charAt(2); 

        System.out.println("stringsEqual"+Stringa);
        System.out.println("stringsEqual"+Stringb);
        
        String str1 = "apple";
        String str2 = "orange";
        
        if (stringsEqual(str1, str2) != true){
            System.out.println("The strings are NOT equal.");
        }
        else{
            System.out.println("The strings are equal.");
        }
        
        int arry[] = {-1, -2, -3, -4, 1, 2, 3, 4};
        int arry1[] = {1, 2, 3, 4};
        int arry2[] = {-2, -4, 2, 4};
        int arry3[] = {2, 2, 3, 4};
        
        System.out.println("The first odd number in the first array is " +
                findFirstOdd(arry) + ".");
        System.out.println("The first odd number in the second array is " +
                findFirstOdd(arry1) + ".");
        System.out.println("The first odd number in the third array is " +
                findFirstOdd(arry2) + ".");
        System.out.println("The first odd number in the fourth array is " +
                findFirstOdd(arry3) + ".");
    
    }
        public static boolean stringsEqual(String a, String b) {
            boolean equal;
            
            if(a.length() != b.length()){
                equal = false;
            }
            else{
                int c = 0;
                do{
                    if (a.charAt(c) != b.charAt(c)){
                        equal = false;
                    }
                    else{
                        equal = true;
                    }
                    c++;
                }while (equal && c < a.length());
            }
            return equal ;
        }
        
        public static int findFirstOdd(int[] numbers){
            int firstOdd = 0; 
            int t = 0;
            int test;
            
            while (t < numbers.length){
                test = numbers[t] % 2;
                if(test != 0){
                    firstOdd = numbers[t];
                    return firstOdd;
                }
                t++;
            }
            return firstOdd;
        }
}
