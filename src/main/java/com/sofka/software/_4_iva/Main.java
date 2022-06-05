package com.sofka.software._4_iva;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        AgregarIVA agregarIva = new AgregarIVA();
        Logger logger = Logger.getLogger("log");
        Scanner scanner = new Scanner(System.in);

        logger.info("Ingrese el precio del producto: ");

        logger.info(()->"El precio final con IVA incluido es: "+ agregarIva.getPrecioFinal(Double.parseDouble(scanner.nextLine())));
    }
}
