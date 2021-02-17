/*
 * Lab 3 1213
 * 7 Oct 2020
 */
package pkg1213lab3;

/**
 *
 * @author Rachel
 */
public class Student {
    private String firstName;
    private char middleInitial;
    private String lastName;
    private String studentId;
    private int age;
    private boolean livesOnCampus;
    private double balance;
    
    // No-Arg Constructor
    public Student(){
        firstName = "";
        middleInitial = 0;
        lastName = "";
        studentId = "";
        age = 0;
        livesOnCampus = false;
        balance = 0;
        
    }
    
    // Constructor
    public Student(String fName, char mInitial, String lName,
                    String ID, int sAge, boolean isLiveOnCampus, double bal){
        firstName = fName;
        middleInitial = mInitial;
        lastName = lName;
        studentId = ID;
        age = sAge;
        livesOnCampus = isLiveOnCampus;
        balance = bal;
    }
    
    // Getters
    public String getFirstName(){
        return firstName;
    }
    
    public char getMiddleInitial(){
        return middleInitial;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getStudentId(){
        return studentId;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean getLivesOnCampus(){
        return livesOnCampus;
    }
    
    public double getBalance(){
        return balance;
    }
    
    // Setters
    public void setFirstName(String fName){
        firstName = fName;
    }
    
    public void setMiddleInitial(char mInitial){
        middleInitial = mInitial;
    }
    
    public void setLastName(String lName){
        lastName = lName;
    }
    
    public void setStudentId(String ID){
        studentId = ID;
    }
    
    public void setAge(int sAge){
        age = sAge;
    }
    
    public void setLivesOnCampus(boolean isLiveOnCampus){
        livesOnCampus = isLiveOnCampus;
    }
    
    public void transferToCard(double amount){
        if (amount > 0){
            double newBal = balance + amount;
            balance = newBal;
            System.out.println("Your new balance is $" + getBalance());
        }
        else{
            System.out.println("The transfer amount muct be greater than 0");
        }
    }
    
    public void payFromCard(double amount){
        if (amount <= balance){
            double newBal = balance - amount;
            balance = newBal;
            System.out.println("Your new balance is $" + getBalance());
        }
        else{
            System.out.println("Sorry, your balance is too low!");
        }
    }
}
