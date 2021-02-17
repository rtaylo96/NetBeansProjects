/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213fileio;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author Rachel
 */
public class Main {
    
    public static void copyFile(String fileName, String fileName2){
        try{
            File fileToCopy = new File(fileName);
            Scanner fileScnr = new Scanner(fileToCopy);
            PrintWriter fileToWrite = new PrintWriter(fileName2);
            while(fileScnr.hasNextLine()){
                String line = fileScnr.nextLine();
                System.out.println(line);
                fileToWrite.println(line);
            }
            fileScnr.close();
            fileToWrite.close();
        } catch (FileNotFoundException fnf){
            System.out.println("File Not Found. Make sure to at .txt at the end.");
            fnf.printStackTrace();
        }
    }
    
    public static void translateFile(String fileName, String fileName2){
        try{
           File fileToCopy = new File(fileName);
           Scanner fileScnr = new Scanner(fileToCopy);
           PrintWriter fileToWrite = new PrintWriter(fileName2);
           
           while(fileScnr.hasNextLine()){
               String line = fileScnr.nextLine();
               //Split the string into each word
               String[] words = line.split(" ");
               String pigLatin = "";
               for(int i = 0; i < words.length; i++){
                   if (i != words.length - 1){
                       char firstChar = words[i].charAt(0);
                       String tempStr = words[i].substring(1) + firstChar + "AY";
                       //System.out.println(tempStr);
                       pigLatin = pigLatin + tempStr + " ";
                   } else {
                       char firstChar = words[i].charAt(0);
                       String tempStr = words[i].substring(1) + firstChar + "AY";
                       pigLatin = pigLatin + tempStr;
                   }
                   System.out.println(pigLatin);
               }
               fileToWrite.println(pigLatin);
           }
           fileScnr.close();
           fileToWrite.close();
        } catch (FileNotFoundException fnf){
            System.out.println("File Not Found. Make sure to at .txt at the end.");
            fnf.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        copyFile("english.txt", "copy.txt");
        translateFile("english.txt", "piglatin.txt");
        
    }
    
}
