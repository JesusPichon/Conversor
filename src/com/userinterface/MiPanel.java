package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class MiPanel extends JPanel {
    private JComboBox menu;
    private JLabel etiquetaElige;
    private JLabel etiquetaCantidad;
    private JLabel etiquetaResultado;
    private JTextField cajaCantidad;
    private JButton botonConvertir;
    private Conversor conversor;

    public MiPanel(Conversor conversor) {
        this.setLayout(null);
        this.conversor = new Conversor();

        crearMenu(conversor);

        etiquetaElige = new JLabel();
        etiquetaElige.setBounds(10, 10, 350, 20);

        etiquetaCantidad = new JLabel();
        etiquetaCantidad.setBounds(10, 80, 350, 20);

        cajaCantidad = new JTextField();
        cajaCantidad.setBounds(10, 110, 150, 25);

        botonConvertir = new JButton("Convertir");
        botonConvertir.setBounds(180, 110, 100, 25);

        etiquetaResultado = new JLabel("Resultado");
        etiquetaResultado.setBounds(10, 150, 200, 20);

        //Agregar elementos al panel
        this.add(etiquetaElige);
        this.add(etiquetaCantidad);
        this.add(cajaCantidad);
        this.add(botonConvertir);
        this.add(etiquetaResultado);

        crearEventoBoton();
    }

    public void crearMenu(Conversor conversor) {
        menu = new JComboBox();
        menu.setBounds(10, 40, 200, 20);
        this.add(menu);
    }

    public void crearEventoBoton(){

    }

    public JComboBox getMenu() {
        return menu;
    }

    public void setMenu(JComboBox menu) {
        this.menu = menu;
    }

    public JLabel getEtiquetaElige() {
        return etiquetaElige;
    }

    public JLabel getEtiquetaCantidad() {
        return etiquetaCantidad;
    }

    public JButton getBotonConvertir() {
        return botonConvertir;
    }

    public JLabel getEtiquetaResultado() {
        return etiquetaResultado;
    }

    public Conversor getConversor() {
        return conversor;
    }

    public JTextField getCajaCantidad() {
        return cajaCantidad;
    }
}
