package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MiPanel extends JPanel {
    private JComboBox menu;
    private JLabel etiquetaElige;
    private JLabel etiquetaCantidad;
    private JLabel etiquetaResultado;
    private JTextField cajaCantidad;
    private JButton botonConvertir;
    private Conversor conversor;

    private double cantidad = 0;

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

        try {
            botonConvertir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int index = menu.getSelectedIndex();
                    double cambio = 0;
                    double cantidad = Double.parseDouble(cajaCantidad.getText());
                    if(index <= 5){
                        cambio = conversor.getDivisas().get(index).changePesosToDivisa(cantidad);
                        etiquetaResultado.setText("$" + cambio);
                    }else{
                        cambio = conversor.getDivisas().get(index-5).changeDivisaToPesos(cantidad);
                        etiquetaResultado.setText("$" + cambio);
                    }
                }
            });
        } catch (Exception err) {
            etiquetaResultado.setText("Intente con otra canitdad");

        }
    }

    public void crearMenu(Conversor conversor) {
        menu = new JComboBox();
        menu.setBounds(10, 40, 200, 20);
        this.add(menu);
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

}
