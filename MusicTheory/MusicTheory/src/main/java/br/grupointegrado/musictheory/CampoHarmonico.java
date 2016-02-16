package br.grupointegrado.musictheory;

import java.util.Map;

/**
 *
 * @author bhpachulski
 */
public interface CampoHarmonico {

    public Map<Grau, Intervalo> getComposicao();
    
    public NotaAcidente getGrau (Grau grau);
    
}
