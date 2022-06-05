package com.sofka.software._9_concatenate;

import java.util.Scanner;
import java.util.logging.Logger;

public class Concatenate {
    Logger logger = Logger.getLogger("logger");
    Scanner scanner = new Scanner(System.in);
    private String frase = "La sonrisa sera la mejor arma contra la tristeza";
    public void remplazar(){
        logger.info("Escriba una frase para concatenar: ");
        frase = frase.replaceAll("a","e")+" "+scanner.nextLine();
        logger.info(()->frase);
    }
}
