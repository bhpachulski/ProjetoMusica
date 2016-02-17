package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.Acidente;
import br.grupointegrado.musictheory.CampoHarmonicoImpl;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;
import br.grupointegrado.musictheory.Triade;
import br.grupointegrado.musictheory.Tonalidade;
import br.grupointegrado.musictheory.escala.Diatonica;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoImpl campoC = new CampoHarmonicoImpl(new Tonalidade(Nota.C));
        System.out.println(campoC.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoD = new CampoHarmonicoImpl(new Tonalidade(Nota.D));
//        System.out.println(campoD.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoE = new CampoHarmonicoImpl(new Tonalidade(Nota.E));
//        System.out.println(campoE.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoF = new CampoHarmonicoImpl(new Tonalidade(Nota.F));
//        System.out.println(campoF.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoG = new CampoHarmonicoImpl(new Tonalidade(Nota.G));
//        System.out.println(campoG.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoA = new CampoHarmonicoImpl(new Tonalidade(Nota.A));
//        System.out.println(campoA.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoB = new CampoHarmonicoImpl(new Tonalidade(Nota.B));
//        System.out.println(campoB.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoCsus = new CampoHarmonicoImpl(new Tonalidade(Nota.C, Acidente.SUSTENIDO), Diatonica.MAIOR);
//        System.out.println(campoCsus.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoCb = new CampoHarmonicoImpl(new Tonalidade(Nota.C, Acidente.BEMOL), Diatonica.MAIOR);
//        System.out.println(campoCb.grauNotaAcidente);
//        
//        CampoHarmonicoImpl campoAb = new CampoHarmonicoImpl(new Tonalidade(Nota.A, Acidente.BEMOL), Diatonica.MAIOR);
//        System.out.println(campoAb.grauNotaAcidente);
    }
    
}
