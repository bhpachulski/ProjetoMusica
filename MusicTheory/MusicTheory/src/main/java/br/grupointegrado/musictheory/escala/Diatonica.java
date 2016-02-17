package br.grupointegrado.musictheory.escala;

import br.grupointegrado.musictheory.Grau;
import br.grupointegrado.musictheory.Intervalo;
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
        public Map<Grau, Intervalo> getIntervalo() {

            Map<Grau, Intervalo> intervalo = new TreeMap<>();
            intervalo.put(Grau.I, Intervalo.TOM);
            intervalo.put(Grau.II, Intervalo.TOM);
            intervalo.put(Grau.III, Intervalo.SEMITOM);
            intervalo.put(Grau.IV, Intervalo.TOM);
            intervalo.put(Grau.V, Intervalo.TOM);
            intervalo.put(Grau.VI, Intervalo.TOM);
            intervalo.put(Grau.VII, Intervalo.SEMITOM);

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
