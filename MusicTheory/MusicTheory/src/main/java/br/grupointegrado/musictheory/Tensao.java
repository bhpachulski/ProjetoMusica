package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public enum Tensao implements Intervalo {

    IX(9), XI(11), XIII(13);
    
    private int posicao;
    
    private static Map<Grau, Tensao> tensao;
    
    static {
        
        tensao = new TreeMap<>();
        
        tensao.put(Grau.II, Tensao.IX);
        tensao.put(Grau.IV, Tensao.XI);
        tensao.put(Grau.VI, Tensao.XIII);
    
    }

    private Tensao(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return posicao;
    }
    
}
