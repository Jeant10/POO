package edu.epn.PatronesDisenio.Vista;

import edu.epn.PatronesDisenio.Modelo.Alumno;

import java.util.List;

public class AlumnoVista {
    public void verAlumno (Alumno estudiante){
        System.out.println("Los datos del estudiante son: "+estudiante);
    }

    public void verAlumnos (List<Alumno> estudiantes){
        System.out.println("Los estudiantes son:");
        for (Alumno estudiante:estudiantes  ) {
            System.out.println(estudiante);
        }
    }
}
