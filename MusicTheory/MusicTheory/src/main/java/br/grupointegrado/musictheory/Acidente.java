package br.grupointegrado.musictheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bhpachulski
 */
public enum Acidente {

    SUSTENIDO("#"), BEMOL("b"), NATURAL("");
    
    private String representação;
    
    private static List<Integer> intervalos;
    
    static {
        intervalos = new ArrayList<>(Arrays.asList(2,4,7,9,11));
    }

    private Acidente(String representação) {
        this.representação = representação;
    }

    public String getRepresentação() {
        return representação;
    }

    public boolean isAcidente (int grau) {
        return intervalos.contains(grau);
    }
    
    public Acidente defineAcidente (Nota tom, int grau) {
        if (isAcidente(grau))
            return SUSTENIDO;
        else 
            return BEMOL;
    }
}
