package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.Acidente;
import br.grupointegrado.musictheory.CampoHarmonicoImpl;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;
import br.grupointegrado.musictheory.Acorde;
import br.grupointegrado.musictheory.escala.Diatonica;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoImpl campoC = new CampoHarmonicoImpl(new Acorde(Nota.C));
        System.out.println(campoC.grauNotaAcidente);
        System.out.println(campoC.getGrau(Grau.V));
        
        CampoHarmonicoImpl campoD = new CampoHarmonicoImpl(new Acorde(Nota.D));
        System.out.println(campoD.grauNotaAcidente);
        
        CampoHarmonicoImpl campoE = new CampoHarmonicoImpl(new Acorde(Nota.E));
        System.out.println(campoE.grauNotaAcidente);
        
        CampoHarmonicoImpl campoF = new CampoHarmonicoImpl(new Acorde(Nota.F));
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoImpl campoG = new CampoHarmonicoImpl(new Acorde(Nota.G));
        System.out.println(campoG.grauNotaAcidente);
        
        CampoHarmonicoImpl campoA = new CampoHarmonicoImpl(new Acorde(Nota.A));
        System.out.println(campoA.grauNotaAcidente);
        
        CampoHarmonicoImpl campoB = new CampoHarmonicoImpl(new Acorde(Nota.B));
        System.out.println(campoB.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCsus = new CampoHarmonicoImpl(new Acorde(Nota.C, Acidente.SUSTENIDO), Diatonica.MAIOR);
        System.out.println(campoCsus.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCb = new CampoHarmonicoImpl(new Acorde(Nota.C, Acidente.BEMOL), Diatonica.MAIOR);
        System.out.println(campoCb.grauNotaAcidente);
        
        CampoHarmonicoImpl campoAb = new CampoHarmonicoImpl(new Acorde(Nota.A, Acidente.BEMOL), Diatonica.MAIOR);
        System.out.println(campoAb.grauNotaAcidente);

        
    }
    
}
