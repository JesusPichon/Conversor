package com.conversor.grados;

public class Fahrenheit extends Grados {
    public Fahrenheit(double cantidad) {
        super(cantidad);
    }

    @Override
    public double convertirToCelcius() {
        return((this.getCantidad() - 32) * 5/9);
    }

    @Override
    public double convertirToFahrenheit() {
        return(getCantidad());
    }

    @Override
    public double convertirToKelvin() {
        return(convertirToCelcius() + 273.15);
    }
}
