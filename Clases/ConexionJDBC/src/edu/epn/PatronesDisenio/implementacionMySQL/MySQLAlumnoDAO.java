package edu.epn.PatronesDisenio.implementacionMySQL;

import edu.epn.Conexion.Conexion;
import edu.epn.PatronesDisenio.Modelo.Alumno;
import edu.epn.PatronesDisenio.dao.AlumnoDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySQLAlumnoDAO implements AlumnoDAO {
    //poner las sentencias SQL que nos permite la manipulacion de mi BDD de acuerdo a lo que necesito
    final String INSERT="INSERT INTO alumnos (nombre, apellidos, fecha_nac) VALUES (?,?,?);";
    final String UPDATE= "UPDATE alumnos SET nombre = ?, apellidos = ?, fecha_nac = ? WHERE id_alumno = ?";
    final String DELETE = "DELETE FROM alumnos WHERE id_alumno = ?";
    final String GETALL= "SELECT nombre, apellidos, fecha_nac FROM alumnos";
    final String GETONE= "SELECT nombre, apellidos, fecha_nac FROM alumnos where id_alumno = ? ";

    private Conexion conexion;

    public MySQLAlumnoDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void insertar(Alumno alumno) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(INSERT);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2,alumno.getApellido());
            preparedStatement.setDate(3, new Date(alumno.getFechaNacimiento().getTime()));
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO EL ALUMNO CORRECTAMENTE");
            }
            System.out.println("ALUMNO INSERTADO CORRECTAMENTE");
        }catch (SQLException e){
            System.out.println("ERROR CON LA SENTENCIA SQL...");
            e.printStackTrace();
        }finally {
            if(preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    System.out.println("ERROR EN EL SQL");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();

    }

    @Override
    public void modificar(Alumno alumno) {

    }

    @Override
    public void eliminar(Alumno alumno) {

    }

    @Override
    public Alumno obtener(Long id) {
        return null;
    }

    @Override
    public List<Alumno> obtenerListaAlumnos() {
        return null;
    }
}
