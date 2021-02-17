
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rachel
 */
public class Team {
    String name;
    String city;
    ArrayList<Player> players;
    
    public Team(String name, String city){
        this.name = name;
        this.city = city;
        players = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    public void setPlayers(ArrayList<Player> players){
        this.players = players;
    }
    
    public void addPlayer(Player p){
        players.add(p);
    }
    
    public void sortPlayers(){
        Collections.sort(players);
    }
    
    @Override
    public String toString(){
        String playersList = "";
        playersList += name + "\n" + city;
        playersList += "\nPLAYERS\n";
        
        for(Player player : players){
            playersList += player.toString() + "\n";
        }
        
        return playersList;
    }
}
