package edu.epn.ejemplo1;

public class Estudiante {
    private String nombre;
    private String nivel;
    private int numeroUnico;

    public Estudiante(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public int getNumeroUnico() {
        return numeroUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void mostrarDatos(){
        System.out.println(nombre);
    }



}
