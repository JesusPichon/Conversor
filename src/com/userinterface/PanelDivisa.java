package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;

public class PanelDivisa extends MiPanel {

    public PanelDivisa(Conversor conversor) {
        super(conversor);
        this.getEtiquetaElige().setText("Elige una moneda a la que deseas convertir:");
        this.getEtiquetaCantidad().setText("Ingresa la cantidad de dinero que deseas convertir:");
    }

    @Override
    public void crearMenu(Conversor conversor) {
        this.setMenu(new JComboBox(conversor.getOpcionesDivisas()));
        this.getMenu().setBounds(10,40,200,20);
        this.add(this.getMenu());
    }
}
