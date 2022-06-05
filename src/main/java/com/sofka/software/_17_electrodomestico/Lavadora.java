package com.sofka.software._17_electrodomestico;

public class Lavadora extends Electrodomestico{
    private int carga;

    private final static int cargaDefecto = 5;

    public Lavadora() {
        this(precioBaseDefecto, colorDefecto, consumoEnergeticoDefecto, pesoDefecto, cargaDefecto);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, colorDefecto, consumoEnergeticoDefecto, peso, cargaDefecto);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){
        double precioAgregado = super.precioFinal();

        if(carga > 30){
            precioAgregado += 50;
        }

        return precioAgregado;
    }
}
