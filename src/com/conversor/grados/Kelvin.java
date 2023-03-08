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
    public double convertirToFahrenheit(){
        double cantidad = (getCantidad() - 273.15) * 9;
        double division = cantidad / 5;
        return(division + 32);
    }

    @Override
    public double convertirToKelvin() {
        return(getCantidad());
    }
}
