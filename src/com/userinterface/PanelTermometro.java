package com.userinterface;

import com.conversor.Conversor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class PanelTermometro extends MiPanel{

    private JComboBox menuConversion;
    private  JLabel separacion;

    public PanelTermometro(Conversor conversor) {
        super(conversor);

        getEtiquetaElige().setText("Elija el tipo de grados que deseas convertir:");
        getEtiquetaCantidad().setText("Ingresa la cantidad de grados que deseas convertir:");

        crearEventoBoton();

        menuConversion = new JComboBox(conversor.getListaOpcionesGrados());
        menuConversion.setBounds(250, 40, 200, 20);

        separacion = new JLabel(" a ");
        separacion.setBounds(225, 40 , 20 ,20);

        this.add(menuConversion);
        this.add(separacion);
    }

    @Override
    public void crearMenu(Conversor conversor) {
        this.setMenu(new JComboBox(conversor.getListaOpcionesGrados()));
        this.getMenu().setBounds(10,40,200,20);
        this.add(this.getMenu());
    }

    @Override
    public void crearEventoBoton() {
        getBotonConvertir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = 0, indexConvertir = 0;
                double cantidad = 0, conversion = 0;
                DecimalFormat df = new DecimalFormat("0.00");

                //Grados que se quieren convertir
                index = getMenu().getSelectedIndex();
                //Conversion
                indexConvertir = menuConversion.getSelectedIndex();

                try{
                    cantidad = Double.parseDouble(getCajaCantidad().getText());
                    switch (indexConvertir){
                        case 0:{
                            getConversor().getListaGrados().get(index).setCantidad(cantidad);
                            conversion = getConversor().getListaGrados().get(index).convertirToFahrenheit();
                            getEtiquetaResultado().setText(df.format(conversion) + " °Fahrenheit");
                            break;
                        }
                        case 1:{
                            getConversor().getListaGrados().get(index).setCantidad(cantidad);
                            conversion = getConversor().getListaGrados().get(index).convertirToCelcius();
                            getEtiquetaResultado().setText(df.format(conversion) + " °Celcius");
                            break;
                        }
                        case 2:{
                            getConversor().getListaGrados().get(index).setCantidad(cantidad);
                            conversion = getConversor().getListaGrados().get(index).convertirToKelvin();
                            getEtiquetaResultado().setText(df.format(conversion) + " °Kelvin");
                            break;
                        }
                    }
                }catch(Exception error){
                    getEtiquetaResultado().setText("Intenta de nuevo con otra cantidad");
                }
            }
        });
    }
}
