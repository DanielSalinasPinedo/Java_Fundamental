package com.sofka.software._18_serie;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;
    public final static int mayor = 1;
    public final static int igual = 0;
    public final static int menor = -1;

    private final static int horasEstimadasDefecto = 10;
    private final static boolean entregadoDefecto = false;

    public Videojuego() {
        this("",horasEstimadasDefecto, "", "");
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this(titulo,horasEstimadas,"","");
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int valida = menor;
        Videojuego videojuego = (Videojuego) a;
        if(horasEstimadas>videojuego.getHorasEstimadas()){
            valida = mayor;
        }
        else if(horasEstimadas == videojuego.getHorasEstimadas()){
            valida = igual;
        }
        return valida;
    }

    public String toString(){
        return "Titulo: "+titulo+"\nHoras estimadas: "+horasEstimadas+"\nGenero: "+genero+
                "\nCompania: "+compania;
    }
}
