package com.conversor;

public class TestConversor {

    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        conversor.setDivisa(new Dolar());

        System.out.println(conversor.getDivisa().changePesosToDivisa(200));

        System.out.println(conversor.getDivisa().changeDivisaToPesos(200));
    }

}
