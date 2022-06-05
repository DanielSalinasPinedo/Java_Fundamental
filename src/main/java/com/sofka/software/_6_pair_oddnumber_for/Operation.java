package com.sofka.software._6_pair_oddnumber_for;

import java.util.logging.Logger;

public class Operation {
    //Este metodo va hacer la operacion de si un numero es par o impar
    public void operacion(){
        Logger logger = Logger.getLogger("logger");
        StringBuilder preresultado = new StringBuilder();
        for(int i = 1; i<=100; i++){
            preresultado.append((i%2 == 0) ? "El numero "+i+" es par\n":
                                "El numero "+i+" es impar\n");
        }
        String resultado = preresultado.toString();
        logger.info(resultado);
    }
}
