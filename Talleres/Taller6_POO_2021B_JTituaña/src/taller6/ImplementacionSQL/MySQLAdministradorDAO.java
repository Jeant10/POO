package taller6.ImplementacionSQL;

import taller6.Conexion.Conexion;
import taller6.DAO.AdministradorDAO;
import taller6.DAO.AlumnoDAO;
import taller6.Modelo.Alumno;
import taller6.Modelo.Asignatura;
import taller6.Modelo.Matricula;
import taller6.Modelo.Profesor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySQLAdministradorDAO implements AdministradorDAO {

    final String INSERTALUM = "INSERT INTO alumnos (nombre, apellidos, fecha_nac) VALUES (?,?,?);";
    final String UPDATEALUM = "UPDATE alumnos SET nombre = ?, apellidos = ?, fecha_nac = ? WHERE id_alumno = ?";
    final String DELETEALUM = "DELETE FROM alumnos WHERE id_alumno = ?";
    final String GETALLALUM = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos";
    final String GETONEALUM = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos where id_alumno = ? ";

    final String INSERTPROF="INSERT INTO profesores (nombre, apellidos) VALUES (?,?);";
    final String UPDATEPROF= "UPDATE profesores SET nombre = ?, apellidos = ? WHERE id_profesor = ?";
    final String DELETEPROF = "DELETE FROM profesores WHERE id_profesor = ?";
    final String GETALLPROF= "SELECT id_profesor, nombre, apellidos FROM profesores";
    final String GETONEPROF= "SELECT id_profesor, nombre, apellidos FROM profesores where id_profesor = ? ";

    final String INSERTASIG="INSERT INTO asignaturas (nombre, profesor) VALUES (?,?);";
    final String UPDATEASIG= "UPDATE asignaturas SET nombre = ?, profesor = ? WHERE id_asignatura = ?";
    final String DELETEASIG = "DELETE FROM asignaturas WHERE id_asignatura = ?";
    final String GETALLASIG= "SELECT nombre, profesor FROM asignaturas";
    final String GETONEASIG= "SELECT nombre, profesor FROM asignaturas where id_asignatura = ? ";

    final String INSERTMATRI="INSERT INTO matriculas (alumno, asignatura, fecha, nota) VALUES (?,?,?,?);";
    final String UPDATEMATRI="UPDATE matriculas SET alumno = ?, asignatura = ?, fecha = ?, nota = ? WHERE asignatura = ?";
    final String DELETEMATRI= "DELETE FROM matriculas WHERE asignatura = ?";
    final String GETALLMATRI ="select * from matriculas";
    final String GETONEMATRI="SELECT alumno, asignatura, fecha, nota FROM matriculas where asignatura = ? ";
    final String GETALUMNOMATRI="select alumno, asignatura, fecha, nota from matriculas where alumno = ?";
    final String GETASIGNATURAMATRI = GETALLMATRI+" where asignatura = ?";

    private Conexion conexion;
    Scanner sc = new Scanner(System.in);

    public MySQLAdministradorDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    public void menu(){
        int op;
        do{
            System.out.println("---------Sistema de gestion academica-------");
            System.out.println("1.-Alumnos");
            System.out.println("2.-Estudiantes");
            System.out.println("3.-Asignaturas");
            System.out.println("4.-Matriculas");
            System.out.println("Escoja una opcion (ingrese 0 para salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    menuestudiantes();
                    break;
                case 2:
                    menuprofesores();
                    break;
                case 3:
                    menuasignaturas();
                    break;
                case 4:
                    menumatriculas();
                    break;
            }
        }while(op!=0);
    }

    public void menuestudiantes(){
        AdministradorDAO admin = new MySQLAdministradorDAO(conexion);
        int op;
        do{
            System.out.println("---------Apartado: Alumnos-------");
            System.out.println("1.-Crear");
            System.out.println("2.-Modificar");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Lista de alumnos");
            System.out.println("Escoja una opcion (ingrese 0 para salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    String nom = sc.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String ap = sc.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento: ");
                    System.out.println("Dia: ");
                    int d = sc.nextInt();
                    System.out.println("Mes: ");
                    int m = sc.nextInt();
                    System.out.println("Año: ");
                    int a = sc.nextInt();
                    admin.insertar(new Alumno(nom,ap,new Date(d,m,a)));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!=0);
    }
    public void menuprofesores(){
        int op;
        do{
            System.out.println("---------Apartado: Profesores-------");
            System.out.println("1.-Crear");
            System.out.println("2.-Modificar");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Lista de profesores");
            System.out.println("Escoja una opcion (ingrese 0 para salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!=0);
    }
    public void menuasignaturas(){
        int op;
        do{
            System.out.println("---------Apartado: Asignaturas-------");
            System.out.println("1.-Crear");
            System.out.println("2.-Modificar");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Lista de Asignaturas");
            System.out.println("Escoja una opcion (ingrese 0 para salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!=0);
    }
    public void menumatriculas(){
        int op;
        do{
            System.out.println("---------Apartado: Matriculas------");
            System.out.println("1.-Crear");
            System.out.println("2.-Modificar");
            System.out.println("3.-Eliminar");
            System.out.println("4.-Lista de matriculas");
            System.out.println("Escoja una opcion (ingrese 0 para salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!=0);
    }


    @Override
    public void insertar(Alumno alumno) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(INSERTALUM);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setDate(3, new Date(alumno.getFechaNacimiento().getTime()));
            if (preparedStatement.executeUpdate() == 0) {
                System.out.println("NO SE HA INSERTADO EL ALUMNO CORRECTAMENTE");
            }
            System.out.println("ALUMNO INSERTADO CORRECTAMENTE");
        } catch (SQLException e) {
            System.out.println("ERROR CON LA SENTENCIA SQL...");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println("ERROR EN EL SQL");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
    }

    @Override
    public void modificar(Alumno alumno) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(UPDATEALUM);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setDate(3, new Date(alumno.getFechaNacimiento().getTime()));
            preparedStatement.setLong(4, alumno.getId());
            if (preparedStatement.executeUpdate() == 0) {
                System.out.println("NO SE HA MODIFICADO EL ALUMNO CORRECTAMENTE");
            }
            System.out.println("ALUMNO MODIFICADO CORRECTAMENTE");
        } catch (SQLException e) {
            System.out.println("ERROR CON LA SENTENCIA SQL...");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println("ERROR EN EL SQL");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
    }

    @Override
    public void eliminar(Alumno alumno) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(DELETEALUM);
            preparedStatement.setLong(1, alumno.getId());
            if (preparedStatement.executeUpdate() == 0) {
                System.out.println("NO SE HA ELIMINADO EL ALUMNO CORRECTAMENTE");
            }
            System.out.println("ALUMNO ELIMINADO CORRECTAMENTE");
        } catch (SQLException e) {
            System.out.println("ERROR CON LA SENTENCIA SQL...");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    System.out.println("ERROR EN EL SQL");
                    e.printStackTrace();
                }
            }
        }
        conexion.cerrarConexion();
    }

    private Alumno convertiralum(ResultSet resultSet) throws SQLException {
        String nombreAux = resultSet.getString("nombre");
        String apellidosAux = resultSet.getString("apellidos");
        Date fechaNacimientoAux = resultSet.getDate("fecha_nac");
        Alumno alumnoAux = new Alumno(nombreAux, apellidosAux, fechaNacimientoAux);
        alumnoAux.setId(resultSet.getLong("id_alumno"));

        return alumnoAux;
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
                alumno = convertiralum(resultSet);
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
                listaAlumnos.add(convertiralum(resultSet));
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
    public void insertar(Profesor profesor) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(INSERTPROF);
            preparedStatement.setString(1, profesor.getNombre());
            preparedStatement.setString(2, profesor.getApellidos());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO EL PROFESOR CORRECTAMENTE");
            }
            System.out.println("PROFESOR INSERTADO CORRECTAMENTE");
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
    public void modificar(Profesor profesor) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(UPDATEPROF);
            preparedStatement.setString(1, profesor.getNombre());
            preparedStatement.setString(2, profesor.getApellidos());
            preparedStatement.setLong(3, profesor.getId());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO EL PROFESOR CORRECTAMENTE");
            }
            System.out.println("PROFESOR INSERTADO CORRECTAMENTE");
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
    public void eliminar(Profesor profesor) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(DELETEPROF);
            preparedStatement.setLong(1, profesor.getId());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO EL PROFESOR CORRECTAMENTE");
            }
            System.out.println("PROFESOR INSERTADO CORRECTAMENTE");
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

    private Profesor convertirprof(ResultSet resultSet) throws SQLException{
        String nombreAux = resultSet.getString("nombre");
        String apellidoAux = resultSet.getString("apellidos");
        Profesor profesorAUx = new Profesor(nombreAux, apellidoAux);
        profesorAUx.setId(resultSet.getLong("id_profesor"));
        return profesorAUx;
    }

    @Override
    public Profesor obtenerprof(Long id) {
        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Profesor profesor = null;
        try{
            preparedStatement = conexion.getConnection().prepareStatement(GETONEPROF) ;
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                profesor = convertirprof(resultSet);
            }else{
                System.out.println("no se ha encontrado el registro del alumno");
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error en el SQL");
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
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
        return profesor;
    }

    @Override
    public List<Profesor> obtenerListaProfesores() {
        Statement statement = null;
        ResultSet resultSet = null;
        conexion.establecerConexion();
        List<Profesor> listaProfesores = new ArrayList<>();
        try{
            statement = conexion.getConnection().createStatement();
            resultSet = statement.executeQuery(GETALLPROF);
            while (resultSet.next()){
                listaProfesores.add(convertirprof(resultSet));
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
    public void insertar(Asignatura asignatura) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(INSERTASIG);
            preparedStatement.setString(1, asignatura.getNombre());
            preparedStatement.setLong(2, asignatura.getIdProfesor());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA ASIGNATURA CORRECTAMENTE");
            }
            System.out.println("ASIGNATURA INSERTADA CORRECTAMENTE");
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
    public void modificar(Asignatura asignatura) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(UPDATEASIG);
            preparedStatement.setString(1, asignatura.getNombre());
            preparedStatement.setLong(2, asignatura.getIdProfesor());
            preparedStatement.setLong(3, asignatura.getId());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA ASIGNATURA CORRECTAMENTE");
            }
            System.out.println("ASIGNATURA INSERTADA CORRECTAMENTE");
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
    public void eliminar(Asignatura asignatura) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(DELETEASIG);
            preparedStatement.setLong(1, asignatura.getId());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA ASIGNATURA CORRECTAMENTE");
            }
            System.out.println("ASIGNATURA INSERTADA CORRECTAMENTE");
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

    private Asignatura convertirASIG(ResultSet resultSet) throws SQLException {
        String nombreAux = resultSet.getString("nombre");
        Long profesorAux = resultSet.getLong("profesor");
        Asignatura asignaturaAUx = new Asignatura(nombreAux, profesorAux);
        asignaturaAUx.setId(resultSet.getLong("id_asignatura"));
        return asignaturaAUx;
    }

    @Override
    public Asignatura obtenerasig(Long id) {
        Conexion conexion = new Conexion();
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Asignatura asignatura = null;
        try{
            preparedStatement = conexion.getConnection().prepareStatement(GETONEASIG) ;
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                asignatura = convertirASIG(resultSet);
            }else{
                System.out.println("no se ha encontrado el registro del alumno");
            }
        }catch (Exception e){
            System.out.println("Ocurrio un error en el SQL");
            e.printStackTrace();
        }finally {
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
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
        return asignatura;
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
    public void insertar(Matricula matricula) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(INSERTMATRI);
            preparedStatement.setLong(1, matricula.getId().getAlumno());
            preparedStatement.setLong(2, matricula.getId().getAsignatura());
            preparedStatement.setInt(3, matricula.getId().getAnio());
            preparedStatement.setLong(4, matricula.getNota());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA MATRICULA CORRECTAMENTE");
            }
            System.out.println("MATRICULA INSERTADA CORRECTAMENTE");
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
    public void modificar(Matricula matricula) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(UPDATEMATRI);
            preparedStatement.setLong(1, matricula.getId().getAlumno());
            preparedStatement.setLong(2, matricula.getId().getAsignatura());
            preparedStatement.setInt(3, matricula.getId().getAnio());
            preparedStatement.setLong(4, matricula.getNota());
            preparedStatement.setLong(5, matricula.getId().getAsignatura());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA MATRICULA CORRECTAMENTE");
            }
            System.out.println("MATRICULA INSERTADA CORRECTAMENTE");
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
    public void eliminar(Matricula matricula) {
        conexion.establecerConexion();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conexion.getConnection().prepareStatement(DELETEMATRI);
            preparedStatement.setLong(1, matricula.getId().getAsignatura());
            if (preparedStatement.executeUpdate()==0){
                System.out.println("NO SE HA INSERTADO LA ASIGNATURA CORRECTAMENTE");
            }
            System.out.println("ASIGNATURA INSERTADA CORRECTAMENTE");
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

    private Matricula convertirMatri(ResultSet resultSet) throws SQLException {
        long alumno = resultSet.getLong("alumno");
        long asignatura = resultSet.getLong("asignatura");
        int anio = resultSet.getInt("fecha");
        Integer nota = resultSet.getInt("nota");
        if(resultSet.wasNull()){
            nota=null;
        }
        Matricula matricula = new Matricula(alumno,asignatura,anio);
        matricula.setNota(nota);
        return matricula;
    }

    @Override
    public Matricula obtenermatri(Long id) {
        return null;
    }

    @Override
    public List<Matricula> obtenerMPorAlumno(long alumno) {
        return null;
    }
}
