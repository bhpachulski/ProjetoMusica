package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.CampoHarmonicoImpl;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoImpl campoC = new CampoHarmonicoImpl(Nota.C);
        System.out.println(campoC.grauNotaAcidente);
        System.out.println(campoC.getGrau(Grau.V));
        
        CampoHarmonicoImpl campoD = new CampoHarmonicoImpl(Nota.D);
        System.out.println(campoD.grauNotaAcidente);
        
        CampoHarmonicoImpl campoE = new CampoHarmonicoImpl(Nota.E);
        System.out.println(campoE.grauNotaAcidente);
        
        CampoHarmonicoImpl campoF = new CampoHarmonicoImpl(Nota.F);
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoImpl campoG = new CampoHarmonicoImpl(Nota.G);
        System.out.println(campoG.grauNotaAcidente);
        
        CampoHarmonicoImpl campoA = new CampoHarmonicoImpl(Nota.A);
        System.out.println(campoA.grauNotaAcidente);
        
        CampoHarmonicoImpl campoB = new CampoHarmonicoImpl(Nota.B);
        System.out.println(campoB.grauNotaAcidente);
        
        
        
    }
    
}
