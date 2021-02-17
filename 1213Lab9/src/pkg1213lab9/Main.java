/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab9;

/**
 *
 * @author Rachel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StoryBookModel myModel = new StoryBookModel();
        StartFrame myStartFrame = new StartFrame(myModel);
        myStartFrame.setVisible(true);
    }
    
}
