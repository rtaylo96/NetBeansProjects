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

public class Astar {
    
    // number of rows
    public static int row = 15;
    // number of columns
    public static int col = 15;
    // main board
    public static int [][] mainboard = new int [row][col];
    public static Node [][] node = new Node [row][col];
    public static Node start;
    public static Node goal;
    
    public static void main(String[] args) {
        Driver aStar = new Driver();
        aStar.set10percent(mainboard);
        aStar.writeToNode(mainboard, node);
        
        // gets the starting node
        start = aStar.getStart(node);
        // get the goal node
        goal = aStar.getGoal(node);
        
        aStar.getHeuristic(node, goal);
        aStar.displayNode(node);
        aStar.displayHeuristic(node);
        
        start.setG(0);
        start.setH(node[start.getRow()][start.getCol()].getH());
        start.setF();
        
        // make a copy of the current board to be use as a display path later
        Node [][] copy = new Node[row][col];
        
        for(int i = 0; i < node.length; i++){
            for(int j=0; j < node[0].length; j++){
                copy[i][j] = node[i][j];
            }
        }
        
        boolean continueSearching = true;
        
        // create an openList and a closeList array
        ArrayList<Node> openList = new ArrayList<>();
        ArrayList<Node> closedList = new ArrayList<>();
        
        // add the start node to the openList
        openList.add(start);
        System.out.println("Adding Node: " + start.toString() + " to the openList");
        
        while(continueSearching){
            // remove node from openList
            // remove the first element
            Node n = openList.remove(0);
            System.out.println("\nRemoving Node " + n.toString() + " from openList \n");
            
            //check if goal has been reached
            if(n.equals(goal)){
                System.out.println("Goal reached! Path has been found");
                System.out.println("This is the path: ");
                // if goal is reached boolean is set to false 
                // which exits the loop and stop searching
                continueSearching = false;
                
                while(!n.equals(start)){
                   System.out.print(n.getParent().toStringFinal());
                   // set parent to n
                   n = n.getParent();
                   copy[n.getRow()][n.getCol()].setType(8);
                }
            }else{
                // look for neighbors around node
                int nRow = n.getRow();
                int nCol = n.getCol();
                
                for(int i = nRow - 1; i <= nRow + 1; i++){
                    for(int j = nCol - 1; j <= nCol + 1; j++){
                        // travel and look for neighbors
                        if((i >= 0 && i < row) && (j >= 0 && j < row) && 
                                (i != nRow || j != nCol) && 
                                (node[i][j].getType() != 1)){
                            // this is the current node to get neighbors of
                            Node newNode = new Node(i, j, 0);
                            newNode.setParent(n);
                            int newG = 10;
                            // this is if it is moving either vertical or
                            // horizontal it adds a 10 for the G value
                            if(Math.abs(i-nRow) + Math.abs(j - nCol) == 2){
                                newG = 14;
                                // this is for diagonal it adds 14 to the G value
                            }
                            
                            newNode.setG(n.getG() + newG);
                            // this is the new G value
                            newNode.setH(node[start.getRow()][start.getCol()].getH());
                            // assigns the heuristic value to the node
                            newNode.setF();
                            // gets the new F value
                            
                            // checks to see if node is in closedList or not
                            if(aStar.checkinList(newNode, closedList) == null){
                                // check the newNode against the openlist 
                                // to see if it is present
                                Node sm = aStar.checkinList(newNode, openList);
                                if(sm == null){
                                    // if is not, add it
                                    openList.add(newNode);
                                    System.out.println("\nAdding Node: " + 
                                            newNode.toString() + " to List\n");
                                }else{
                                    // check the G value and if it is smaller
                                    if(newNode.getG() < sm.getG()){
                                        // it means that path is shorter
                                        sm.setG(newNode.getG());
                                        // so it repaths to that node and sets it as its new parent
                                        sm.setParent(n);
                                    }
                                }
                            }
                        }
                    }
                }
                aStar.sort(openList);
                closedList.add(n);
            }
        }
        System.out.println("This is a grid layout where \"8\" represents the path\n");
        // display the grid with the path.
        aStar.displayNode(copy);
    }
}
