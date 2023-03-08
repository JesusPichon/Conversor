package com.conversor.grados;

public class Kelvin extends Grados{

    public Kelvin(double cantidad) {
        super(cantidad);
    }

    @Override
    public double convertirToCelcius() {
        return(getCantidad() - 273.15);
    }

    @Override
    public double convertirToFahrenheit() {
        final float division = 9/5;
        return(((getCantidad() - 273.15) * division) + 32);
    }

    @Override
    public double convertirToKelvin() {
        return(getCantidad());
    }
}
