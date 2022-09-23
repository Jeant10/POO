package taller6.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection connection;
    private String jdbc = "jdbc:mysql://localhost:3306/esfot";
    private String usuario=  "administrador";
    private String contrasenia = "admin1234";

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void establecerConexion() {

        try {
            connection = DriverManager.getConnection(jdbc,usuario ,contrasenia);
        } catch (SQLException sql) {
            System.out.println("Algo paso y no se logro la conexion...");
            sql.printStackTrace();
        }

    }

    public void cerrarConexion (){

        if (connection!=null){
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

}
