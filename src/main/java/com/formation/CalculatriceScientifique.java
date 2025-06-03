package com.formation;

public class CalculatriceScientifique {
    private final ICalculette iCalculette;

    public CalculatriceScientifique(ICalculette iCalculette) {
        this.iCalculette = iCalculette;
    }
    public int carre (int nombre){
        return iCalculette.multiplier(nombre, nombre);
    }
}
