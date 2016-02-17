package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.Acidente;
import br.grupointegrado.musictheory.CampoHarmonicoImpl;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;
import br.grupointegrado.musictheory.NotaAcidente;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoImpl campoC = new CampoHarmonicoImpl(new NotaAcidente(Nota.C, Acidente.NATURAL));
        System.out.println(campoC.grauNotaAcidente);
        System.out.println(campoC.getGrau(Grau.V));
        
        CampoHarmonicoImpl campoD = new CampoHarmonicoImpl(new NotaAcidente(Nota.D, Acidente.NATURAL));
        System.out.println(campoD.grauNotaAcidente);
        
        CampoHarmonicoImpl campoE = new CampoHarmonicoImpl(new NotaAcidente(Nota.E, Acidente.NATURAL));
        System.out.println(campoE.grauNotaAcidente);
        
        CampoHarmonicoImpl campoF = new CampoHarmonicoImpl(new NotaAcidente(Nota.F, Acidente.NATURAL));
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoImpl campoG = new CampoHarmonicoImpl(new NotaAcidente(Nota.G, Acidente.NATURAL));
        System.out.println(campoG.grauNotaAcidente);
        
        CampoHarmonicoImpl campoA = new CampoHarmonicoImpl(new NotaAcidente(Nota.A, Acidente.NATURAL));
        System.out.println(campoA.grauNotaAcidente);
        
        CampoHarmonicoImpl campoB = new CampoHarmonicoImpl(new NotaAcidente(Nota.B, Acidente.NATURAL));
        System.out.println(campoB.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCsus = new CampoHarmonicoImpl(new NotaAcidente(Nota.C, Acidente.SUSTENIDO));
        System.out.println(campoCsus.grauNotaAcidente);
        
        CampoHarmonicoImpl campoCb = new CampoHarmonicoImpl(new NotaAcidente(Nota.C, Acidente.BEMOL));
        System.out.println(campoCb.grauNotaAcidente);
        
        CampoHarmonicoImpl campoAb = new CampoHarmonicoImpl(new NotaAcidente(Nota.A, Acidente.BEMOL));
        System.out.println(campoAb.grauNotaAcidente);

        
    }
    
}
