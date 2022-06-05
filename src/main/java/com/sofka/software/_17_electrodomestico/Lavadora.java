package com.sofka.software._17_electrodomestico;

public class Lavadora extends Electrodomestico{
    private int carga;

    private final static int CARGADEFECTO = 5;

    public Lavadora() {
        this(PRECIOBASEDEFECTO, COLORDEFECTO, CONSUMOENERGETICODEFECTO, PESODEFECTO, CARGADEFECTO);
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, COLORDEFECTO, CONSUMOENERGETICODEFECTO, peso, CARGADEFECTO);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(){
        double precioAgregado = super.precioFinal();

        if(carga > 30){
            precioAgregado += 50;
        }

        return precioAgregado;
    }
}
