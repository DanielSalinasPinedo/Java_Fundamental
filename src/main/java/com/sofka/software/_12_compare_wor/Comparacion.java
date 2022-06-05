package com.sofka.software._12_compare_wor;

import java.util.Scanner;
import java.util.logging.Logger;

public class Comparacion {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");

    public void comparar(){
        logger.info("Ingrese la primera palabra: ");
        String word1 = scanner.nextLine();

        logger.info("Ingrese la segunda palabra: ");
        String word2 = scanner.nextLine();

        String diferencia = "";
        if(word1.equals(word2)){
            logger.info(()->word1+" es igual a "+word2);
        }

        int tamMax = (word1.length() >= word2.length()) ? word1.length():word2.length();
        int tamMin = (word1.length() < word2.length()) ? word1.length():word2.length();

        for(int i = 0; i<tamMin;i++){
            if(((word1.length() >= word2.length()) ? word1:word2).toCharArray()[i] != ((word1.length() < word2.length()) ? word1:word2).toCharArray()[i]){
                diferencia += word1.toCharArray()[i];
            }
        }

        for(int i = tamMin; i<tamMax;i++){
            diferencia += ((word1.length() >= word2.length()) ? word1:word2).toCharArray()[i];
        }

        logger.info("La diferencia es: "+diferencia);
    }
}
