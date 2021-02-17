/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1213lab7;

/**
 *
 * @author Rachel
 */
public class Page {
   private String[] lines;
    //getter
    public String[] getLines() {
        return lines;
    }
    //setter
    public void setLines(String[] lines) {
        this.lines = lines;
    }
    //constuctors
    public Page(int numLines) {
        lines = new String[numLines];
    }
    public Page(String[] l) {
        lines = l;
    } 
}
