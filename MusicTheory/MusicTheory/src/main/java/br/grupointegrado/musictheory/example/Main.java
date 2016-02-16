package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.CampoHarmonicoMaior;
import br.grupointegrado.musictheory.Nota;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoMaior campoF = new CampoHarmonicoMaior(Nota.F);
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoMaior campoE = new CampoHarmonicoMaior(Nota.E);
        System.out.println(campoE.grauNotaAcidente);
        
    }
    
}
