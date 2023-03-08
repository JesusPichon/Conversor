package com.conversor;

import com.conversor.divisas.*;
import com.conversor.grados.Grados;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

    private String[] listaOpcionesMoneda;
    private List<Divisa> listaDivisas;
    private List<Grados> listaConversorTemperatura;

    public Conversor() {

        this.listaDivisas = new ArrayList<Divisa>();
        this.listaDivisas.add(new Dolar());
        this.listaDivisas.add(new Euro());
        this.listaDivisas.add(new Libra());
        this.listaDivisas.add(new Won());
        this.listaDivisas.add(new Yen());

        listaOpcionesMoneda = new String[listaDivisas.size() * 2 ];

        crearOpcionesMoneda();

    }

    private void crearOpcionesMoneda(){
        int posicionLista = 0;
        for (Divisa moneda: listaDivisas){
            listaOpcionesMoneda[posicionLista] = "De pesos a " + moneda.getNombreDivisa();
            posicionLista++;
        }
        for (Divisa moneda: listaDivisas){
            listaOpcionesMoneda[posicionLista] = "De " + moneda.getNombreDivisa() + " a Pesos";
            posicionLista++;
        }
    }

    public int getIndexOpcion(String auxiliar){
        int contador = 0;
        boolean encontrado = false;
        for (int i = 0; i < listaOpcionesMoneda.length; i++) {
            if (listaOpcionesMoneda.equals(auxiliar)){
                encontrado = true;
                contador = i;
            }
        }

        if (encontrado == true){
            return contador;
        }else{
            return -1;
        }
    }

    public List<Divisa> getDivisas() {
        return listaDivisas;
    }

    public void setDivisa(List<Divisa> listaDivisas) {
        this.listaDivisas = listaDivisas;
    }

    public String[] getOpcionesDivisas(){
        return this.listaOpcionesMoneda;
    }
}
