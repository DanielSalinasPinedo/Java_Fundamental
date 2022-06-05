package com.sofka.software._12_compare_wor;

import java.util.Scanner;
import java.util.logging.Logger;

public class Comparacion {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");

    public void comparar(){
        logger.info("Ingrese la primera palabra: ");
        String word1 = scanner.nextLine();

        //word1.toCharArray().;

        logger.info("Ingrese la segunda palabra: ");
        String word2 = scanner.nextLine();

        if(word1.equals(word2)){
            logger.info(()->word1+" es igual a "+word2);
        }
    }
}
