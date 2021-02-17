/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab7;
import java.util.ArrayList;

/**
 *
 * @author Rachel
 */
public class BookChapter {
    //fields
    private int linesPerPage;
    private ArrayList<Page> pages;
    private String title;
    private String author;
    
    //constructors
    public BookChapter(int i) {
        this.linesPerPage = i;
    }
    public BookChapter(int i, ArrayList<Page> p) {
        this.linesPerPage = i;
        this.pages=p;
    }
    public BookChapter(int i, ArrayList<Page> p,String t, String a) {
        this.linesPerPage = i;
        this.pages = p;
        this.title = t;
        this.author = a;
    }
    
    //getter
    public int getLinesPerPage(){
        return linesPerPage;
    }
    
    public ArrayList<Page> getPages(){
        return pages;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
       return author; 
    }
    
    //setter
    public void setLinesPerPage(int linesPerPage) {
        this.linesPerPage=linesPerPage;
    }
    public void setPages(ArrayList<Page> pages) {
        this.pages=pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    
     //toString
    public String toString() {
        String result="";
        result +="Title: "+this.title+"\n";
        result +="Author: "+this.author+"\n";
        result +="Pages: "+this.pages.size()+"\n";
        result +="Lines per page: "+this.linesPerPage+"\n";
        return result;
    }   
}
