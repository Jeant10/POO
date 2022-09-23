package Modelo;

import java.util.Objects;

public class Persona {
    private String nombrePersona;
    private String apellidoPersona;
    private  int numeroUnicoPersona;
    private int edadPersona;

    public Persona(String nombre, String apellido, int numeroUnico, int edad) {
        this.nombrePersona = nombre;
        this.apellidoPersona = apellido;
        this.numeroUnicoPersona = numeroUnico;
        this.edadPersona = edad;
    }

    public String getNombre() {
        return nombrePersona;
    }

    public void setNombre(String nombre) {
        this.nombrePersona = nombre;
    }

    public String getApellido() {
        return apellidoPersona;
    }

    public void setApellido(String apellido) {
        this.apellidoPersona = apellido;
    }

    public int getNumeroUnico() {
        return numeroUnicoPersona;
    }

    public void setNumeroUnico(int numeroUnico) {
        this.numeroUnicoPersona = numeroUnico;
    }

    public int getEdad() {
        return edadPersona;
    }

    public void setEdad(int edad) {
        this.edadPersona = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return numeroUnicoPersona == persona.numeroUnicoPersona
                && edadPersona == persona.edadPersona &&
                nombrePersona.equals(persona.nombrePersona) &&
                apellidoPersona.equals(persona.apellidoPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePersona, apellidoPersona, numeroUnicoPersona, edadPersona);
    }
}
