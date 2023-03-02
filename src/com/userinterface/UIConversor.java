package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;

public class UIConversor extends JFrame {

    private JMenuBar menu;
    private JComboBox opciones;
    private Conversor conversor;
    private JLabel etiquetaElige;
    private JLabel etiquetaCantidad;

    private JTextField cajaCantidad;
    public UIConversor() {
        this.setTitle("Conversor");
        this.setSize(500,500);
        this.setLayout(null);
        this.conversor = new Conversor();
        crearMenuDivisas();
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

    private void crearMenuDivisas(){
        String[] lista = conversor.getOpcionesDivisas();
        opciones = new JComboBox(lista);
        opciones.setBounds(10,40, 200, 20);
    }

    public static void main(String[] args) {
        UIConversor fr = new UIConversor();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
