package DAO;

import Conexion.Conexion;
import Modelo.Packs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class PackDAO implements CrudGeneral<Packs> {

    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Packs> listar(String nombrePack) {

        ArrayList<Packs> list = new ArrayList<>();

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                PreparedStatement smt = conn.prepareStatement("SELECT * FROM packs WHERE LOWER(PCK_NOMBRE) LIKE LOWER(?)");
                smt.setString(1, "%" + nombrePack + "%");

                ResultSet rs = smt.executeQuery();

                while (rs.next()) {
                    list.add(new Packs(
                            rs.getInt("ID_PACK"),
                            rs.getInt("ID_CATEGORIA"),
                            rs.getString("PCK_NOMBRE"),
                            rs.getInt("PCK_COSTO"),
                            rs.getInt("PCK_STOCK"),
                            rs.getBoolean("Activo")
                    ));
                }

                rs.close();
                smt.close();
            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.conectar();
            }
        }

        return list;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String texto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desactivar(String texto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String texto, int id, Packs clase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Packs clase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
