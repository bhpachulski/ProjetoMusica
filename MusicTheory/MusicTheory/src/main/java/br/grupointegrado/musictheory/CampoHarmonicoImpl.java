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
    
    public Map<Grau, NotaAcidente> grauNotaAcidente = new TreeMap<>();
    
    private NotaAcidente tonica;
    private Escala escala = Diatonica.MAIOR;

    public CampoHarmonicoImpl(NotaAcidente tonica, Escala escala) {        
        this.tonica = tonica;        

        this.setCampoHarmonicoTonica ();
    }

    public CampoHarmonicoImpl(NotaAcidente tonica) {
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
            
            grauNotaAcidente.put(grau, new NotaAcidente(Nota.values()[currentElement], this.getAcidente(valorNotaNoGrau), this.escala.getVariacao().get(grau)));
            
            int intervaloDoGrau = escala.getIntervalo().get(grau).getValor();
            int intervaloDaNota = Nota.values()[currentElement].getIntervalo().getValor();
            valorNotaNoGrau += intervaloDaNota - intervaloDoGrau; 
            
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
        
        for (Map.Entry<Grau, Intervalo> entry : this.escala.getIntervalo().entrySet()) {
            
            valor += entry.getValue().getValor();
            
            if (grau == entry.getKey())
                break;
            
        }
        
        return valor;
    }

    @Override
    public NotaAcidente getGrau(Grau grau) {        
        return grauNotaAcidente.get(grau);        
    }
    
}
