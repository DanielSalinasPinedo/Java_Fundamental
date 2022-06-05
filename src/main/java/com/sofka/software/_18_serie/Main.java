package com.sofka.software._18_serie;

import java.util.function.Supplier;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Serie listaSeries[] = new Serie[5];
        Videojuego listaVideojuego[] = new Videojuego[5];
        int VyS_Entregados = 0;

        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Bob Esponja","Stephen Hillenburg");
        listaSeries[2] = new Serie("South Park",25, "humor","Matt Stome y Trey Parker");
        listaSeries[3] = new Serie("Los Simpson", 33, "humor", "Matt Groening");
        listaSeries[4] = new Serie("Rick y Morty", "Justin Roiland y Dan Harmon");

        listaVideojuego[0] = new Videojuego();
        listaVideojuego[1] = new Videojuego("Call of duty",30,"Shooter","Activision");
        listaVideojuego[2] = new Videojuego("Watch Dogs 2",60,"Accion","Ubisoft");
        listaVideojuego[3] = new Videojuego("CS:GO",1400);
        listaVideojuego[4] = new Videojuego("TeamFortress2",1000);

        listaSeries[1].entregar();
        listaSeries[0].entregar();
        listaSeries[3].entregar();

        listaVideojuego[0].entregar();
        listaSeries[2].entregar();

        for(int i = 0; i<listaSeries.length; i++){
            if(listaSeries[i].isEntregado()){
                VyS_Entregados +=1;
                listaSeries[i].devolver();
            }
            if(listaVideojuego[i].isEntregado()){
                VyS_Entregados +=1;
                listaVideojuego[i].devolver();
            }
        }

        Serie serieMaxT = listaSeries[0];
        Videojuego videojuegoMaxH = listaVideojuego[0];

        logger.info("Hemos entregado "+VyS_Entregados+" articulos");

        for(int i = 1; i<listaSeries.length; i++){
            if(listaSeries[i].compareTo(serieMaxT) == Serie.mayor){
                serieMaxT = listaSeries[i];
            }
            if(listaVideojuego[i].compareTo(videojuegoMaxH) == Videojuego.mayor){
                videojuegoMaxH = listaVideojuego[i];
            }
        }

        logger.info(String.valueOf(serieMaxT));
        logger.info(String.valueOf(videojuegoMaxH));
    }
}
