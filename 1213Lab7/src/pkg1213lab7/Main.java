/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab7;
import static pkg1213lab7.testBookChapterReadWrite.*;
import java.io.IOException;

/**
 *
 * @author Rachel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BookChapter book;
        String filename = "game_of_thrones_chapter_1.txt";
        book = loadBookChapterFromFile(filename);
        System.out.println(book.toString());
        String wFileName = "this is copy.txt";
        writeBookChapterToFile(book,wFileName);
    }
    
}
