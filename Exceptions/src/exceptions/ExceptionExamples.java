/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author racta
 */
import java.util.*;

public class ExceptionExamples{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        
        do{
        try{
        System.out.println("Enter first num: ");
        int n1 = input.nextInt();
        System.out.println("Enter second num: ");
        int n2 = input.nextInt();
        int sum = n1/n2;
        System.out.println(sum);
         x = 2;
        } 
        catch(Exception e){
            System.out.println("You can't do that.");
        } 
        } while(x == 1);
    } 
}


// Exception Creation
/**
 * public class InvalidArgException extends Exception {
    public InvalidArgException(String arg) {
        super("Invalid arument: "+ arg);
    }
}
*/

// Exception Throwing
/**
 * public method(~~~~~) throws InvalidArgException{
 *  if (~~~~~~) {
 *      throw new InvalidArgException("~~~~");
 *  }
 * ~~~~~~~~~ //Does not run if there is an exception
 * }
 */

// Exception Passing
// When you are just a helper method and you don't know how to handle it.
/**
 * public method (~~~~) throws IOException{
 * ~~~~~~~
 * // calls some method that might throw and IOException
 * ~~~~~~~
 * ~~~~~~~ // This lines of code don't get executed if the exception occurs. 
 * }
 */

// Exception Handling
/**
 * try{
 *  ~~~~~~~~~
 *  ~~~~~~~~~ // this line calls a method that MIGHT throw and exception
 *  ~~~~~~~~~
 * } catch (InvalidArgException e){ //this catch is catching the one we created above
 *  ~~~~~~~~~
 *  ~~~~~~~~~
 *  ~~~~~~~~~
 * } catch (Exception e) { //this catch will catch any error; handles any exceptions not caught earlier
 *  ~~~~~~~~~
 *  ~~~~~~~~~
 *  ~~~~~~~~~
 * }
 * ~~~~~~~~
 * ~~~~~~~~
 * ~~~~~~~~
 */
