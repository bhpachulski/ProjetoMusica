package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.Acidente;
import br.grupointegrado.musictheory.CampoHarmonicoImpl;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;
import br.grupointegrado.musictheory.NotaAcidente;
import br.grupointegrado.musictheory.escala.Diatonica;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoImpl campoC = new CampoHarmonicoImpl(new NotaAcidente(Nota.C), Diatonica.MAIOR);
        System.out.println(campoC.grauNotaAcidente);
        System.out.println(campoC.getGrau(Grau.V));
        
        CampoHarmonicoImpl campoD = new CampoHarmonicoImpl(new NotaAcidente(Nota.D), Diatonica.MAIOR);
        System.out.println(campoD.grauNotaAcidente);
        
        CampoHarmonicoImpl campoE = new CampoHarmonicoImpl(new NotaAcidente(Nota.E), Diatonica.MAIOR);
        System.out.println(campoE.grauNotaAcidente);
        
        CampoHarmonicoImpl campoF = new CampoHarmonicoImpl(new NotaAcidente(Nota.F), Diatonica.MAIOR);
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoImpl campoG = new CampoHarmonicoImpl(new NotaAcidente(Nota.G), Diatonica.MAIOR);
        System.out.println(campoG.grauNotaAcidente);
        
        CampoHarmonicoImpl campoA = new CampoHarmonicoImpl(new NotaAcidente(Nota.A), Diatonica.MAIOR);
        System.out.println(campoA.grauNotaAcidente);
        
        CampoHarmonicoImpl campoB = new CampoHarmonicoImpl(new NotaAcidente(Nota.B), Diatonica.MAIOR);
        System.out.println(campoB.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCsus = new CampoHarmonicoImpl(new NotaAcidente(Nota.C, Acidente.SUSTENIDO), Diatonica.MAIOR);
        System.out.println(campoCsus.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCb = new CampoHarmonicoImpl(new NotaAcidente(Nota.C, Acidente.BEMOL), Diatonica.MAIOR);
        System.out.println(campoCb.grauNotaAcidente);
        
        CampoHarmonicoImpl campoAb = new CampoHarmonicoImpl(new NotaAcidente(Nota.A, Acidente.BEMOL), Diatonica.MAIOR);
        System.out.println(campoAb.grauNotaAcidente);

        
    }
    
}
