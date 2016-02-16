package br.grupointegrado.musictheory;

/**
 *
 * @author bhpachulski
 */
public enum Grau {

    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7);
    
    private int posicao;

    private Grau(int posicao) {
        this.posicao = posicao;
    }

    public int getPosicao() {
        return posicao;
    }
    
}
