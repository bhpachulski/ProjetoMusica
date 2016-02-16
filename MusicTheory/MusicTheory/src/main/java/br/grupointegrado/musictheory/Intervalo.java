package br.grupointegrado.musictheory;

/**
 *
 * @author bhpachulski
 */
public enum Intervalo {

    TOM(2), SEMITOM(1), NULO(0);
    
    private int valor;

    private Intervalo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
