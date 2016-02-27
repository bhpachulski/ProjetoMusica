package br.grupointegrado.musictheory;

import br.grupointegrado.musictheory.escala.Diatonica;
import br.grupointegrado.musictheory.escala.Escala;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public class CampoHarmonicoImpl implements CampoHarmonico {
    
    public Map<Grau, Tonalidade> grauNotaAcidente = new TreeMap<>();
    private Tonalidade tonica;
    private Escala escala = Diatonica.MAIOR;

    public CampoHarmonicoImpl(Tonalidade tonica, Escala escala) {        
        this.tonica = tonica;        

        this.setCampoHarmonicoTonica ();
    }

    public CampoHarmonicoImpl(Tonalidade tonica) {
        this.tonica = tonica;
        
        this.setCampoHarmonicoTonica ();
    }
    
    public void setCampoHarmonicoTonica () {
        
        int currentElement = Nota.getPosicaoNota(tonica.getNota());
        
        //natural
        int valorNotaNoGrau = 0;
        
        if (tonica.getAcidente() == Acidente.SUSTENIDO)
            valorNotaNoGrau = -1;
        else if (tonica.getAcidente() == Acidente.BEMOL)
            valorNotaNoGrau = 1;
        
        for (Grau grau : Grau.values()) {
            
            if (currentElement > 6)
                currentElement = 0;
            
            grauNotaAcidente.put(grau, new Tonalidade(Nota.values()[currentElement], this.getAcidente(valorNotaNoGrau), this.escala.getVariacao().get(grau)));
            
            int distanciaDoGrau = escala.getDistancia().get(grau).getValor();
            int distanciaDaNota = Nota.values()[currentElement].getDistancia().getValor();
            valorNotaNoGrau += distanciaDaNota - distanciaDoGrau; 
            
            currentElement++;
        }  
        
    }
    
    public Acidente getAcidente (int valor) {
        if (valor > 0)
            return Acidente.BEMOL;
        else if (valor < 0 )
            return Acidente.SUSTENIDO;
                    
        return Acidente.NATURAL;
    }

    public int getValorGrau (Grau grau) {
        int valor=0;
        
        for (Map.Entry<Grau, Distancia> entry : this.escala.getDistancia().entrySet()) {
            
            valor += entry.getValue().getValor();
            
            if (grau == entry.getKey())
                break;
            
        }
        
        return valor;
    }

    @Override
    public Tonalidade getGrau(Grau grau) {        
        return grauNotaAcidente.get(grau);        
    }
    
}
