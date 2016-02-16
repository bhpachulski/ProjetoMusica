/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicaapp;

import java.util.ArrayList;

/**
 *
 * @author José Augusto Braz
 */
public class MusicApp {

    ArrayList<Note> notesDinamic = new ArrayList<>();
    ArrayList<Note> notesRoot = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    
    public MusicApp()
    {   
        Base base = new Base();
        base.init(notesDinamic, notesRoot);
    }
    
    public static void main(String[] args) {
        Base base = new Base();
        MusicApp musicApp = new MusicApp();
        
        base.showDiatonicScale(musicApp, "d");
    }    
}
