package taller6.DAO;

import taller6.Modelo.Asignatura;
import taller6.Modelo.Matricula;
import taller6.Modelo.Profesor;

import java.util.List;

public interface AlumnoDAO {
    List<Profesor> obtenerListaProfesores();
    List<Asignatura> obtenerListaAsignaturas();
    List<Matricula> obtenerMPorAlumno(long alumno);
}
