package DAO;

import Modelo.Usuarios;
import java.sql.PreparedStatement;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class UsuariosDAO implements CrudGeneral<Usuarios> {

    Conexion conexion = new Conexion();
    public Statement sentencia;
    public ResultSet resultado;
   
    public ArrayList<Usuarios> listar(String nombreUsuario) {

        ArrayList<Usuarios> list = new ArrayList<>();

        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM Usuario WHERE LOWER(USU_CLAVE) LIKE LOWER(?) OR LOWER(USU_NOMBRE) LIKE LOWER(?)");
            smt.setString(1, "%" + nombreUsuario + "%");
            smt.setString(2, "%" + nombreUsuario + "%");

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new Usuarios(
                        rs.getInt("USU_ID_USUARIO"),
                        rs.getString("USU_NOMBRE"),
                        rs.getString("USU_CLAVE"),
                        rs.getBoolean("Activo")
                ));
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        return list;
       
    }

  
    public boolean desactivar(String texto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    public boolean eliminar(String usuario, int clave) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

  
    public boolean actualizar(String Usuario, int clave, Usuarios usuario) {

        try {
            String sql = "UPDATE usuarios SET USU_NOMBRE=?, USU_CLAVE=?, Activo=? WHERE USU_ID_USUARIO=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setString(1, usuario.getUSU_NOMBRE());
            stmt.setString(2, usuario.getUSU_CLAVE());
            stmt.setBoolean(3, usuario.isActivo());
            stmt.setInt(4, usuario.getUSU_ID_USUARIO());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

        
    }

  
    public boolean agregar(Usuarios usuario) {
       

        try {
            String sql = "INSERT INTO usuario (USU_ID_USUARIO, USU_NOMBRE, USU_CLAVE, Activo) VALUES(?, ?, ?, ?) ON DUPLICATE KEY UPDATE USU_NOMBRE=?, USU_CLAVE=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setInt(1, usuario.getUSU_ID_USUARIO());
            stmt.setString(2, usuario.getUSU_NOMBRE());
            stmt.setString(3, usuario.getUSU_CLAVE());
            stmt.setBoolean(4, usuario.isActivo());

            stmt.setString(5, usuario.getUSU_NOMBRE());
            stmt.setString(6, usuario.getUSU_CLAVE());
            stmt.setBoolean(7, usuario.isActivo());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    }

   
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        model.setRowCount(0);

        ArrayList<Usuarios> list = new ArrayList<>(); 

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM usuario";

            ResultSet rs = smt.executeQuery(sql); 

            while (rs.next()) {   
                list.add(new Usuarios(
                        rs.getInt("USU_ID_USUARIO"),                        
                        rs.getString("USU_NOMBRE"),                      
                        rs.getString("USU_CLAVE"),
                        rs.getBoolean("Activo")
                ));
            }
            
            

            Object[] row = new Object[4];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getUSU_ID_USUARIO();
                row[1] = list.get(i).getUSU_CLAVE();
                row[2] = list.get(i).getUSU_NOMBRE();
                row[3] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        
    }

   
    public Statement CreateStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
   
}
