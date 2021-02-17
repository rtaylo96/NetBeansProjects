/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab7;

import java.util.*;
import java.io.*;
/**
 *
 * @author Rachel
 */
public class testBookChapterReadWrite {
    public static BookChapter loadBookChapterFromFile(String filename)
    throws FileNotFoundException, IOException{
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        
        String title = scan.nextLine();
        String author = scan.nextLine();
        int linePerPage = scan.nextInt();
        ArrayList<Page> pages = new ArrayList<>();
        pages.add(new Page(linePerPage));
        pages.set(0,testBookChapterReadWrite.getPage(scan, linePerPage));
               
        BookChapter bookChapter = new BookChapter(linePerPage, pages, title, author);
        return bookChapter;
    }
    
    private static Page getPage(Scanner scanner, int numLines){
        ArrayList<String> lines = new ArrayList<String>();
        while(scanner.hasNextLine()){
            lines.add(scanner.nextLine());
        }
        String[] text = lines.toArray(new String[numLines]);
        Page pageGet = new Page(text);
        return pageGet;
    }
    
    public static void writeBookChapterToFile(BookChapter book, String filename)
    throws FileNotFoundException, IOException{
        File file = new File(filename);
        PrintWriter prn = new PrintWriter(file);
        
        prn.println(book.getTitle());
        prn.println(book.getAuthor());
        prn.println(book.getLinesPerPage());
        
        for(int i = 0; i < book.getPages().size(); i++){
            for(int j = 0; j < book.getPages().get(i).getLines().length; j++){
                prn.println(book.getPages().get(i).getLines()[j]);
            }
        }
        prn.close();
    }
}
