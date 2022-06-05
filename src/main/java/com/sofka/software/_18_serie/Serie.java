package com.sofka.software._18_serie;

public class Serie implements Entregable{
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public final static int mayor = 1;
    public final static int igual = 0;
    public final static int menor = -1;

    private final static int numTemporadasDefecto = 3;
    private final static boolean entregadoDefecto = false;

    public Serie() {
        this("",numTemporadasDefecto,"","");
    }

    public Serie(String titulo, String creador) {
        this(titulo,numTemporadasDefecto,"",creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        //valida si es mayor, menor o igual
        int valida = menor;
        Serie serie = (Serie) a;
        if(numeroTemporadas>serie.getNumeroTemporadas()){
            valida = mayor;
        }
        else if(numeroTemporadas == serie.getNumeroTemporadas()){
            valida = igual;
        }
        return valida;
    }

    public String toString(){
        return "Titulo: "+titulo+"\nNumero de temporadas: "+numeroTemporadas+"\nGenero: "+genero+
                "\nCreador: "+creador;
    }
}
