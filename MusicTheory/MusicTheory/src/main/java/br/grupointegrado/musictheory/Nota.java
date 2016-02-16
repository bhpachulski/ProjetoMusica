package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public enum Nota {
    
    C, D, E, F, G, A, B;
    
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
}
