import java.util.*;
/**
 *
 * @author Rachel
 */
public class Player implements Comparable<Player> {
    private String name;
    private int age;
    private int jerseyNumber;
    private Position position;
    
    public Player(String name, int age, int number, Position position){
        this.name = name;
        this.age = age;
        jerseyNumber = number;
        this.position = position; 
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    
    public Position getPosition(){
        return position;
    }
    
    public void setAge(){
        this.age = age;
    }
    
    public void setJerseyNumber(int number){
        jerseyNumber = number;
    }
    
    public void setPosition(Position position){
        this.position = position;
    }
    
    @Override
    public String toString(){
        return name + "\t" + age + "\t" + jerseyNumber + "\t" + position;
    }
    
    @Override
    public int compareTo(Player o){
     int comparedResult = position.compareTo(o.position);
     if (comparedResult == 0){
         if(jerseyNumber == o.jerseyNumber)
             return 0;
         else if (jerseyNumber > o.jerseyNumber)
             return 1;
         else
             return -1;
     } else if (comparedResult < 0){
         return -1;
     } else {
         return 1;
     }
    }
}
