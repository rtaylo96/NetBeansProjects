
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;


/**
 *
 * @author smcleo12
 */
public class PostGenerator {
    private final ArrayList<User> users;
    private final Random rng;
    
    private File[] images;
    private String[] captions;
    private String[] texts;
    
    public PostGenerator(ArrayList<User> users)
    {
        // Assign users field
        this.users = users; 
        
        // Instantiate the Random object
        rng = new Random();
        
        
        /*
        Get the images, image captions, and texts        
        */
        
        // Get the images
        File imageDirectory = new File("resources/images/");
        images = imageDirectory.listFiles();
        
        // Strip off the 1st one because that's the caption file
        images = Arrays.copyOfRange(images, 1, images.length);
        
        // Get the captions
        captions = new String[images.length];
        try {
            Scanner scan = new Scanner(new File("resources/images/captions.txt"));
            for(int i=0;i<captions.length;i++)
            {
                captions[i] = scan.nextLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        // Get the texts
        try {
            Scanner scan = new Scanner(new File("resources/text_posts.txt"));
            int count=0;
            while(scan.hasNextLine())
            {
                count++;
                scan.nextLine();
            }
            texts = new String[count];
            scan = new Scanner(new File("resources/text_posts.txt"));
            for(int i=0;i<count;i++)
            {
                texts[i] = scan.nextLine();
            }       
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public File[] getImages() {return images;}
    public void setImages(File[] images) {this.images = images;}

    public String[] getCaptions() {return captions;}
    public void setCaptions(String[] captions) {this.captions = captions;}
    
    public String[] getTexts() {return texts;}
    public void setTexts(String[] texts) {this.texts = texts;}

    
    
    
}
