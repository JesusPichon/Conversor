package com.userinterface;


import com.conversor.Conversor;

import javax.swing.*;
import java.awt.event.*;

public class UIConversor extends JFrame {

    private Conversor conversor;
    private JMenuBar menu;
    private JMenuItem opcionDivisa;
    private JMenuItem opcionTermometro;

    private PanelTermometro panelTermometro;
    private PanelDivisa panelDivisa;

    public UIConversor() {
        this.setTitle("Conversor");
        this.setSize(500,500);
        this.setLayout(null);

        menu = new JMenuBar();
        opcionDivisa = new JMenuItem("Divisa");
        opcionTermometro = new JMenuItem("Grados");

        menu.add(opcionDivisa);
        menu.add(opcionTermometro);
        menu.setBounds(0,0,500,20);

        conversor = new Conversor();

        panelDivisa = new PanelDivisa(conversor);
        panelDivisa.setBounds(0,20,500,480);

        panelTermometro = new PanelTermometro(conversor);
        panelTermometro.setBounds(0,20,500,480);

        //Siempre que inicie ponga el panel de divisa
        panelDivisa.setVisible(true);
        panelTermometro.setVisible(false);

        this.add(panelDivisa);
        this.add(panelTermometro);

        //Eventos
        opcionDivisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelDivisa.setVisible(true);
                panelTermometro.setVisible(false);
            }
        });

        opcionTermometro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTermometro.setVisible(true);
                panelDivisa.setVisible(false);
            }
        });

        this.add(menu);
    }

    public static void main(String[] args) {
        UIConversor fr = new UIConversor();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
