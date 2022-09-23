package edu.epn;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String cedula;


    //metodos constructores
    public Persona(){

    }
    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public Persona(String cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    //metodos
    public int correr(int km, int tiempo){
        System.out.println("Soy "+nombre+"tengo "+edad+" y estoy corriendo");
        return km;

    }
    public void correr(int km){
        System.out.println("Soy "+nombre+"tengo "+edad+" y estoy corriendo "+km+" km");
    }

}
