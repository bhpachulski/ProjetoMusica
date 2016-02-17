package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public enum Nota {
    
    C(Intervalo.TOM, "C"), D(Intervalo.TOM, "D"), E(Intervalo.SEMITOM, "E"), F(Intervalo.TOM, "F"), 
    G(Intervalo.TOM, "G"), A(Intervalo.TOM, "A"), B(Intervalo.SEMITOM, "B");
    
    private Intervalo intervalo;
    private String representacao;

    private Nota(Intervalo intervalo, String representacao) {
        this.intervalo = intervalo;
        this.representacao = representacao;
    }

    public String getRepresentacao() {
        return representacao;
    }

    public Intervalo getIntervalo() {
        return intervalo;
    }
    
    private static Map<Nota, Integer> posicaoNota = new TreeMap<>();
    
    static {
        posicaoNota.put(C, 0);
        posicaoNota.put(D, 1);
        posicaoNota.put(E, 2);
        posicaoNota.put(F, 3);
        posicaoNota.put(G, 4);
        posicaoNota.put(A, 5);
        posicaoNota.put(B, 6);
    }

    public static int getPosicaoNota(Nota nota) {
        return posicaoNota.get(nota);
    }

    @Override
    public String toString() {
        return this.getRepresentacao();
    }
        
}
