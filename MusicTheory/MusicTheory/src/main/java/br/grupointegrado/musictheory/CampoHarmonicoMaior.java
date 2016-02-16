package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public class CampoHarmonicoMaior implements CampoHarmonico {
    
    private Map<Grau, Intervalo> composicao = new TreeMap<>();
    public Map<Grau, NotaAcidente> grauNotaAcidente = new TreeMap<>();
    
    private Nota tonica;

    public CampoHarmonicoMaior(Nota tonica) {
        
        this.tonica = tonica;
        
        composicao.put(Grau.I,   Intervalo.NULO);
        composicao.put(Grau.II,  Intervalo.TOM);
        composicao.put(Grau.III, Intervalo.TOM);
        composicao.put(Grau.IV,  Intervalo.SEMITOM);
        composicao.put(Grau.V,   Intervalo.TOM);
        composicao.put(Grau.VI,  Intervalo.TOM);
        composicao.put(Grau.VII, Intervalo.TOM);
        
        setCampoHarmonicoTonica ();
    }
    
    public void setCampoHarmonicoTonica () {
        
        int currentElement = Nota.getPosicaoNota(tonica);
        
        for (Grau grau : Grau.values()) {
            
            if (currentElement > 6)
                currentElement = 0;
                    
            grauNotaAcidente.put(grau, new NotaAcidente(Nota.values()[currentElement], Acidente.NATURAL));
            currentElement++;
            
        }
        
    }

    @Override
    public Map<Grau, Intervalo> getComposicao() {
        return composicao;
    }
    
    public int getValorGrau (Grau grau) {
        int valor=0;
        
        for (Map.Entry<Grau, Intervalo> entry : composicao.entrySet()) {
            
            valor += entry.getValue().getValor();
            
            if (grau == entry.getKey())
                break;
            
        }
        
        return valor;
    }

    @Override
    public NotaAcidente getGrau(Grau grau) {
        
        int valor = getValorGrau(grau);
        
        return new NotaAcidente(Nota.A, Acidente.SUSTENIDO);
    }
    
    
    
}
