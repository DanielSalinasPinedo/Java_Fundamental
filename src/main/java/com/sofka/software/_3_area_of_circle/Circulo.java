package com.sofka.software._3_area_of_circle;

import com.sofka.software._3_area_of_circle.abstracts.Figura;

import java.util.Scanner;
import java.util.logging.Logger;

public class Circulo extends Figura {
    private static final Logger logger = Logger.getLogger("logger");
    Scanner scanner = new Scanner(System.in);
    private static final double PI = 3.1415;
    protected double radio;
    @Override
    public void area() {
        logger.info("Ingrese el Radio del circulo:");
        radio = Double.parseDouble(scanner.nextLine());
        logger.info(()->("El area del circulo: "+(PI*(Math.pow(radio,2)))+"m^2"));
    }
}
