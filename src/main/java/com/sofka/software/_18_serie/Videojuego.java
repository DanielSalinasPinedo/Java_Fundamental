package com.sofka.software._18_serie;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;
    public final static int MAYOR = 1;
    public final static int IGUAL = 0;
    public final static int MENOR = -1;

    private final static int HORASESTIMADASDEFECTO = 10;
    private final static boolean ENTREGADODEFECTO = false;

    public Videojuego() {
        this("",HORASESTIMADASDEFECTO, "", "");
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
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        int valida = MENOR;
        Videojuego videojuego = (Videojuego) a;
        if(horasEstimadas>videojuego.getHorasEstimadas()){
            valida = MAYOR;
        }
        else if(horasEstimadas == videojuego.getHorasEstimadas()){
            valida = IGUAL;
        }
        return valida;
    }

    public String toString(){
        return "Titulo: "+titulo+"\nHoras estimadas: "+horasEstimadas+"\nGenero: "+genero+
                "\nCompania: "+compania;
    }
}
