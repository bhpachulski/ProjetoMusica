package br.grupointegrado.musictheory;

/**
 *
 * @author bhpachulski
 */
public enum Distancia {

    TOM(2), SEMITOM(1);
    
    private int valor;

    private Distancia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
