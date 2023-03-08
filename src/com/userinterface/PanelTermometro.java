package com.userinterface;

import com.conversor.Conversor;


public class PanelTermometro extends MiPanel{
    public PanelTermometro(Conversor conversor) {
        super(conversor);

        getEtiquetaElige().setText("Elija el tipo de grados que deseas convertir:");
        getEtiquetaCantidad().setText("Ingresa la cantidad de grados que deseas convertir:");

        crearEventoBoton();
    }

    @Override
    public void crearMenu(Conversor conversor) {
        super.crearMenu(conversor);
    }

    @Override
    public void crearEventoBoton() {
        super.crearEventoBoton();
    }
}
