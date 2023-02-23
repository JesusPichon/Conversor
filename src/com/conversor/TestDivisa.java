package com.conversor;

public class TestDivisa {
    public static void main(String[] args) {
        Divisa dolarito = new Libra();

        System.out.println(dolarito.changeDivisaToPesos(234.35));
    }
}
