package com.sofka.software._10_remove_spaces;

import java.util.Scanner;
import java.util.logging.Logger;

public class Remove {
    Logger logger = Logger.getLogger("logger");
    Scanner scanner = new Scanner(System.in);
    //Metodo para eliminar espacios
    public void space(){
        logger.info("Escriba una frase para concatenar: ");
        String frase = scanner.nextLine().replaceAll("\\s","");
        logger.info(()->frase);
    }
}
