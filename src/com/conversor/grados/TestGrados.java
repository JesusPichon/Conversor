package com.conversor.grados;

import com.conversor.Conversor;

public class TestGrados {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        for (int i = 0; i < conversor.getListaOpcionesGrados().length; i++) {
            System.out.println(conversor.getListaOpcionesGrados()[i]);
        }
    }
}
