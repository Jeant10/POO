package taller6.ImplementacionSQL;

import taller6.Conexion.Conexion;
import taller6.DAO.AlumnoDAO;
import taller6.Modelo.Asignatura;
import taller6.Modelo.Matricula;
import taller6.Modelo.Profesor;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAlumnoDAO implements AlumnoDAO {

    final String GETALL= "SELECT id_profesor, nombre, apellidos FROM profesores";
    final String GETALLASIG= "SELECT id_asignatura, nombre, profesor FROM asignaturas";
    private Conexion conexion;

    public MySQLAlumnoDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    private Profesor convertir(ResultSet resultSet) throws SQLException {
        String nombreAux = resultSet.getString("nombre");
        String apellidoAux = resultSet.getString("apellidos");
        Profesor profesorAUx = new Profesor(nombreAux, apellidoAux);
        profesorAUx.setId(resultSet.getLong("id_profesor"));
        return profesorAUx;
    }

    private Asignatura convertirASIG(ResultSet resultSet) throws SQLException {
        String nombreAux = resultSet.getString("nombre");
        Long profesorAux = resultSet.getLong("profesor");
        Asignatura asignaturaAUx = new Asignatura(nombreAux, profesorAux);
        asignaturaAUx.setId(resultSet.getLong("id_asignatura"));
        return asignaturaAUx;
    }

    @Override
    public List<Profesor> obtenerListaProfesores() {
        Statement statement = null;
        ResultSet resultSet = null;
        conexion.establecerConexion();
        List<Profesor> listaProfesores = new ArrayList<>();
        try{
            statement = conexion.getConnection().createStatement();
            resultSet = statement.executeQuery(GETALL);
            while (resultSet.next()){
                listaProfesores.add(convertir(resultSet));
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error en el SQL");
            e.printStackTrace();
        }finally {
            if (statement!=null){
                try{
                    statement.close();
                }catch (Exception e){
                    System.out.println("Ocurrio un error");
                    e.printStackTrace();
                }
            }
            if (resultSet!=null){
                try{
                    resultSet.close();
                }catch (Exception e){
                    System.out.println("Ocurrio un error");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
        return listaProfesores;
    }

    @Override
    public List<Asignatura> obtenerListaAsignaturas() {
        Statement statement = null;
        ResultSet resultSet = null;
        conexion.establecerConexion();
        List<Asignatura> listaAsignaturas = new ArrayList<>();
        try{
            statement = conexion.getConnection().createStatement();
            resultSet = statement.executeQuery(GETALLASIG);
            while (resultSet.next()){
                listaAsignaturas.add(convertirASIG(resultSet));
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error en el SQL");
            e.printStackTrace();
        }finally {
            if (statement!=null){
                try{
                    statement.close();
                }catch (Exception e){
                    System.out.println("Ocurrio un error");
                    e.printStackTrace();
                }
            }
            if (resultSet!=null){
                try{
                    resultSet.close();
                }catch (Exception e){
                    System.out.println("Ocurrio un error");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
        return listaAsignaturas;
    }

    @Override
    public List<Matricula> obtenerMPorAlumno(long alumno) {
        return null;
    }
}
