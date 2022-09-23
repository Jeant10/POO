package taller6.ImplementacionSQL;

import taller6.Conexion.Conexion;
import taller6.DAO.ProfesorDAO;
import taller6.Modelo.Alumno;
import taller6.Modelo.Profesor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLProfesorDAO implements ProfesorDAO {

    final String GETALLALUM = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos";
    final String GETONEALUM = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos where id_alumno = ? ";

    private Conexion conexion;

    public MySQLProfesorDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    private Alumno convertir(ResultSet resultSet) throws SQLException {
        String nombreAux = resultSet.getString("nombre");
        String apellidosAux = resultSet.getString("apellidos");
        Date fechaNacimientoAux = resultSet.getDate("fecha_nac");
        Alumno alumnoAux = new Alumno(nombreAux, apellidosAux, fechaNacimientoAux);
        alumnoAux.setId(resultSet.getLong("id_alumno"));
        return alumnoAux;
    }

    @Override
    public List<Alumno> obtenerListaAlumnos() {
        Statement statement = null;
        ResultSet resultSet = null;
        conexion.establecerConexion();
        List<Alumno> listaAlumnos = new ArrayList<>();
        try {
            statement = conexion.getConnection().createStatement();
            resultSet = statement.executeQuery(GETALLALUM);
            while (resultSet.next()) {
                listaAlumnos.add(convertir(resultSet));
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error SQL");
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    System.out.println("ocurrio un error");
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                    System.out.println("ocurrio un error");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
        return listaAlumnos;
    }

    @Override
    public Alumno obtenerest(Long id) {
        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Alumno alumno = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(GETONEALUM);
            preparedStatement.setLong(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                alumno = convertir(resultSet);
            } else {
                System.out.println("no se ha encontrado el registro del alumno");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error en el SQL");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (Exception e) {
                    System.out.println("ocurrio un error");
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception e) {
                    System.out.println("ocurrio un error");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();

        return alumno;
    }
}
