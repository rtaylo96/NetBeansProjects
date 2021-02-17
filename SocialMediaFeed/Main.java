
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author smcleo12
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /*
            1. Create some User objects...        
        */
        
        
        
        /*
            2. Put the User objects into an ArrayList        
        */
        
        /*
            3. Use your PostGenerator class to create posts from the users            
        */   
        
        
        /*
            Create the GUI window
            DO NOT ADD OR CHANGE CODE BELOW THIS POINT EXCEPT WHERE SPECIFIED        
        */
        Window myGUI = new Window();
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.pack();
        myGUI.setVisible(true);
        
        // ADD YOUR ARRAY OF POSTS AS AN ARGUMENT TO THIS METHOD CALL
        myGUI.displayPosts(       );
    }
    
}
