package com.conversor.grados;

public class TestGrados {
    public static void main(String[] args) {
        Fahrenheit medida1 = new Fahrenheit(100);

        medida1.setCantidad(275);

        System.out.println(medida1.convertirToCelcius());
    }
}
