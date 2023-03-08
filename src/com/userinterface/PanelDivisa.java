package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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

    @Override
    public void crearEventoBoton() {
        getBotonConvertir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = getMenu().getSelectedIndex();
                double cambio = 0, cantidad = 0;
                DecimalFormat df = new DecimalFormat("0.00");
                try {
                    cantidad = Double.parseDouble(getCajaCantidad().getText());
                    if (index <= 5) {
                        cambio = getConversor().getDivisas().get(index).changePesosToDivisa(cantidad);
                        getEtiquetaResultado().setText("$" + df.format(cambio));
                    } else {
                        cambio = getConversor().getDivisas().get(index - 5).changeDivisaToPesos(cantidad);
                        getEtiquetaResultado().setText("$" + df.format(cambio));
                    }
                } catch (Exception errorCaja) {
                    getEtiquetaResultado().setText("Vuelve a ingresar la cantidad");
                }
            }
        });
    }
}
