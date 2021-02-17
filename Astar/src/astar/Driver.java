/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astar;

/**
 *
 * @author Rachel Taylor
 * @version 26 October 2020
 */
import java.util.*;
import java.lang.*;

public class Driver {
    // Display the Node Grid
    public void displayNode(Node [][] d){
        System.out.println("   | 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14");
        System.out.println("________________________________________________");
        for(int i = 0; i < d.length; i++){
            System.out.print("\n");
            // checks the side's spacing 
            // and adds an extra space if it is a single digit
            if(i < 10)
                System.out.print(i + "  | ");
            else
                System.out.print(i + " | ");
            // travels and gets the value of type for the node
            for(int j = 0; j < d[0].length; j++){
                System.out.print(d[i][j].getType() + " ");
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    // makes 10% of each node unaccessible
    public void set10percent(int [][] b){
        Random rand = new Random();
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++){
                float chance = rand.nextFloat();
                if(chance <= 0.10f){
                    // Add one
                    b[i][j] = 1;
                }
            }
        }
    }
    
    // transfers array into nodes
    public void writeToNode(int [][] a, Node [][] b){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
              b [i][j] = new Node(i, j, a[i][j]);             
            }
        }
    }
    
    // begins the grid by getting the starting node
    public Node getStart(Node[][] b){
        Scanner in = new Scanner(System.in);
        System.out.println("\nUsing the row and column numbers, \n" +
                "Please enter the Starting node " +
                "seperated by space. \nExample: \"2 3\" for Row: 2 Column: 3\n" +
                "_________________________________________________________\n");
        int Srow = in.nextInt();
        int Scol = in.nextInt();
        b[Srow][Scol].setType(2); //sets the starting node to a value 2
        
        System.out.println("Your starting Node is: (" + Srow + ", " + Scol + ")\n");
        
        Node s = new Node(Srow, Scol, 2); // put the start node into start
        s.setG(0);
        s.setF();
        return s;
    }
    
    public Node getGoal(Node [][]b){
        Scanner in = new Scanner(System.in);
        // getting goal node
        System.out.println("\nUsing the row and column numbers, \n" +
                "Please enter the Goal node " + 
                "seperated by space. \nExample: \"2 3\" for Row: 2 Column: 3\n" +
                "_________________________________________________________\n");
        
        int row = in.nextInt();
        int col = in.nextInt();
        b[row][col].setType(3);
        
        System.out.println("\nUSING \"2\" AS OUR START NODE AND \"3\" AS OUR GOAL NODE\n" +
                "\"0\" represents the walkable areas and \"1\" reprsents the blocks");
        System.out.println("Your Goal Node is: (" + row + ", " + col + ")\n");
        
        Node g = new Node(row, col, 3); // the end node is the goal
        g.setF();
        return g;
    }
    
    public static void getHeuristic(Node [][]b, Node g){
        // getting the heuristic
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[0].length; j++){
                b[i][j].setH((10*(Math.abs(i-g.getRow()))) + (10*(Math.abs(j-g.getCol()))));
            }
        }
    }
    
    public void displayHeuristic(Node [][]d){
        System.out.println("\nThis is a grid of the heuristics");
        for(int i = 0; i < d.length; i++){
            System.out.println();
            // Checking the spacing and adding an extra space if it is a single digit
            if(i < 10)
                System.out.print(i + "  | ");
            else
                System.out.print(i + " | ");
            
            //travels and gets the type of value for the node
            for(int j = 0; j < d[0].length; j++){
                if((d[i][j].getH() >= 10) && (d[i][j].getH() <= 90)){
                    System.out.print(d[i][j].getH() + "  ");
                }else if(d[i][j].getH() < 10){
                    System.out.print(d[i][j].getH() + "  ");
                }else{
                    System.out.print(d[i][j].getH() + "  ");
                }
                System.out.print("  ");
            }
        }
        System.out.println("\n");
    }
    
    // checks to see if the node is in the list
    public static Node checkinList(Node node, ArrayList<Node> list){
        for(int i = 0; i < list.size(); i++){
          if(list.get(i).equals(node)){
              return list.get(i);
          }
        }
        return null;
    }
    
    // sorts the list for the node with the lowest F
    public static void sort(ArrayList<Node> slist){
        int lowestF; Node tempNode;
        for(int i = 0; i < slist.size(); i++){
            lowestF = i; // sets the lowest value possible
            // loops through the list
            int b = slist.size() - 1;
            for(int id = i; id < b; id++){
                // starts from top to bottom
                if(slist.get(id + 1).getF() < slist.get(lowestF).getF()){
                    // searches for lowest F
                    lowestF = id + 1;
                }
            }
            tempNode = slist.get(i);
            slist.set(i, slist.get(lowestF));
            slist.set(lowestF, tempNode);    
        }
    }
}
