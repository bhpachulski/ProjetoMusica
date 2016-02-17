package br.grupointegrado.musictheory.escala;

import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Intervalo;
import br.grupointegrado.musictheory.Variacao;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author bhpachulski
 */
public interface Escala {
    
    Map<Grau, Intervalo> getIntervalo ();
    
    Map<Grau, ArrayList<Variacao>> getVariacao ();
    
}
