/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatvalidationassignment;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class FloatValidateDriver {

    public static void main(String[] args) {
        String userInput;
        String errors = "";
        boolean isFloat = false;
        ValidateFloat validateFloat = new ValidateFloat(); //create an object from validateFloat Class
        userInput = acceptInput();
        do {
            if (userInput.equals("")) {
                System.out.println("Input can't be empty");
                continue;
            }
            isFloat = validateFloat.validate(userInput);
            if (isFloat) {
                System.out.println("The Entered number is Float");
            } else {
                errors = validateFloat.getErrorMessages(userInput);
                System.out.println(errors);
            }
            userInput = acceptInput();
        } while ((!userInput.equalsIgnoreCase("quite")));
        System.out.println("Goodbye");

    }

    // a method used to accept inputs from the user
    private static String acceptInput() {
        Scanner scanner = new Scanner(System.in); //creating an object of util Scanner
        System.out.print("Enter a float number: ");
        return scanner.nextLine().trim();
    }
}
