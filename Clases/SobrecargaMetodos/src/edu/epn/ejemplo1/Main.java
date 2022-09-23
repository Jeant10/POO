package edu.epn.ejemplo1;

import edu.epn.Persona;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1= new Persona();
        Persona persona2=new Persona("12345678");
        persona1.setNombre("Ivonne Fernanda");
        persona1.setEdad(30);
        persona1.correr(10);
        persona1.correr(20,1);


        // MODIFICADORES DE ACCESO
        // public - clase / packege / subclase / otros
        // default - clase / packege
        // private - clase
        // protected - clase / packege / subclase

        Estudiante estudiante = new Estudiante(12345);
        estudiante.setNombre("Edison");
        System.out.println("soy un estudiante, y mi nombre es: "+estudiante.getNombre()+"con numero unico: "+estudiante.getNumeroUnico());


        Profesor profesor = new Profesor();
        profesor.setNombre("Ivonne");
        System.out.println("Soy un profesor, mi nombre es: "+profesor.getNombre());



    }
}
