package com.conversor.divisas;

public class Won extends Divisa{

    public Won() {
        this.setCambio(70.71);
    }

    @Override
    public String getNombreDivisa() {
        return super.getNombreDivisa() + " Coreano";
    }
}
