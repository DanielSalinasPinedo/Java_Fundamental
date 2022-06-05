package com.sofka.software._16_persona;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void peso(Persona persona, Logger logger){
        if(persona.calcularIMC() == 0){
            logger.info(persona.getNombre()+" esta por debajo del peso ideal");
        }else if(persona.calcularIMC() == 1){
            logger.info(persona.getNombre()+" tiene sobrepeso");
        }else if(persona.calcularIMC() == -1){
            logger.info(persona.getNombre()+" tiene el peso ideal");
        }
    }

    public static void datos(Persona persona, Logger logger){
        persona.generateDni();

        logger.info(()->persona.getNombre()+" "+((persona.esMayorDeEdad()) ? "si":"no")+" es mayor");

        logger.info(persona::toString);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner scanner = new Scanner(System.in);

        logger.info("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        logger.info("Ingrese la edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        logger.info("Ingrese el peso en kg(kilogramos): ");
        double peso = scanner.nextDouble();

        logger.info("Ingrese la altura en m(metros)");
        double altura = scanner.nextDouble();

        Persona persona1 = new Persona(nombre, edad, "", 'H',peso, altura);
        Persona persona2 = new Persona(nombre,edad,'H');
        Persona persona3 = new Persona();

        peso(persona1,logger);
        peso(persona2,logger);
        peso(persona3,logger);

        datos(persona1,logger);
        datos(persona2,logger);
        datos(persona3,logger);

    }
}
