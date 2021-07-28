/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Categorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class CategoriaDAO implements CrudGeneral<Categorias> {

    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Categorias> listar(String nombreCategoria) {

        ArrayList<Categorias> list = new ArrayList<>();

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                PreparedStatement smt = conn.prepareStatement("SELECT * FROM categoria_articulo WHERE LOWER(idCatArt) LIKE LOWER(?) OR LOWER(CATEGORIA) LIKE LOWER(?)");
                smt.setString(1, "%" + nombreCategoria + "%");
                smt.setString(2, "%" + nombreCategoria + "%");

                ResultSet rs = smt.executeQuery();

                while (rs.next()) {
                    list.add(new Categorias(
                            rs.getInt("idCatArt"),
                            rs.getString("CATEGORIA"),
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

//        try {
//            String sql = "UPDATE categoria_articulo SET Activo=? WHERE ID=?";
//            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
//
//            stmt.setBoolean(1, false);
//            stmt.setInt(2, id);
//
//            stmt.executeUpdate();
//
//            return true;
//
//        } catch (Exception e) {
//            System.err.println("ERROR: " + e);
//        }
//        return false;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(String texto, int id, Categorias categoria) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {
                String sql = "UPDATE categoria_articulo SET CATEGORIA=?, Activo=? WHERE idCarArt=?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, categoria.getCategoria());
                stmt.setBoolean(2, categoria.isActivo());
                stmt.setInt(3, categoria.getId());

                stmt.executeUpdate();

                stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
            return true;

        }
        return false;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Categorias categoria) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try { // la linea de abajo Inserta un nuevo valor. Pero si le llega un id que ya existe lo actualiza
                String sql = "INSERT INTO categoria_articulo (idCatArt, CATEGORIA, Activo) VALUES(?, ?, ?) ON DUPLICATE KEY UPDATE CATEGORIA=?, Activo=?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setInt(1, categoria.getId());
                stmt.setString(2, categoria.getCategoria());
                stmt.setBoolean(3, categoria.isActivo());

                stmt.setString(4, categoria.getCategoria());
                stmt.setBoolean(5, categoria.isActivo());

                stmt.executeUpdate();

                stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
            return true;
        }
        return false;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {

        Connection conn = conexion.conectar();

        if (conexion != null) {

            model.setRowCount(0);

            ArrayList<Categorias> list = new ArrayList<>();

            try {

                Statement smt = conn.createStatement();

                String sql = "SELECT * FROM categoria_articulo";

                ResultSet rs = smt.executeQuery(sql);

                while (rs.next()) {
                    list.add(new Categorias(
                            rs.getInt("idCatArt"),
                            rs.getString("CATEGORIA"),
                            rs.getBoolean("Activo")
                    ));
                }

                Object[] row = new Object[3];

                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getId();
                    row[1] = list.get(i).getCategoria();
                    row[2] = list.get(i).isActivo();

                    model.addRow(row);
                }

                rs.close();
                smt.close();
            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.desconectar();
            }

        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet obtenerTodasCategorias() throws SQLException {

        Connection conn = conexion.conectar();

        ResultSet cat = null;

        if (conn != null) {

            Statement smt = conn.createStatement();

            try {

                String sql = "SELECT * FROM categoria_articulo";
                cat = smt.executeQuery(sql);

            } catch (SQLException e) {
                System.err.println("ERROR: Al obtener categorias " + e);
            } finally {
//                if (smt != null) {
//                    smt.close();
//                }
                //conexion.desconectar();
            }
        }
        return cat;
    }
}
