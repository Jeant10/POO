package edu.epn;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int numeroUnico;

    public Estudiante(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public Estudiante(String nombre, String apellido, int numeroUnico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroUnico = numeroUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroUnico=" + numeroUnico +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        Estudiante estudiante2= (Estudiante) o;
            if(!Objects.equals(this.numeroUnico, estudiante2.numeroUnico)){
                return false;

        }
        return true;
    }


}
