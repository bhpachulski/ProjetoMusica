package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public enum Nota {
    
    C(Distancia.TOM, "C"), D(Distancia.TOM, "D"), E(Distancia.SEMITOM, "E"), F(Distancia.TOM, "F"), 
    G(Distancia.TOM, "G"), A(Distancia.TOM, "A"), B(Distancia.SEMITOM, "B");
    
    private Distancia distancia;
    private String representacao;
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
    
    private Nota(Distancia distancia, String representacao) {
        this.distancia = distancia;
        this.representacao = representacao;
    }

    public String getRepresentacao() {
        return representacao;
    }

    public Distancia getDistancia() {
        return distancia;
    }

    public static int getPosicaoNota(Nota nota) {
        return posicaoNota.get(nota);
    }

    @Override
    public String toString() {
        return this.getRepresentacao();
    }   
}
