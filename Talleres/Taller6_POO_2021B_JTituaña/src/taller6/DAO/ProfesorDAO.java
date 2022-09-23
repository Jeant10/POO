package taller6.DAO;

import taller6.Modelo.Alumno;

import java.util.List;

public interface ProfesorDAO {
    List<Alumno> obtenerListaAlumnos();
    Alumno obtenerest(Long id);
}
