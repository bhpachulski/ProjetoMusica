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
public class Base {
    protected void cromaticScaleReorg(MusicApp musicApp, int paramNote)
    {   
        int tone = paramNote;
        
        int nextNote = tone;
        for(int i = 0; i < 12; i++)
        {
            musicApp.notesDinamic.get(i).note = musicApp.notesRoot.get(nextNote).note;
            
            if(nextNote == ((11 + tone) - tone))
                nextNote = 0;
            else
                nextNote++;
        }
    }
    
    protected void showDiatonicScale(MusicApp musicApp, String note)
    {
        this.cromaticScaleReorg(musicApp, this.convertRootNoteToIndex(note));
        
        for(int i = 0; i < 7; i++)
        {
            if(i > 2)
                System.out.print(musicApp.notesDinamic.get((musicApp.notesDinamic.get(i).currentIndex + musicApp.notesDinamic.get(i).currentIndex) - 1).note + " ");
            else
                System.out.print(musicApp.notesDinamic.get((musicApp.notesDinamic.get(i).currentIndex + musicApp.notesDinamic.get(i).currentIndex)).note + " ");
        }
    }
    
    protected void init(ArrayList<Note> notesDinamic, ArrayList<Note> notesRoot)
    {
        Note dinamicNote1 = new Note(0, "");
        notesDinamic.add(dinamicNote1);
        Note dinamicNote2 = new Note(1, "");
        notesDinamic.add(dinamicNote2);
        Note dinamicNote3 = new Note(2, "");
        notesDinamic.add(dinamicNote3);
        Note dinamicNote4 = new Note(3, "");
        notesDinamic.add(dinamicNote4);
        Note dinamicNote5 = new Note(4, "");
        notesDinamic.add(dinamicNote5);
        Note dinamicNote6 = new Note(5, "");
        notesDinamic.add(dinamicNote6);
        Note dinamicNote7 = new Note(6, "");
        notesDinamic.add(dinamicNote7);
        Note dinamicNote8 = new Note(7, "");
        notesDinamic.add(dinamicNote8);
        Note dinamicNote9 = new Note(8, "");
        notesDinamic.add(dinamicNote9);
        Note dinamicNote10 = new Note(9, "");
        notesDinamic.add(dinamicNote10);
        Note dinamicNote11 = new Note(10, "");
        notesDinamic.add(dinamicNote11);
        Note dinamicNote12 = new Note(11, "");
        notesDinamic.add(dinamicNote12);
        
        Note rootNote1 = new Note(0, "C");
        notesRoot.add(rootNote1);
        Note rootNote2 = new Note(1, "C#/Db");
        notesRoot.add(rootNote2);
        Note rootNote3 = new Note(2, "D");
        notesRoot.add(rootNote3);
        Note rootNote4 = new Note(3, "D#/Eb");
        notesRoot.add(rootNote4);
        Note rootNote5 = new Note(4, "E");
        notesRoot.add(rootNote5);
        Note rootNote6 = new Note(5, "F");
        notesRoot.add(rootNote6);
        Note rootNote7 = new Note(6, "F#/Gb");
        notesRoot.add(rootNote7);
        Note rootNote8 = new Note(7, "G");
        notesRoot.add(rootNote8);
        Note rootNote9 = new Note(8, "G#/Ab");
        notesRoot.add(rootNote9);
        Note rootNote10 = new Note(9, "A");
        notesRoot.add(rootNote10);
        Note rootNote11 = new Note(10, "A#/Bb");
        notesRoot.add(rootNote11);
        Note rootNote12 = new Note(11, "B");
        notesRoot.add(rootNote12);
    }

    protected int convertRootNoteToIndex(String note)
    {
        int index = 0;
        switch(note.toUpperCase())
        {
            case "C": index = 0;
                break;
            case "C#": index = 1;
                break;
            case "D": index = 2;
                break;
            case "D#": index = 3;
                break;
            case "E": index = 4;
                break;
            case "F": index = 5;
                break;
            case "F#": index = 6;
                break;
            case "G": index = 7;
                break;
            case "G#": index = 8;
                break;
            case "A": index = 9;
                break;
            case "A#": index = 10;
                break;
            case "B": index = 11;
                break;
            case "Db": index = 1;
                break;
            case "Eb": index = 3;
                break;
            case "Gb": index = 6;
                break;
            case "Ab": index = 8;
                break;
            case "Bb": index = 10;
                break;
        }
        return index;
    }
}
