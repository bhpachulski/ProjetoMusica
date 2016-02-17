package br.grupointegrado.musictheory.escala;

import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Distancia;
import br.grupointegrado.musictheory.Variacao;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author bhpachulski
 */
public interface Escala {
    
    Map<Grau, Distancia> getDistancia ();
    
    Map<Grau, ArrayList<Variacao>> getVariacao ();
    
}
