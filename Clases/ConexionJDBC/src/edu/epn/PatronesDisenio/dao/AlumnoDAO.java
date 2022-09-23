package edu.epn.PatronesDisenio.dao;

import edu.epn.PatronesDisenio.Modelo.Alumno;

import java.util.List;

public interface AlumnoDAO {
    //aqui es donde va mi famoso CRUD
    void insertar(Alumno alumno);
    void modificar(Alumno alumno);
    void eliminar (Alumno alumno);
    Alumno obtener(Long id);
    List<Alumno> obtenerListaAlumnos();

}
