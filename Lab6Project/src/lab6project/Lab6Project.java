/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6project;

/**
 * @author Rachel Taylor
 * @version 27 Oct 2020
 */
import java.util.ArrayList;
public class Lab6Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Alice", 1000));
        list.add(new Student("Keisha", 900, "CS", 3.5 ));
        list.add(new Student("Filepe", 901, "English", 3.2));
        list.add(new Professor("Jamika", 300, "CS", 101000));
        list.add(new Person("Tala", 1001));
        list.add(new Professor("Julio", 400, "Math", 85000));
        list.add(new Student("Huan", 902, "CS", 3.6));
        list.add(new Student("Hank", 903, "Engineering", 3.9));
        list.add(new Student("Mike", 904, "Math", 2.8));
        list.add(new Professor("Azzari", 500, "CS", 100000));
        list.add(new Professor("Juan", 600, "CS", 980000));
        
        // Part C:
        // for (Person p: list){
        // System.out.println(p);
        // }
        
        // Part D: Step 3
        // for (Person p: list){
        // if(matchId(p, 903)){
        // System.out.println(p);}
        // }
        
        // Part E: Step 1
        // Person p = new Student("Keisha", 900, "CS", 3.5);
        // System.out.pritnln(((Student)p).getGpa());
        // Person p = new Person("Bob", 900);
        // if(p instanceof Student){
        // System.out.println(((Student)p).getGpa());
        // }
        
        // Part E: Step 8
        System.out.println("Scholarship Names:");
        for(Person p: list){
            if(p instanceof Student){
                if(((Student) p).getGpa() > 3.5){
                    System.out.println(p.getName());
                }
            }
        }
        
        // Part E: Step 10
        System.out.println("All Professors in CS Departnment: ");
        for(Person p : list){
            if(p instanceof Professor){
                if(((Professor) p).getDepartment().equals("CS")){
                    System.out.println(p.getName());
                }
            }
        }   
    }
    
    // Part D: Step 2
    public static boolean matchId(Person p, int id){
        if(p.getId() == id){
            return true;
        }else{
            return false;
        }
    }
}
