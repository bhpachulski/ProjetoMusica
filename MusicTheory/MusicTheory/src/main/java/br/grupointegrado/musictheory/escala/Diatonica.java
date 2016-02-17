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

            Map<Grau, Distancia> distancia = new TreeMap<>();
            distancia.put(Grau.I, Distancia.TOM);
            distancia.put(Grau.II, Distancia.TOM);
            distancia.put(Grau.III, Distancia.SEMITOM);
            distancia.put(Grau.IV, Distancia.TOM);
            distancia.put(Grau.V, Distancia.TOM);
            distancia.put(Grau.VI, Distancia.TOM);
            distancia.put(Grau.VII, Distancia.SEMITOM);

            return distancia;
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

    },
    MENOR {

        @Override
        public Map<Grau, Distancia> getDistancia() {

            Map<Grau, Distancia> distancia = new TreeMap<>();
            distancia.put(Grau.I, Distancia.TOM);
            distancia.put(Grau.II, Distancia.SEMITOM);
            distancia.put(Grau.III, Distancia.TOM);
            distancia.put(Grau.IV, Distancia.TOM);
            distancia.put(Grau.V, Distancia.SEMITOM);
            distancia.put(Grau.VI, Distancia.TOM);
            distancia.put(Grau.VII, Distancia.TOM);

            return distancia;
        }

        @Override
        public Map<Grau, ArrayList<Variacao>> getVariacao() {
            Map<Grau, ArrayList<Variacao>> variacao = new TreeMap<>();

            variacao.put(Grau.I, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.II, new ArrayList<>(Arrays.asList(Variacao.MENOR, Variacao.MEIODIM)));
            variacao.put(Grau.III, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
            variacao.put(Grau.IV, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.V, new ArrayList<>(Arrays.asList(Variacao.MENOR)));
            variacao.put(Grau.VI, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));
            variacao.put(Grau.VII, new ArrayList<>(Arrays.asList(Variacao.MAIOR)));

            return variacao;
        }
    }
}
