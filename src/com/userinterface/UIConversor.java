package com.userinterface;


import com.conversor.Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UIConversor extends JFrame {

    private Conversor conversor;
    private JMenuBar menu;
    private JMenuItem opcionDivisa;
    private JMenuItem opcionTermometro;

    private PanelTermometro panelTermometro;
    private PanelConversor panelConversor;

    public UIConversor() {
        this.setTitle("Conversor");
        this.setSize(500,500);
        this.setLayout(null);

        menu = new JMenuBar();
        opcionDivisa = new JMenuItem("Divisa");
        opcionTermometro = new JMenuItem("Termometro");

        menu.add(opcionDivisa);
        menu.add(opcionTermometro);
        menu.setBounds(0,0,500,20);

        conversor = new Conversor();

        panelConversor = new PanelConversor(conversor);
        panelConversor.setBounds(0,20,500,480);

        panelTermometro = new PanelTermometro();
        panelTermometro.setBounds(0,20,500,480);

        panelConversor.setVisible(false);
        panelTermometro.setVisible(false);

        this.add(panelConversor);
        this.add(panelTermometro);

        //Eventos
        opcionDivisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You selected: Divisa.");
                panelConversor.setVisible(true);
            }
        });

        opcionTermometro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You selected: Termometro.");
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
