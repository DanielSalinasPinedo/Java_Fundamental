package com.sofka.software._8_business_day;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class Semana {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");

    public void validar(){
        logger.info("Ingrese un dia de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        switch (dia){
            case "lunes", "martes", "miercoles", "jueves", "viernes" ->
                    logger.info("Es un dia laboral");
            case "sabado", "domingo" -> logger.info("No es un dia laboral");

            default-> logger.info("El texto ingresado es incorrecto");
        }
    }
}
