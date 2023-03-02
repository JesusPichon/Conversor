package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;
import java.awt.*;

public class PanelConversor extends JPanel {
    private JComboBox opciones;
    private JLabel etiquetaElige;
    private JLabel etiquetaCantidad;
    private JTextField cajaCantidad;

    public PanelConversor(Conversor conversor) {
        this.setLayout(null);

        crearMenuDivisas(conversor);
        etiquetaElige = new JLabel("Elije una moneda a la que deseas convertir tu dinero:");
        etiquetaElige.setBounds(10,10, 350, 20);

        etiquetaCantidad = new JLabel("Ingresa la cantidad  de dinero que deseas convertir:");
        etiquetaCantidad.setBounds(10,80, 350, 20);

        cajaCantidad = new JTextField();
        cajaCantidad.setBounds(10,110, 100, 25);

        this.add(etiquetaElige);
        this.add(etiquetaCantidad);
        this.add(cajaCantidad);
        this.add(opciones);
    }

    private void crearMenuDivisas(Conversor conversor){
        String[] lista = conversor.getOpcionesDivisas();
        opciones = new JComboBox(lista);
        opciones.setBounds(10,40, 200, 20);
        this.add(opciones);
    }
}
