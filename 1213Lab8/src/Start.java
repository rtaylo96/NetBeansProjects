
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rachel
 */
public class Start {
    public static void main(String[] args){
        //Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
        //Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
        //Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
        //Team team = new Team("Hornets", "Charlotte");
        //team.addPlayer(p3);
        //team.addPlayer(p1);
        //team.addPlayer(p2);
        //System.out.println(team);
        //System.out.println("Sorting the players\n");
        //team.sortPlayers();
        //System.out.println(team);
        //{
        String inputFileName = "team.txt";
        Team team=loadTeamFromFile(inputFileName);
        if(team != null){          
            System.out.println(team);
        }
        
        team.sortPlayers();
        String outputFileName = "sortedteam.txt";
        writeTeamToFile(team, outputFileName);
    }
    
    public static Team loadTeamFromFile(String fileName){
        try{
            File myObj = new File(fileName);
            Scanner reader = new Scanner(myObj);
            String teamname = reader.nextLine();
            String city = reader.nextLine();
            Team team = new Team(teamname, city);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                // replace it with proper delimeter
                String delimeter = "";
                String[] playerData = line.split("\t");
                // int length = playerData.length;
                Player P = new Player(playerData[0], 
                        Integer.parseInt(playerData[1]), 
                        Integer.parseInt(playerData[2]), 
                        Position.valueOf(playerData[3]));
                team.addPlayer(P);
            }
            reader.close();
            return team;
        } catch (FileNotFoundException fnf){
            System.out.println("An error occurred.");
            return null;
        }
    }
    
    public static void writeTeamToFile(Team team, String fileName){
        try{
            // create a new file with fileName
            PrintWriter pw = new PrintWriter(fileName);
            // output the team name with a new line at the end to file
            pw.println(team.getName());
            // output the team city with a new line at the end to file
            pw.println(team.getCity());
            //get the list of players of the team
            ArrayList<Player> players = team.getPlayers();
            // loop over the arraylist from index 0 to second last player
            for(int i = 0; i < players.size() - 1; i++){
                // output ith player data using toString method of player
                // in which the fields are separated by a tab with a new line at the end
                pw.println(players.get(i).toString());
            }
            // output last player data using toString method of player in which
            // the fields are separated by a tab without a new line at the end
            if(players.size() > 0)
                pw.print(players.get(players.size()-1));
            pw.close(); 
        } catch (FileNotFoundException fnf){
            System.out.println("The file cannot be found.");
        }
    }
}
