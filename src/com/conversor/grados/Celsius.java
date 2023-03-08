package com.conversor.grados;

public class Celsius extends Grados{

    public Celsius(double cantidad) {
        super(cantidad);
    }

    @Override
    public double convertirToCelcius() {
        return(getCantidad());
    }

    @Override
    public double convertirToFahrenheit() {
        final float division = 9/5;
        return((getCantidad() * division) + 32);
    }

    @Override
    public double convertirToKelvin() {
        return(convertirToCelcius() + 273.15);
    }
}
