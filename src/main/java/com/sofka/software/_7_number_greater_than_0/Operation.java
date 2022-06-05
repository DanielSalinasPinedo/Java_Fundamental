package com.sofka.software._7_number_greater_than_0;

import java.util.Scanner;
import java.util.logging.Logger;

public class Operation {
    Scanner scanner = new Scanner(System.in);
    Logger logger = Logger.getLogger("logger");
    public String validar() {
        int num;
        do {
            logger.info("Ingrese un numero: ");
            num = Integer.parseInt(scanner.nextLine());
        } while (num < 0);
        return "El numero "+Integer.toString(num)+" es mayor o igual a 0";
    }
}
