package com.sofka.software._7_number_greater_than_0;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Operation operation = new Operation();
        logger.info(operation.validar());
    }
}
