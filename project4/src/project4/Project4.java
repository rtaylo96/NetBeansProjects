package project4;

import java.util.Scanner;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class Project4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String com;
        String name;
        String address;
        String newAdd;
        String oldAdd;
        MailForwardingSystem mailFwd = new MailForwardingSystem();
        do {
            com = input.nextLine();
            if (com.equals("ADD")) {
                //adds a new address to the forwarding list
                name = input.nextLine();
                oldAdd = input.nextLine();
                newAdd = input.nextLine();
                boolean add = mailFwd.add(name, oldAdd, newAdd);
                if (add != false) {
                    System.out.println("Added");
                } else {
                    System.out.println("Entry already exits");
                }
            } else if (com.equals("REMOVE")) {
                // removes an address from the forwarding list
                name = input.nextLine();
                oldAdd = input.nextLine();
                newAdd = input.nextLine();
                boolean remove = mailFwd.remove(name, oldAdd, newAdd);
                if (remove != false) {
                    System.out.println("Removed");
                } else {
                    System.out.println("No such entry");
                }
            } else if (com.equals("MAIL")) {
                name = input.nextLine();
                address = input.nextLine();
                System.out.println("" + mailFwd.mail(name, address));
            } else {
                System.out.println("Goodbye");
            }
        } while (!com.equals("QUIT"));
    }
}
