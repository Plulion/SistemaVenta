package DAO;

import Modelo.Bancos;
import java.sql.PreparedStatement;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ImplementBanco implements IBanco {

    @Override
    public ArrayList<Bancos> listarBanco(String nombreBanco) {

        Conexion conexion = new Conexion();

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
                        rs.getString("CODIGO_BANCO")
                ));
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarBanco(String nombreBanco, int codigoBanco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco) {

        Conexion conexion = new Conexion();

        try {
            String sql = "UPDATE bancos SET BAN_DESCRIPCION=?, CODIGO_BANCO=? WHERE BAN_ID_BANCO=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            //stmt.setInt(1, banco.getBAN_ID_BANCO());
            stmt.setString(1, banco.getBAN_DESCRIPCION());
            stmt.setString(2, banco.getCODIGO_BANCO());
            stmt.setInt(3, banco.getBAN_ID_BANCO());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarBanco(Bancos banco) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        Conexion conexion = new Conexion();

        try {
            String sql = "INSERT INTO bancos (BAN_DESCRIPCION, CODIGO_BANCO) VALUES(?, ?)";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            //stmt.setInt(1, banco.getBAN_ID_BANCO());
            stmt.setString(1, banco.getBAN_DESCRIPCION());
            stmt.setString(2, banco.getCODIGO_BANCO());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        model.setRowCount(0);

        Conexion conexion = new Conexion();

        ArrayList<Bancos> list = new ArrayList<>();

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM bancos";

            ResultSet rs = smt.executeQuery(sql);

            while (rs.next()) {
                list.add(new Bancos(
                        rs.getInt("BAN_ID_BANCO"),
                        rs.getString("BAN_DESCRIPCION"),
                        rs.getString("CODIGO_BANCO")
                ));
            }

            Object[] row = new Object[3];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getBAN_ID_BANCO();
                row[1] = list.get(i).getCODIGO_BANCO();
                row[2] = list.get(i).getBAN_DESCRIPCION();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
