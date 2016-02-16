package br.grupointegrado.musictheory.example;

import br.grupointegrado.musictheory.CampoHarmonicoMaior;
import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Nota;

/**
 *
 * @author bhpachulski
 */
public class Main {

    public static void main(String[] args) {
        
        CampoHarmonicoMaior campo = new CampoHarmonicoMaior(Nota.E);
        
//        System.out.println(campo.getGrau(Grau.I));


        System.out.println(campo.grauNotaAcidente);
        
        System.out.println(campo.getValorGrau(Grau.II));
        
    }
    
}
