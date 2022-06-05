package com.sofka.software._1_greater_number;

import java.util.logging.Logger;

public class Operation{
    private static final Logger logger = Logger.getLogger("logger");

    private Operation() {
        throw new IllegalStateException("Utility class");
    }

    public static void operation() {
        final String numberText = "The number";
        com.sofka.software._2_greater_number_input.interfaces.OperationInterface operationInterface = (n1, n2) -> {
            if (n1 > n2) {
                logger.info(() -> numberText + " " + n1 + " is greater than " + n2);
            } else if (n1 < n2) {
                logger.info(() -> numberText + " " + n2 + " is greater than " + n1);
            } else if (n1 == n2) {
                logger.info(() -> numberText + " " + n1 + " is equal to " + n2);
            }
        };
        operationInterface.operacion(10.1, 10.0);
    }
}
