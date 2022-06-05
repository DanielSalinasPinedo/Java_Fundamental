package com.sofka.software._15_menu;

import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");
    public void menu(){
        String menu = "1-NUEVO ACTOR\n 2-BUSCAR ACTOR\n 3-ELIMINAR ACTOR\n 4-MODIFICAR ACTOR\n " +
                "5-VER TODOS LOS ACTORES\n 6- VER PELICULAS DE LOS ACTORES\n " +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n 8-SALIR \nDiguite un numero: ";
        logger.info(()->menu);
        String opcion;
        do {
            opcion = scanner.nextLine();
            switch (opcion){
                case "1", "2", "3", "4", "5":
                    logger.info(()->menu);
                    break;
                case "6","7":
                    logger.info("Digite un numero: ");
                    break;
                case "8":
                    break;
                default:
                    logger.info("OPCION INCORRECTA");
                    logger.info(()->menu);
            }
        }while(!opcion.equals("8"));
    }
}
