package br.grupointegrado.musictheory.escala;

import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Distancia;
import br.grupointegrado.musictheory.Variacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bhpachulski
 */
public enum Diatonica implements Escala {

    MAIOR {

        @Override
        public Map<Grau, Distancia> getDistancia() {

            Map<Grau, Distancia> intervalo = new TreeMap<>();
            intervalo.put(Grau.I, Distancia.TOM);
            intervalo.put(Grau.II, Distancia.TOM);
            intervalo.put(Grau.III, Distancia.SEMITOM);
            intervalo.put(Grau.IV, Distancia.TOM);
            intervalo.put(Grau.V, Distancia.TOM);
            intervalo.put(Grau.VI, Distancia.TOM);
            intervalo.put(Grau.VII, Distancia.SEMITOM);

            return intervalo;
        }

        @Override
        public Map<Grau, ArrayList<Variacao>> getVariacao() {
            Map<Grau, ArrayList<Variacao>> variacao = new TreeMap<>();

            variacao.put(Grau.I, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
            variacao.put(Grau.II, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.III, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.IV, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
            variacao.put(Grau.V, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
            variacao.put(Grau.VI, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.VII, new ArrayList<>(Arrays.asList(Variacao.MENOR, Variacao.MEIODIM)));

            return variacao;
        }

    }
}
