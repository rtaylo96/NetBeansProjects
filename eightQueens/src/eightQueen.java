/**
 * Purpose: Using the hill-climbing algorithm to find a perfect eight by eight
 * board with eight queens in a position that does not endanger the queens.
 * @version 16 September 2020
 * @author Rachel Taylor
 */

import java.util.*;

public class eightQueen{
    final private int [][] board = new int [8][8];
    final private int [][] testBoard = new int [8][8];
    private boolean newBoard = true;
    private int conflict = 0;
    private int qLocation = 0;
    private int restart = 0;
    private int moves = 0;
    private int positions = 8;
    
    // initializes the board
    public eightQueen(){
      for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = 0;
            }
        }  
    }
    
    //randomizes the board
    public void randomBoard(){
        Random rand = new Random();
        int num;
        
        while(qLocation < 8){
            for(int i = 0; i < 8; i++){
                board[rand.nextInt(7)][i] = 1;
                qLocation++;
            }
        }
        conflict = heuristic(board);
    }
    
    //determines conflicts of rows
    public boolean rowConflict(int[][] test, int a){
        boolean found = false;
        int count = 0;
        
        for(int i = 0; i < 8; i++){
            if(test[i][a] == 1){
                count++;
            }
        }
        if(count > 1){
            found = true;
        }
        return found;
    }
    
    //determines conflicts of columns
    public boolean colConflict(int[][] test, int j){
        boolean found = false;
        int count = 0;
        
        for(int i = 0; i < 8; i++){
            if(test[j][i] == 1){
                count++;
            }
        }
        if(count > 1){
            found = true;
        }
        return found;
    }
    
    //determines conflicts of diagonal moves
    public boolean diaConflict(int[][] test, int a, int b){
        boolean found = false; 
        
        for(int i = 1; i < 8; i++){
            if (found){
                break;
            }
            
            if((a+i < 8) && (b+i < 8)){
                if(test[a+i][b+i] == 1){
                    found = true;
                }
            }
            if((a-i >= 0)&&(b-i >= 0)){
                if(test[a-i][b-i] == 1){
                    found = true;
                }
            }
            if((a+i < 8)&&(b-i >= 0)){
                if(test[a+i][b-i] == 1){
                    found = true;
                }
            }    
            if((a-i >= 0)&&(b+i < 8)){
                if(test[a-i][b+i] == 1){
                    found = true;
                }
            }
        }
        return found;
    }
    
    //Counts the queens in conflict and returns the number
    public int heuristic(int[][] test){
        int count = 0;
        boolean conRow;
        boolean conCol;
        boolean conDia;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(test[i][j] == 1){
                    conRow = rowConflict(test, j);
                    conCol = colConflict(test, i);
                    conDia = diaConflict(test, i, j);
                    
                    if(conRow || conCol || conDia){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    //moving the queen
    //determining to continue to a new state
    // or to summarize solution
    public void qMove(){
        int[][] hArray = new int[8][8];
        int numCol;
        int minCol;
        int minRow;
        int qPrevCol = 0;
        newBoard = false;
        
        while(true){
            numCol = 0;
            
            for(int i = 0; i < 8; i++){
                System.arraycopy(board[i], 0, testBoard[i], 0, 8);
            }
            while(numCol < 8){
                for(int i = 0; i < 8; i++){
                    testBoard[i][numCol] = 0;
                }
                for(int i = 0; i < 8; i++){
                    if(board[i][numCol] == 1){
                        qPrevCol = i;
                    }
                    testBoard[i][numCol] = 1;
                    hArray[i][numCol] = heuristic(testBoard);
                    testBoard[i][numCol] = 0;
                }
                testBoard[qPrevCol][numCol] = 1;
                numCol++;
            }
            
            if(detRestart(hArray)){
                qLocation = 0;
                for(int i = 0; i < 8; i++){
                    for(int j = 0; j < 8; j++){
                        board[i][j] = 0;
                    }
                }
                randomBoard();
                System.out.println("RESTART");
                restart++;
            }
            
            minCol = minimumCol(hArray);
            minRow = minimumRow(hArray);
            
            for(int i = 0; i < 8; i++){
                board[i][minCol] = 0;
            }
            
            board[minRow][minCol] = 1;
            moves++;
            conflict = heuristic(board);
            
            if(heuristic(board)== 0){
                System.out.println("\nCurrent State");
                for(int i = 0; i < 8; i++){
                    for (int j = 0; j < 8; j++){
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            System.out.println("Solution Found!");
            System.out.println("State changes: " + moves);
            System.out.println("Restarts: " + restart);
            break;
            }
            
            System.out.println("\n");
            System.out.println("Current h: " + conflict);
            System.out.println("Current State");
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 8; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Neighbors found with lower h: " + positions);
            System.out.println("Setting new current State");
        }
    }
    
    //minimum number of columns found
    public int minimumCol(int[][] test){
        int minCol = 8;
        int minVal = 8;
        int count = 0;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(test[i][j] < minVal){
                    minVal = test[i][j];
                    minCol = j;
                }
                if(test[i][j] < conflict){
                    count++;
                }
            }
        }
        positions = count;
        return minCol;
    }
    
    //minimum number of rows found
    public int minimumRow(int[][] test){
        int minRow = 8;
        int minVal = 8;
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(test[i][j] < minVal){
                    minVal = test[i][j];
                    minRow = i;
                }
            }
        }
        return minRow;
    }
    
    //determines if a restart is necessary
    public boolean detRestart(int[][] test){
       int minVal = 8;
       boolean restarting = false;
       
       for(int i = 0; i < 8; i++){
           for(int j = 0; j < 8; j++){
               if(test[i][j] < minVal){
                   minVal = test[i][j];
               }
           }
       }
       if(positions == 0){
           restarting = true;
       }
       return restarting;
    }
    
    //Main method creates object, initial random board and initiates state change
    public static void main(String[] args){
        eightQueen obj = new eightQueen();
        obj.randomBoard();
        obj.qMove();
    }
}   