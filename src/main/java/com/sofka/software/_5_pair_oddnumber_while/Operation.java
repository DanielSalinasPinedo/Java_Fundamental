package com.sofka.software._5_pair_oddnumber_while;

import java.util.logging.Logger;

public class Operation {
    //Este metodo va hacer la operacion de si un numero es par o impar
    public void operacion(){
        Logger logger = Logger.getLogger("logger");
        int cont = 1;
        StringBuilder preresultado = new StringBuilder();
        while(cont <= 100){
            preresultado.append((cont%2 == 0) ? "El numero "+cont+" es par\n":
                                "El numero "+cont+" es impar\n");
            cont++;
        }
        String resultado = preresultado.toString();
        logger.info(resultado);
    }
}
