//esto lo comento un intruso
//esto lo comento el intruso desde el pec del pedro
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//Conexion Base

public class Conexion {

//Probando base de datos online: Funciona lenta y acepta pocas conexiones :(
//    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
//    private final String URL = "jdbc:mysql://bszfpxheckrsqmpxiw0s-mysql.services.clever-cloud.com:3306/";
//    private final String DB = "bszfpxheckrsqmpxiw0s";
//    private final String USER = "unhvncuuqmi9ttmz";
//    private final String PASSWORD = "Lu2WRK5ycD2CEb8jOVl7";
    
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "dg";
    private final String USER = "root";
    private final String PASSWORD = "";

    public Connection cadena;
    public static Conexion instancia;

    public Conexion() {
        this.cadena = null;
    }

    public Connection conectar() {
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL + DB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }

    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public synchronized static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
