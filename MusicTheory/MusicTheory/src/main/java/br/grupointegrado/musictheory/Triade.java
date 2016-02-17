/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.grupointegrado.musictheory;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author i17411
 */
public enum Triade implements Acorde{
    
    MAIOR{
        
        public Map<Grau, Distancia> getIntervaloAcorde(){
        
            Map<Grau, Distancia> intervaloAcorde = new TreeMap<>();
            intervaloAcorde.put(Grau.I, Distancia.TOM);
            intervaloAcorde.put(Grau.III, Distancia.SEMITOM);
            intervaloAcorde.put(Grau.V, Distancia.TOM);
            
            return intervaloAcorde;
        } 
    }
}
