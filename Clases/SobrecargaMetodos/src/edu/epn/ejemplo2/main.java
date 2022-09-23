package edu.epn.ejemplo2;

import edu.epn.ejemplo1.Estudiante;

public class main {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante(5678);
        estudiante.setNivel("Primero");
        System.out.println("Mi nivel es: "+estudiante.getNivel());
    }
}
