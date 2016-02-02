package br.grupointegrado.musiclibrarytests;

import java.util.ArrayList;
import java.util.List;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
import org.jfugue.theory.Key;
import org.jfugue.theory.Note;
import org.jfugue.theory.Scale;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        List<String> notes = new ArrayList<>();
        notes.add("C");
        notes.add("D");
        notes.add("E");
        notes.add("F");
        notes.add("G");
        notes.add("A");
        notes.add("B");
        
        for (String note : notes) {
        
            Key base = new Key(new Note(note), Scale.MAJOR);

            ChordProgression cp = new ChordProgression("I ii iii IV V vi viio");

            Chord[] chords = cp.setKey(base).getChords();

            for (int i = 0; i < chords.length; i++) {
                System.out.print(chords[i] + ", ");
            }
            
            System.out.print("\n");
        
        }
        
    }

}
