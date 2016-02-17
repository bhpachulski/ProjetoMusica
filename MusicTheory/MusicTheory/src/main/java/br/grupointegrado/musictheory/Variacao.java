package br.grupointegrado.musictheory;

/**
 *
 * @author bhpachulski
 */
public enum Variacao {
    
    MAIOR(""), MENOR("m"), DIM("°"), SETIMA("7"), MEIODIM("b5");
    
    private String representação;

    private Variacao(String representação) {
        this.representação = representação;
    }

    public String getRepresentação() {
        return representação;
    }
}
