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
    
    private Map<Grau, Intervalo> campoHarmonicoMaiorIntervalo = new TreeMap<>();
    private Map<Grau, ArrayList<Variacao>> campoHarmonicoMaiorVariacao = new TreeMap<>();
    
    public Map<Grau, NotaAcidente> grauNotaAcidente = new TreeMap<>();
    
    private Nota tonica;

    public CampoHarmonicoImpl(Nota tonica) {
        
        this.tonica = tonica;
        
        campoHarmonicoMaiorIntervalo.put(Grau.I,   Intervalo.TOM);
        campoHarmonicoMaiorIntervalo.put(Grau.II,  Intervalo.TOM);
        campoHarmonicoMaiorIntervalo.put(Grau.III, Intervalo.SEMITOM);
        campoHarmonicoMaiorIntervalo.put(Grau.IV,  Intervalo.TOM);
        campoHarmonicoMaiorIntervalo.put(Grau.V,   Intervalo.TOM);
        campoHarmonicoMaiorIntervalo.put(Grau.VI,  Intervalo.TOM);
        campoHarmonicoMaiorIntervalo.put(Grau.VII, Intervalo.SEMITOM);
        
        campoHarmonicoMaiorVariacao.put(Grau.I,   new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoMaiorVariacao.put(Grau.II,  new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoMaiorVariacao.put(Grau.III, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoMaiorVariacao.put(Grau.IV,  new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoMaiorVariacao.put(Grau.V,   new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
        campoHarmonicoMaiorVariacao.put(Grau.VI,  new ArrayList<>(Arrays.asList(Variacao.MENOR)));
        campoHarmonicoMaiorVariacao.put(Grau.VII, new ArrayList<>(Arrays.asList(Variacao.MENOR, Variacao.DIM)));
        
        setCampoHarmonicoTonica ();
    }
    
    public void setCampoHarmonicoTonica () {
        
        int currentElement = Nota.getPosicaoNota(tonica);
        int valorNotaNoGrau = 0;
        
        for (Grau grau : Grau.values()) {
            
            if (currentElement > 6)
                currentElement = 0;
            
            grauNotaAcidente.put(grau, new NotaAcidente(Nota.values()[currentElement], this.getAcidente(valorNotaNoGrau), campoHarmonicoMaiorVariacao.get(grau)));
            
            int intervaloDoGrau = campoHarmonicoMaiorIntervalo.get(grau).getValor();
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
        return campoHarmonicoMaiorIntervalo;
    }
    
    public int getValorGrau (Grau grau) {
        int valor=0;
        
        for (Map.Entry<Grau, Intervalo> entry : campoHarmonicoMaiorIntervalo.entrySet()) {
            
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
