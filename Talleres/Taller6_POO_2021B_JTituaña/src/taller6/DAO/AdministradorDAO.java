package taller6.DAO;

import taller6.Modelo.Alumno;
import taller6.Modelo.Asignatura;
import taller6.Modelo.Matricula;
import taller6.Modelo.Profesor;

import java.util.List;

public interface AdministradorDAO {
    void insertar(Alumno alumno);
    void modificar(Alumno alumno);
    void eliminar (Alumno alumno);
    Alumno obtenerest(Long id);
    List<Alumno> obtenerListaAlumnos();

    void insertar(Profesor profesor);
    void modificar(Profesor profesor);
    void eliminar(Profesor profesor);
    Profesor obtenerprof(Long id);
    List<Profesor> obtenerListaProfesores();

    void insertar(Asignatura asignatura);
    void modificar(Asignatura asignatura);
    void eliminar(Asignatura asignatura);
    Asignatura obtenerasig(Long id);
    List<Asignatura> obtenerListaAsignaturas();

    void insertar(Matricula matricula);
    void modificar(Matricula matricula);
    void eliminar(Matricula matricula);
    Matricula obtenermatri(Long id);
    List<Matricula> obtenerMPorAlumno(long alumno);

}
