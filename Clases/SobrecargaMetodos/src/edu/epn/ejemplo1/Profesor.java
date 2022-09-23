package edu.epn.ejemplo1;

public class Profesor {
    private String nombre;
    private String materia;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void mostrarDatos(){
        System.out.println("Soy un profesor, mi nombre es: "+nombre);
    }
}
