package com.conversor.grados;

public abstract class Grados {
    private double cantidad;

    public Grados(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public abstract double convertirToCelcius();

    public abstract double convertirToFahrenheit();

    public abstract  double convertirToKelvin();

    public String getNombre(){
        return(this.getClass().getName().substring(21));
    }
}
