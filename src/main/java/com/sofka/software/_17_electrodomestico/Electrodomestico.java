package com.sofka.software._17_electrodomestico;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected final static double precioBaseDefecto = 100;
    protected final static String colorDefecto = "blanco";
    protected final static char consumoEnergeticoDefecto = 'F';
    protected final static double pesoDefecto = 5;


    public Electrodomestico() {
        this(precioBaseDefecto,colorDefecto, consumoEnergeticoDefecto, pesoDefecto);
    }

    protected Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    protected Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    protected void comprobarColor(String color){
        String colores[] = {"blancos", "negro", "rojo", "azul", "gris"};
        boolean existeColor = false;

        for(int i = 0;i < colores.length && !existeColor;i++){
            if(colores[i].equals(color)){
                existeColor = true;
            }
        }

        this.color = (existeColor) ? color : this.colorDefecto;
    }

    protected void comprobarConsumoEnergetico(char letra){
        this.consumoEnergetico = (consumoEnergetico >= 65 && consumoEnergetico <= 70)
                                    ? letra : consumoEnergeticoDefecto;
    }

    public double precioFinal(){
        double valorAgregado = 0;
        switch (consumoEnergetico){
            case 'A' -> valorAgregado += 100;
            case 'B' -> valorAgregado += 80;
            case 'C' -> valorAgregado += 60;
            case 'D' -> valorAgregado += 50;
            case 'E' -> valorAgregado += 30;
            case 'F' -> valorAgregado += 10;
        }

        if(this.peso >= 0 && this.peso <=19){
            valorAgregado +=10;
        } else if(this.peso >= 20 && this.peso <= 49){
            valorAgregado +=50;
        } else if(this.peso >= 50 && peso <=79){
            valorAgregado += 80;
        } else if(peso >= 80) {
            valorAgregado += 100;
        }

        return this.precioBase+valorAgregado;
    }
}
