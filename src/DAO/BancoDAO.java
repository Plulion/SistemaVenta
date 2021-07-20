package DAO;

import Modelo.Bancos;
import java.sql.PreparedStatement;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BancoDAO implements CrudGeneral<Bancos> {

    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Bancos> listar(String nombreBanco) {

        ArrayList<Bancos> list = new ArrayList<>();

        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM bancos WHERE LOWER(CODIGO_BANCO) LIKE LOWER(?) OR LOWER(BAN_DESCRIPCION) LIKE LOWER(?)");
            smt.setString(1, "%" + nombreBanco + "%");
            smt.setString(2, "%" + nombreBanco + "%");

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new Bancos(
                        rs.getInt("BAN_ID_BANCO"),
                        rs.getString("BAN_DESCRIPCION"),
                        rs.getString("CODIGO_BANCO"),
                        rs.getBoolean("Activo")
                ));
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desactivar(String texto, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String nombreBanco, int codigoBanco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String Banco, int codigoBanco, Bancos banco) {

        try {
            String sql = "UPDATE bancos SET BAN_DESCRIPCION=?, CODIGO_BANCO=?, Activo=? WHERE BAN_ID_BANCO=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setString(1, banco.getBAN_DESCRIPCION());
            stmt.setString(2, banco.getCODIGO_BANCO());
            stmt.setBoolean(3, banco.isActivo());
            stmt.setInt(4, banco.getBAN_ID_BANCO());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Bancos banco) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            String sql = "INSERT INTO bancos (BAN_ID_BANCO, BAN_DESCRIPCION, CODIGO_BANCO, Activo) VALUES(?, ?, ?, ?) ON DUPLICATE KEY UPDATE BAN_DESCRIPCION=?, CODIGO_BANCO=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setInt(1, banco.getBAN_ID_BANCO());
            stmt.setString(2, banco.getBAN_DESCRIPCION());
            stmt.setString(3, banco.getCODIGO_BANCO());
            stmt.setBoolean(4, banco.isActivo());

            stmt.setString(5, banco.getBAN_DESCRIPCION());
            stmt.setString(6, banco.getCODIGO_BANCO());
            stmt.setBoolean(7, banco.isActivo());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        model.setRowCount(0);

        ArrayList<Bancos> list = new ArrayList<>(); // esta lista esta vacia

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM bancos";

            ResultSet rs = smt.executeQuery(sql); //obtengo lista de datos 

            while (rs.next()) {//[{4342, soyCod, santadner, true},{4342, soyCod, santadner, true},{4342, soyCod, santadner, true}}   ]
                list.add(new Bancos(
                        rs.getInt("BAN_ID_BANCO"),                        
                        rs.getString("BAN_DESCRIPCION"),                      
                        rs.getString("CODIGO_BANCO"),
                        rs.getBoolean("Activo")
                ));
            }
            
            //lista de bancos con 20 bancos

            Object[] row = new Object[4];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getBAN_ID_BANCO();
                row[1] = list.get(i).getCODIGO_BANCO();
                row[2] = list.get(i).getBAN_DESCRIPCION();
                row[3] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
