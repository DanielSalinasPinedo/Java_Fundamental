package com.sofka.software._17_electrodomestico;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    private static int resolucionDefecto = 20;

    private static boolean sintoizadorTDTDEFECTO = false;

    public Television() {
        this(precioBaseDefecto, colorDefecto, consumoEnergeticoDefecto, pesoDefecto,
                resolucionDefecto, sintoizadorTDTDEFECTO);
    }

    public Television(int precioBase, double peso) {
        this(precioBase, colorDefecto, consumoEnergeticoDefecto, peso, resolucionDefecto,
                sintoizadorTDTDEFECTO);
    }

    public Television(double precioBase, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precioAgregado = super.precioFinal();

        if(resolucion >40){
            precioAgregado += precioBase*0.3;
        }
        if(sintonizadorTDT){
            precioAgregado += 50;
        }

        return precioAgregado;
    }
}
