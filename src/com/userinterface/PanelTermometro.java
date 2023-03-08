package com.userinterface;

import com.conversor.Conversor;


public class PanelTermometro extends MiPanel{
    public PanelTermometro(Conversor conversor) {
        super(conversor);
        this.getEtiquetaElige().setText("Elija el tipo de grados que deseas convertir:");
        this.getEtiquetaCantidad().setText("Ingresa la cantidad de grados que deseas convertir:");
    }

}
