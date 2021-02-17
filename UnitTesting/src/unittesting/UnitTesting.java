/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

/**
 *
 * @author racta
 */
import java.util.Scanner;

public class UnitTesting {
    // Method returns origNum cubed 
    public int cubeNum(int origNum){
        return origNum * origNum * origNum;
    }
    
    public static void main(String[] args) {
        UnitTesting cubeTester = new UnitTesting();
        System.out.println("Testing started");
        
        System.out.println("2, expecting 8, got: " + cubeTester.cubeNum(2));
        System.out.println("3, expecting 27, got: " + cubeTester.cubeNum(3));
        System.out.println("-1, expecting -1, got: " + cubeTester.cubeNum(-1));
        
        System.out.println("Testing completed");
    }
    
}
