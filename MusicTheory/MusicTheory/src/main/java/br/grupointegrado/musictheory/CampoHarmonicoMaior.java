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
        
        composicao.put(Grau.I,   Intervalo.TOM);
        composicao.put(Grau.II,  Intervalo.TOM);
        composicao.put(Grau.III, Intervalo.SEMITOM);
        composicao.put(Grau.IV,  Intervalo.TOM);
        composicao.put(Grau.V,   Intervalo.TOM);
        composicao.put(Grau.VI,  Intervalo.TOM);
        composicao.put(Grau.VII, Intervalo.SEMITOM);
        
        setCampoHarmonicoTonica ();
    }
    
    public void setCampoHarmonicoTonica () {
        
        int currentElement = Nota.getPosicaoNota(tonica);
        int valorNotaNoGrau = 0;
        
        for (Grau grau : Grau.values()) {
            
            if (currentElement > 6)
                currentElement = 0;
            
            grauNotaAcidente.put(grau, new NotaAcidente(Nota.values()[currentElement], this.getAcidente(valorNotaNoGrau)));
            
            int intervaloDoGrau = composicao.get(grau).getValor();
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
