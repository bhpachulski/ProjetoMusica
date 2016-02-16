package br.grupointegrado.musictheory;

import java.util.List;

/**
 *
 * @author bhpachulski
 */
public class NotaAcidente {

    private Nota nota;
    private Acidente acidente;
    private List<Variacao> variacao;

    public NotaAcidente(Nota nota, Acidente acidente, List<Variacao> variacao) {
        this.nota = nota;
        this.acidente = acidente;
        this.variacao = variacao;
    }

    public Nota getNota() {
        return nota;
    }

    public Acidente getAcidente() {
        return acidente;
    }

    public List<Variacao> getVariacao() {
        return variacao;
    }
    
    public String getVariacaoRepresentacao() {
        
        String representacao = "";
        
        for (Variacao v : variacao) 
            representacao += v.getRepresentação();
        
        return representacao;
    }
    
    @Override
    public String toString() {
        return this.getNota() + this.getAcidente().getRepresentação() + this.getVariacaoRepresentacao();
    }
    
}
