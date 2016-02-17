package br.grupointegrado.musictheory;

import java.util.List;

/**
 *
 * @author bhpachulski
 */
public class Tonalidade {

    private Nota nota;
    private Acidente acidente = Acidente.NATURAL;
    private List<Variacao> variacao;

    public Tonalidade(Nota nota) {
        this.nota = nota;
    }
    
    public Tonalidade(Nota nota, Acidente acidente, List<Variacao> variacao) {
        this.nota = nota;
        this.acidente = acidente;
        this.variacao = variacao;
    }

    public Tonalidade(Nota nota, Acidente acidente) {
        this.nota = nota;
        this.acidente = acidente;
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
        
        if (variacao == null)
            return representacao;
        
        for (Variacao v : variacao) 
            representacao += v.getRepresentação();
        
        return representacao;
    }
    
    @Override
    public String toString() {
        return this.getNota() + this.getAcidente().getRepresentação() + this.getVariacaoRepresentacao();
    }
    
}
