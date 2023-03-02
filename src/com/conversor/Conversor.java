package com.conversor;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

    private List<Divisa> listaDivisas;

    public Conversor() {
        this.listaDivisas = new ArrayList<Divisa>();
        this.listaDivisas.add(new Dolar());
        this.listaDivisas.add(new Euro());
        this.listaDivisas.add(new Libra());
        this.listaDivisas.add(new Won());
        this.listaDivisas.add(new Yen());
    }

    public List<Divisa> getDivisas() {
        return listaDivisas;
    }

    public void setDivisa(List<Divisa> listaDivisas) {
        this.listaDivisas = listaDivisas;
    }

    public String[] getOpcionesDivisas(){
        String[] lista  = new String[ 2 * listaDivisas.size()];
        int posicionLista = 0;
        for (Divisa moneda: listaDivisas){
            lista[posicionLista] = "De pesos a " + moneda.getNombreDivisa();
            posicionLista++;
        }
        for (Divisa moneda: listaDivisas){
            lista[posicionLista] = "De " + moneda.getNombreDivisa() + " a Pesos";
            posicionLista++;
        }
        return lista;
    }


}
