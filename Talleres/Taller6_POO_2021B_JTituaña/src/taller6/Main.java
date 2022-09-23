package taller6;

import com.sun.source.tree.CompilationUnitTree;
import taller6.Conexion.Conexion;
import taller6.DAO.AdministradorDAO;
import taller6.DAO.AlumnoDAO;
import taller6.DAO.ProfesorDAO;
import taller6.ImplementacionSQL.MySQLAdministradorDAO;
import taller6.ImplementacionSQL.MySQLAlumnoDAO;
import taller6.ImplementacionSQL.MySQLProfesorDAO;
import taller6.Modelo.Alumno;
import taller6.Modelo.Asignatura;
import taller6.Modelo.Profesor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        Scanner sc = new Scanner(System.in);
        conexion.establecerConexion();

        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña");
        String contrasenia = sc.nextLine();

        String url = "SELECT user_name, password, privilegio, ID FROM usuarios WHERE user_name ='" + usuario + "' && Password='"+ contrasenia +"'";

        try{
            PreparedStatement ps = conexion.getConnection().prepareStatement(url);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("Bienvenido");
                String u = rs.getString("user_name");
                String pass = rs.getString("password");
                String priv = rs.getString("privilegio");
                String ID = rs.getString("ID");
                if(contrasenia.equals(pass)){
                    System.out.println(u);
                    System.out.println("Rol: " + priv);
                    if(priv.equals("alumno")){
                        AlumnoDAO alumno = new MySQLAlumnoDAO(conexion);
                        List<Profesor> profesores = alumno.obtenerListaProfesores();
                        System.out.println("LISTA DE PROFESORES");
                        for (Profesor nuevoprofesor:profesores){
                            System.out.println(nuevoprofesor.toString());
                        }

                        List<Asignatura> asignaturas = alumno.obtenerListaAsignaturas();
                        System.out.println("LISTA DE ASIGNATURAS");
                        for (Asignatura nuevoasignatura :asignaturas){
                            System.out.println(nuevoasignatura.toString());
                        }

                    }
                    else if(priv.equals("profesor")){
                        boolean ok = false;
                        ProfesorDAO profesor = new MySQLProfesorDAO(conexion);
                        List<Alumno> alumnos = profesor.obtenerListaAlumnos();
                        int op;
                        do{
                            System.out.println("----------Menu---------");
                            System.out.println("1.- Lista de alumnos");
                            System.out.println("2.- Buscar un alumno");
                            System.out.println("Escoja una opcion (ingrese 0 para salir): ");
                            op = sc.nextInt();
                            switch (op){
                                case 1:
                                    System.out.println("LISTA DE ALUMNOS");
                                    for (Alumno nuevoalumno:alumnos){
                                        System.out.println(nuevoalumno.toString());
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ingrese el id del estudiante: ");
                                    Long id = sc.nextLong();
                                    Alumno buscaalumno = profesor.obtenerest(id);
                                    System.out.println(buscaalumno);
                                    break;
                            }
                        }while(op!=0);
                    }
                    else if(priv.equals("administrador")){
                        MySQLAdministradorDAO admin = new MySQLAdministradorDAO(conexion);
                        admin.menu();
                    }
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else{
                System.out.println("No existe el usuario");
            }
        }catch (SQLException e){
            System.out.println("Ha ocurrido un error en la base de datos! LLame al administrador");
            e.printStackTrace();
        }

    }
}
