package com.sofka.software._16_persona;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private final static char sexoDefinido = 'H';

    public Persona() {
        this("", 0, sexoDefinido, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generateDni();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
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

    private void comprobarSexo(){
        if(sexo != 'H' && sexo != 'M'){
            this.sexo = sexoDefinido;
        }
    }

    public int calcularIMC(){
        double IMC = peso / (Math.pow(altura, 2));
        if(IMC<20){
            return  -1;
        } else if (IMC>= 20 && IMC<= 25) {
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        return (edad >= 18);
    }

    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+dni+"\nAltura: "+altura+"m"+
                "\nPeso: "+peso+"kg" + "\nSexo: "+ ((sexo == 'H') ? "hombre":"mujer");
    }

    public void generateDni(){
        int cont = 0;
        StringBuilder aleatorio = new StringBuilder();
        while(cont < 8){
            aleatorio.append(letraDNI(Math.round(Math.random()*8)));
            cont++;
        }
        dni = aleatorio.toString();
    }

    private char letraDNI(long dni){
        char letras[] = {'A','B','C','D','E','F','G','H','I'};
        return letras[Math.toIntExact(dni)];
    }
}
