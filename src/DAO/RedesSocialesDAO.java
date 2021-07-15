package DAO;

import Conexion.Conexion;
import Modelo.RRSS;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RedesSocialesDAO implements CrudGeneral<RRSS> {

    @Override
    public ArrayList<RRSS> listar(String nombreRRSS) {
        
        Conexion conexion = new Conexion();

        ArrayList<RRSS> list = new ArrayList<>();

        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM rrss WHERE LOWER(CodigoRS) LIKE LOWER(?) OR LOWER(RRS_NOMBRE) LIKE LOWER(?)");
            smt.setString(1, "%" + nombreRRSS + "%");
            smt.setString(2, "%" + nombreRRSS + "%");

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new RRSS(
                        rs.getInt("ID"),
                        rs.getString("CodigoRS"),
                        rs.getString("RRS_NOMBRE"),                        
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
    public boolean eliminar(String RRSS, int codigoRRSS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String RRSS, int codigoRRSS, RRSS rrss) {
        
        Conexion conexion = new Conexion();

        try {
            String sql = "UPDATE rrss SET RRS_NOMBRE=?, CodigoRS=? WHERE ID=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setString(1, rrss.getRrsNombre());
            stmt.setString(2, rrss.getCodigoRs());
            stmt.setInt(3, rrss.getId());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(RRSS rrss) {

        Conexion conexion = new Conexion();

        try {
            String sql = "INSERT INTO rrss (RRS_NOMBRE, CodigoRs, Activo) VALUES(?, ?, ?)";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setString(1, rrss.getRrsNombre());
            stmt.setString(2, rrss.getCodigoRs());
            stmt.setBoolean(3, rrss.isActivo());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        model.setRowCount(0);

        Conexion conexion = new Conexion();

        ArrayList<RRSS> list = new ArrayList<>();

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM rrss";

            ResultSet rs = smt.executeQuery(sql);

            while (rs.next()) {
                list.add(new RRSS(
                        rs.getInt("ID"),
                        rs.getString("CodigoRS"),
                        rs.getString("RRS_NOMBRE"),                       
                        rs.getBoolean("Activo")
                ));
            }

            Object[] row = new Object[4];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getRrsNombre();
                row[2] = list.get(i).getCodigoRs();
                row[3] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
