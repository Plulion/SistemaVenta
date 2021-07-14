package DAO;

import Conexion.Conexion;
import Modelo.RRSS;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ImplementRRSS implements IRRSS{

    @Override
    public ArrayList<RRSS> listarRRSS(String nombreRRSS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRRSS(String RRSS, int codigoRRSS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRRSS(String RRSS, int codigoRRSS, RRSS rrss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarRRSS(RRSS rrss) {       
        
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
                        rs.getString("RRS_NOMBRE"),
                        rs.getString("CodigoRS"),
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
