package com.sofka.software._14_n_to_1000;

import java.util.Scanner;
import java.util.logging.Logger;

public class Operacion {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");

    //Este metodo va hacer la operacion de n hasta 1000 de 2 en 2
    public void operar(){
        logger.info("Ingrese un numero: ");
        int i= Integer.parseInt(scanner.nextLine());
        while ( i <= 1000){
            int auxI = i;
            logger.info(()-> auxI +"\n");
            i+=2;
        }
    }
}
