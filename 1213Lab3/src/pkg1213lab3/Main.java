/**
 * Lab 3 1213
 * 7 Oct 2020
 */
package pkg1213lab3;
import java.util.*;

/**
 * @author Rachel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student hakim = new Student();
        
        System.out.println(hakim.getFirstName());
        System.out.println(hakim.getMiddleInitial());
        System.out.println(hakim.getLastName());
        System.out.println(hakim.getStudentId());
        System.out.println(hakim.getAge());
        System.out.println(hakim.getLivesOnCampus());
        
        Student maria = new Student("Maria", 'L', "Garces",
                                    "800555555", 19, true, 20);
        
        System.out.println(maria.getFirstName());
        System.out.println(maria.getMiddleInitial());
        System.out.println(maria.getLastName());
        System.out.println(maria.getStudentId());
        System.out.println(maria.getAge());
        System.out.println(maria.getLivesOnCampus());
        
        Student torrance = new Student("Torrance", 'J', "DeLeon",
                                        "800234567", 19, false, 5);
        
        System.out.println("Object torrance first name is " + 
                            torrance.getFirstName());
        torrance.setFirstName("Michel");
        System.out.println("Object torrance first name is " + 
                            torrance.getFirstName());
        System.out.println("Object torrance middle initial is " +
                            torrance.getMiddleInitial());
        torrance.setMiddleInitial('T');
        System.out.println("Object torrance middle initial is " +
                            torrance.getMiddleInitial());
        System.out.println("Object torrance last name is " +
                            torrance.getLastName());
        torrance.setLastName("Harvey");
        System.out.println("Object torrance last name is " +
                            torrance.getLastName());
        System.out.println("Object torrance student id number is " +
                            torrance.getStudentId());
        torrance.setStudentId("801147921");
        System.out.println("Object torrance student id number is " +
                            torrance.getStudentId());
        System.out.println("Object torrance age is " +
                            torrance.getAge());
        torrance.setAge(21);
        System.out.println("Object torrance age is " +
                            torrance.getAge());
        System.out.println("Object torrance lives on campus is " +
                            torrance.getLivesOnCampus());
        torrance.setLivesOnCampus(true);
        System.out.println("Object torrance lives on campus is " +
                            torrance.getLivesOnCampus());
        
        Scanner input = new Scanner(System.in);
        Student s = new Student();
        String fName, lName, ID;
        char mInitial, choice;
        int age;
        boolean campus;
        double balance;
        System.out.println("What is your first name?");
        fName = input.nextLine();
        s.setFirstName(fName);
        System.out.println("What is your middle initial?");
        mInitial = input.next().charAt(0);
        s.setMiddleInitial(mInitial);
        input.nextLine();
        System.out.println("What is your last name?");
        lName = input.nextLine();
        s.setLastName(lName);
        System.out.println("What is your student id?");
        ID = input.nextLine();
        s.setStudentId(ID);
        System.out.println("What is your age?");
        age = input.nextInt();
        s.setAge(age);
        input.nextLine();
        System.out.println("Do you live on campus?(true or false)");
        campus = input.nextBoolean();
        s.setLivesOnCampus(campus);
        input.nextLine();
        System.out.println("What is the balance on your 49er card?");
        balance = input.nextDouble();
        System.out.println("Do you want to add to your balance?(Y/N)");
        choice = input.next().charAt(0);
        input.nextLine();
        while(choice == 'Y'){
         System.out.println("How much would you like to transfer to your card?");
         double amount = input.nextDouble();
         double newBal = balance + amount;
         s.transferToCard(newBal);
         System.out.println("Do you want to add more to your balance?(Y/N)");
         choice = input.next().charAt(0);
         input.nextLine();
        }
        System.out.println("Do you want to pay from your card?(Y/N)");
        choice = input.next().charAt(0);
        input.nextLine();
        while(choice == 'Y'){
         System.out.println("How much would you like to use?");
         double amount = input.nextDouble();
         s.payFromCard(amount);
         System.out.println("Do you want to pay more from your card?(Y/N)");
         choice = input.next().charAt(0);
         input.nextLine();
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Student Info:");
        System.out.println(s.getFirstName() + " " + s.getMiddleInitial() + " " +
                            s.getLastName());
        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Student's Age: " + s.getAge());
        System.out.println("Student lives on campus? " + s.getLivesOnCampus());
        System.out.println("Student's 49er Card Balance: $" + s.getBalance());
    }
    
}
