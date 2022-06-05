package com.sofka.software._13_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.logging.Logger;

public class Fecha {
    Logger logger = Logger.getLogger("logger");
    public void obtenerFecha(){
        LocalDate hoy = LocalDate.now();
        LocalTime hora = LocalTime.now();
        logger.info(()-> "("+String.valueOf(hoy).replaceAll("-","/")+")"+
                "("+String.valueOf(hora)+")");
    }
}
