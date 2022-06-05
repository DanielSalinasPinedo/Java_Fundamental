package com.sofka.software._17_electrodomestico;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Electrodomestico lista[] = new Electrodomestico[10];
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;

        lista[0] = new Electrodomestico(300,"gris",'F',20);
        lista[1] = new Lavadora(200, 35);
        lista[2] = new Electrodomestico();
        lista[3] = new Television(400,80,'E',true);
        lista[4] = new Electrodomestico(60,15);
        lista[5] = new Lavadora(400,"verde",'P',5,90);
        lista[6] = new Television(200,70);
        lista[7] = new Electrodomestico(600,"azul",'A',15);
        lista[8] = new Electrodomestico(100,"gris",'F',20);
        lista[9] = new Television(500,75,20,false);

        for(int i = 0; i < lista.length; i++){
            if(lista[i] instanceof Electrodomestico){
                sumaElectrodomesticos += lista[i].precioFinal();
            }
            if(lista[i] instanceof Lavadora){
                sumaLavadoras += lista[i].precioFinal();
            }
            if(lista[i] instanceof  Television){
                sumaTelevisores += lista[i].precioFinal();
            }
        }

        logger.info("Precio de todas las televisiones "+sumaTelevisores);
        logger.info("Precio de todas las lavadoras  "+sumaLavadoras);
        logger.info("Precio de todos los Electrodomesticos "+sumaElectrodomesticos);


    }
}
