/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethods;
import java.util.*;

/**
 *
 * @author racta
 */
public class GenericMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'r', 'a', 'c','h'};
        
        printMe(iray);
        printMe(cray);
    }
    
    // generic method
    public static <T> void printMe(T[] x){
        for(T i : x)
            System.out.printf("%s ", i);
        System.out.println();
    }
    
    /** OVERLOAD METHODS
    public static void printMe(Integer[] i){
        for(Integer x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    
    public static void printMe(Character[] i){
        for(Character x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    */
}
