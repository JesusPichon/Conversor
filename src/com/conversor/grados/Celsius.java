package com.conversor.grados;

public class Celsius extends Grados{

    public Celsius(double cantidad) {
        super(cantidad);
    }

    @Override
    public double convertirToCelcius() {
        return(this.getCantidad());
    }

    @Override
    public double convertirToFahrenheit() {
        double cantidad = this.getCantidad() * 9;
        double division = cantidad / 5;
        return(division + 32);
    }

    @Override
    public double convertirToKelvin() {
        return(this.convertirToCelcius() + 273.15);
    }
}
