package com.sofka.software._11_sentence_length;

import java.util.Scanner;
import java.util.logging.Logger;

public class Lontitud {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");
    public void longitud(){
        logger.info("Ingrese una frase: ");

        String frase = scanner.nextLine();
        logger.info(()->"La longitud de esta frase con espacios es: "+frase.length());

        int fraseSinEspacios = frase.replaceAll(" ","").length();

        logger.info(()->"La longitud de esta frase sin espacios es: "+fraseSinEspacios);

        int cantVocales = frase.replaceAll("[[^AEIOUaeiouÁÉÍÓÚáéíóú]]","").length();
        logger.info(()->"Tiene "+cantVocales+" vocales");
    }
}
