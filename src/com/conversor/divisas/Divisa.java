package com.conversor.divisas;

public abstract class Divisa {
    private double cambio;

    //metodo que cambia de pesos a alguna divisa
    public double changeDivisaToPesos(double monto) {
        return (monto * this.cambio);
    }

    //metodo que devuelve el monto en pesos
    public double changePesosToDivisa(double monto){
        return (monto/this.cambio);
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public String getNombreDivisa(){
        return this.getClass().getName().substring(14);
    }
}
