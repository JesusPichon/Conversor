package com.conversor;

import com.conversor.divisas.*;
import com.conversor.grados.Celsius;
import com.conversor.grados.Fahrenheit;
import com.conversor.grados.Grados;
import com.conversor.grados.Kelvin;

import java.util.ArrayList;
import java.util.List;

public class Conversor {

    private String[] listaOpcionesMoneda;
    private String[] listaOpcionesGrados;
    private List<Divisa> listaDivisas;
    private List<Grados> listaGrados;

    public Conversor() {

        //Lista de divisas
        this.listaDivisas = new ArrayList<Divisa>();
        this.listaDivisas.add(new Dolar());
        this.listaDivisas.add(new Euro());
        this.listaDivisas.add(new Libra());
        this.listaDivisas.add(new Won());
        this.listaDivisas.add(new Yen());

        //Lista de strings que almacena las opciones que se pueden elegir
        listaOpcionesMoneda = new String[listaDivisas.size() * 2 ];

        //agregar opciones a la lista
        crearOpcionesMoneda();

        this.listaGrados = new ArrayList<>();
        this.listaGrados.add(new Fahrenheit(0));
        this.listaGrados.add(new Celsius(0));
        this.listaGrados.add(new Kelvin(0));

        listaOpcionesGrados = new String[listaGrados.size()];

        crearOpcionesGrados();
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

    private void crearOpcionesGrados(){
        int posicion = 0;
        for (Grados grado: listaGrados){
            listaOpcionesGrados[posicion] = grado.getNombre();
            posicion++;
        }
    }

    public List<Divisa> getDivisas() {
        return listaDivisas;
    }

    public void setDivisa(List<Divisa> listaDivisas) {
        this.listaDivisas = listaDivisas;
    }

    public List<Divisa> getListaDivisas() {
        return listaDivisas;
    }

    public void setListaDivisas(List<Divisa> listaDivisas) {
        this.listaDivisas = listaDivisas;
    }

    public List<Grados> getListaGrados() {
        return listaGrados;
    }

    public void setListaGrados(List<Grados> listaGrados) {
        this.listaGrados = listaGrados;
    }

    public String[] getOpcionesDivisas(){
        return this.listaOpcionesMoneda;
    }

    public String[] getListaOpcionesGrados(){
        return listaOpcionesGrados;
    }
}
