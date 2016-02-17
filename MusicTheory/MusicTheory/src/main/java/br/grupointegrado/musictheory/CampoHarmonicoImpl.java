package br.grupointegrado.musictheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public class CampoHarmonicoImpl implements CampoHarmonico {
    
    private Map<Grau, Intervalo> campoHarmonicoIntervalo = new TreeMap<>();
    private Map<Grau, ArrayList<Variacao>> campoHarmonicoVariacao = new TreeMap<>();
    
    public Map<Grau, NotaAcidente> grauNotaAcidente = new TreeMap<>();
    
    private NotaAcidente tonica;

    public CampoHarmonicoImpl(NotaAcidente tonica) {
        
        this.tonica = tonica;
        
        campoHarmonicoIntervalo.put(Grau.I,   Intervalo.TOM);
        campoHarmonicoIntervalo.put(Grau.II,  Intervalo.TOM);
        campoHarmonicoIntervalo.put(Grau.III, Intervalo.SEMITOM);
        campoHarmonicoIntervalo.put(Grau.IV,  Intervalo.TOM);
        campoHarmonicoIntervalo.put(Grau.V,   Intervalo.TOM);
        campoHarmonicoIntervalo.put(Grau.VI,  Intervalo.TOM);
        campoHarmonicoIntervalo.put(Grau.VII, Intervalo.SEMITOM);
        
        campoHarmonicoVariacao.put(Grau.I,   new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoVariacao.put(Grau.II,  new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoVariacao.put(Grau.III, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoVariacao.put(Grau.IV,  new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoVariacao.put(Grau.V,   new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoVariacao.put(Grau.VI,  new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoVariacao.put(Grau.VII, new ArrayList<>(Arrays.asList(Variacao.MENOR, Variacao.DIM)));
        
        setCampoHarmonicoTonica ();
    }
    
    public void setCampoHarmonicoTonica () {
        
        int currentElement = Nota.getPosicaoNota(tonica.getNota());
        
        int valorNotaNoGrau = 0;
        
        if (tonica.getAcidente() == Acidente.SUSTENIDO)
            valorNotaNoGrau = -1;
        else if (tonica.getAcidente() == Acidente.BEMOL)
            valorNotaNoGrau = 1;
        
        for (Grau grau : Grau.values()) {
            
            if (currentElement > 6)
                currentElement = 0;
            
            grauNotaAcidente.put(grau, new NotaAcidente(Nota.values()[currentElement], this.getAcidente(valorNotaNoGrau), campoHarmonicoVariacao.get(grau)));
            
            int intervaloDoGrau = campoHarmonicoIntervalo.get(grau).getValor();
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

    @Override
    public Map<Grau, Intervalo> getComposicao() {
        return campoHarmonicoIntervalo;
    }
    
    public int getValorGrau (Grau grau) {
        int valor=0;
        
        for (Map.Entry<Grau, Intervalo> entry : campoHarmonicoIntervalo.entrySet()) {
            
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
