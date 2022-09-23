package edu.epn;

import edu.epn.Conexion.Conexion;
import edu.epn.PatronesDisenio.Modelo.Alumno;
import edu.epn.PatronesDisenio.dao.AlumnoDAO;
import edu.epn.PatronesDisenio.implementacionMySQL.MySQLAlumnoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Connection connection = null;
        String jdbc = "jdbc:mysql://localhost:3306/ejemplojdbc2021b";
        try {
            connection = DriverManager.getConnection(jdbc, "ejemplojdbc2021b", "e2jemplojdbc2021b*");
            System.out.println("Se logro la conexion \n estoy dentro de la BDD :)");
        }catch (SQLException sql){
            System.out.println("Algo paso y no se logro la conexion...");
            sql.printStackTrace();

        }finally {
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }*/

        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        try{
            AlumnoDAO daoAlumno = new MySQLAlumnoDAO(conexion);
            Alumno alumno = new Alumno("Gabriela","Maldonado", new Date(91,4,5));
            daoAlumno.insertar(alumno);
        }catch (Exception e){
            System.out.println("OCURRIO UN ERROR");
            e.printStackTrace();
        }finally {
            conexion.cerrarConexion();
        }

    }

    //CRUD
    //patrones de disenio
    // DAO --- DATA ACCESS OBJECT

    //aqui es donde programamos el famoso CRUD

    //MVC --- MODELO VISTA CONTROLADOR
    //Modelo- acceso a los datos guardar, actualizar, obtener.... logica del negocio
    // aqui estan las clases de JAVA

    //Vista- presentacion de datos del modelo es decir lo que ve el usuario --- main imprimir menu

    //Controlador - conecta el modelo con la vista





















}
