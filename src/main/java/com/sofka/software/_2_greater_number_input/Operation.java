package com.sofka.software._2_greater_number_input;

import com.sofka.software._2_greater_number_input.interfaces.OperationInterface;

import java.util.Scanner;
import java.util.logging.Logger;

public class Operation{

    private Operation() {
        throw new IllegalStateException("Utility class");
    }

    private static final Logger logger = Logger.getLogger("logger");
    public static void operation(){
        Scanner scan = new Scanner(System.in);

        final String numberText = "The number";
        OperationInterface operationInterface = (n1, n2) -> {
            if(n1>n2){
                logger.info(()->numberText+" "+n1+" is greater than "+n2);
            }else if(n1<n2){
                logger.info(()->numberText+" "+n2+" is greater than "+n1);
            }else if(n1==n2){
                logger.info(()->numberText+" "+n1+" is equal to "+n2);
            }
        };

        logger.info("Enter the first number");
        int number = scan.nextInt();
        logger.info("Enter the second number");
        int number2 = scan.nextInt();
        operationInterface.operacion(number, number2);
    }
}
