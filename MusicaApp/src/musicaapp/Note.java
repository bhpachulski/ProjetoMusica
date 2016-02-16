/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicaapp;

/**
 *
 * @author José Augusto Braz
 */
public class Note {
    int currentIndex;
    String note;
    
    public Note()
    {
    
    }
    
    public Note(int currentIndex, String note)
    {
        this.currentIndex = currentIndex;
        this.note = note;
    }
}
