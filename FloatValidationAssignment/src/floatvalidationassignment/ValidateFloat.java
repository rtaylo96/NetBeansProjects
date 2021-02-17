/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatvalidationassignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ee
 * 
 */
public class ValidateFloat {
        String errors = "";
         StringBuilder stringBuilder = new StringBuilder(errors);

    public boolean validate(String number) {
        try {
            // checking valid float using parseFloat() method 
            Float.parseFloat(number);
            return true;
        } catch (NumberFormatException e) {
            //If the input is not float 
            return false;
        }

    }

    public String getErrorMessages(String input) {

        List<Integer> dotIndexes = this.searchIndexes(input, ".");
        if (dotIndexes.size() > 1) //checking multiple dots
        {
            this.stringBuilder.append("\n" + "Invalid format: Multiple points detected at index " + dotIndexes);
        }
        if (input.indexOf('E') < input.indexOf('.'))// checking if char 'E' come before char '.'
        {
            this.stringBuilder.append("\n" + "The Character 'E' shouldn't come before the character '.'");
        }
        List<Integer> EIndexes = this.searchIndexes(input, "E");
        if (EIndexes.size() > 1) //checking for multiple 'E'
        {
            this.stringBuilder.append("\n" + "Invalid format: Multiple E detected at index " + EIndexes);
        }
        if (EIndexes.size() == 1)// checking for the character that came after 'E'
        {
            int indexOfE;
            indexOfE = input.indexOf('E');
            if (input.charAt(indexOfE++) == '-') {
                indexOfE++;
            }
            int i = indexOfE;
            for (; i < input.length(); i++) {
                if (input.charAt(i) < '0' || input.charAt(i) >= '9') {
                    this.stringBuilder.append("\n" + "Invalid format:" + input.charAt(i) + " is not a valid character after 'E' at position " + i);
                }
            }
        }
        //checking invalid chars inside the input string
        this.invalidCharsChecker(input);
       //Finally perform System validation errors
        try {
            // checking valid float using parseFloat() method 
         Float.parseFloat(input);
        } catch (NumberFormatException e) {
            //If the input is not float 
            this.stringBuilder.append("\n"+"System Validation error: "+e);
        }
        return this.stringBuilder.toString();
    }
    //a methods used to check chars inside the string
    private void invalidCharsChecker(String input){
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) != 'E') && (input.charAt(i) != '.') && (input.charAt(i) != '-') && !((input.charAt(i) >= '0') && (input.charAt(i) <= '9'))) {
                this.stringBuilder.append("\n" + "Invalid format:" + input.charAt(i) + " is not a valid character at position " + i);
            }
        }
    }

    //method used to search indexes from a string
    private List<Integer> searchIndexes(String searchString, String searchKey) {
        int index = searchString.indexOf(searchKey);
        List<Integer> indexList = new ArrayList<>();
        while (index >= 0) {
            indexList.add(index);
            index = searchString.indexOf(searchKey, index + 1);
        }
        return indexList;
    }

    private List<Integer> searchIndexes(String searchString, String searchKey, int from) {
        int index = searchString.indexOf(searchKey, from);
        List<Integer> indexList = new ArrayList<>();
        while (index >= 0) {
            indexList.add(index);
            index = searchString.indexOf(searchKey, index + 1);
        }
        return indexList;
    }
}
