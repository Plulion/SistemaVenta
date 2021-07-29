package DAO;

import Modelo.Comunas;
import java.sql.PreparedStatement;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ComunaDAO implements CrudGeneral<Comunas> {

    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Comunas> listar(String nombreComuna) {

        ArrayList<Comunas> list = new ArrayList<>();

        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM comunas WHERE LOWER(CODIGO_COMUNAS) LIKE LOWER(?) OR LOWER(COM_DESCRIPCION) LIKE LOWER(?)");
            smt.setString(1, "%" + nombreComuna + "%");
            smt.setString(2, "%" + nombreComuna + "%");

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new Comunas(
                        rs.getInt("idComuna"),
                        rs.getString("COM_DESCRIPCION"),
                        rs.getString("CODIGO_COMUNAS"),
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
    public boolean eliminar(String nombreComuna, int codigoComuna) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String Comunas, int codigoComuna, Comunas comuna) {

        try {
            String sql = "UPDATE comunas SET COM_DESCRIPCION=?, CODIGO_COMUNAS=?, Activo=? WHERE CODIGO_COMUNAS=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setString(1, comuna.getDescripcionComuna());
            stmt.setString(2, comuna.getCodigoComuna());
            stmt.setBoolean(3, comuna.isActivo());
            stmt.setInt(4, comuna.getIdComuna());

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Comunas comuna) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        try {
            String sql = "INSERT INTO comunas (idComuna, COM_DESCRIPCION, CODIGO_COMUNAS, Activo) VALUES(?, ?, ?, ?) ON DUPLICATE KEY UPDATE COM_DESCRIPCION=?, CODIGO_COMUNAS=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setInt(1, comuna.getIdComuna());
            stmt.setString(2, comuna.getDescripcionComuna());
            stmt.setString(3, comuna.getCodigoComuna());
            stmt.setBoolean(4, comuna.isActivo());

            stmt.setString(5, comuna.getDescripcionComuna());
            stmt.setString(6, comuna.getCodigoComuna());
            stmt.setBoolean(7, comuna.isActivo());

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

        ArrayList<Comunas> list = new ArrayList<>();

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM comunas";

            ResultSet rs = smt.executeQuery(sql);

            while (rs.next()) {
                list.add(new Comunas(
                        rs.getInt("idComuna"),
                        rs.getString("COM_DESCRIPCION"),
                        rs.getString("CODIGO_COMUNAS"),
                        rs.getBoolean("Activo")
                ));
            }

            Object[] row = new Object[4];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getIdComuna();
                row[1] = list.get(i).getCodigoComuna();
                row[2] = list.get(i).getDescripcionComuna();
                row[3] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
