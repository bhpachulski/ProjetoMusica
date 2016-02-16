package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.CampoHarmonicoMaior;
import br.grupointegrado.musictheory.Nota;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoMaior campoC = new CampoHarmonicoMaior(Nota.C);
        System.out.println(campoC.grauNotaAcidente);
        
        CampoHarmonicoMaior campoD = new CampoHarmonicoMaior(Nota.D);
        System.out.println(campoD.grauNotaAcidente);
        
        CampoHarmonicoMaior campoE = new CampoHarmonicoMaior(Nota.E);
        System.out.println(campoE.grauNotaAcidente);
        
        CampoHarmonicoMaior campoF = new CampoHarmonicoMaior(Nota.F);
        System.out.println(campoF.grauNotaAcidente);
        
        CampoHarmonicoMaior campoG = new CampoHarmonicoMaior(Nota.G);
        System.out.println(campoG.grauNotaAcidente);
        
        CampoHarmonicoMaior campoA = new CampoHarmonicoMaior(Nota.A);
        System.out.println(campoA.grauNotaAcidente);
        
        CampoHarmonicoMaior campoB = new CampoHarmonicoMaior(Nota.B);
        System.out.println(campoB.grauNotaAcidente);
        
        
        
    }
    
}
