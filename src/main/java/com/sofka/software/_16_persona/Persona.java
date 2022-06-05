package com.sofka.software._16_persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getdni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        final double IMC = (getPeso() / (Math.pow(getAltura(), 2)));
        if(IMC<20){
            return  -1;
        } else if (IMC>= 20 && IMC<= 25) {
            return 0;
        }else if(IMC>25){
            System.out.println("ENTROOOOOOOOOOOO");
            return 1;
        }
        return 2;
    }

    public boolean esMayorDeEdad(){
        return (getEdad() >= 8);
    }

    public String toString(){
        return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDNI: "+getdni()+"\nAltura: "+getAltura()+"m"+
                "\nPeso: "+getPeso()+"kg" + "\nSexo:"+getSexo();
    }

    public void generateDni(){
        int cont = 0;
        StringBuilder aleatorio = new StringBuilder();
        while(cont < 8){
            aleatorio.append(Math.round(Math.random()*8));
            cont++;
        }
        dni = aleatorio.toString();
    }
}
