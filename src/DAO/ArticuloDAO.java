/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Articulos;
import Modelo.Categorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class ArticuloDAO implements CrudGeneral<Articulos> {

    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Articulos> listar(String nombreArticulo) {

        ArrayList<Articulos> list = new ArrayList<>();

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                String sql;
                sql = "SELECT articulo.ART_ID_ARTICULO, articulo.ART_CODIGO, articulo.ART_DESCRIPCION, articulo.ART_STOCK, articulo.ART_FECHA_VENCIMIENTO, articulo.ART_MARCA, categoria_articulo.idCatArt, categoria_articulo.CATEGORIA, proveedor.PRO_RUT_PROVEEDOR, proveedor.PRO_NOMBRE, articulo.Activo \n"
                        + "FROM articulo\n"
                        + "LEFT JOIN categoria_articulo ON articulo.CAT_ID_CATEGORIA = categoria_articulo.idCatArt\n"
                        + "LEFT JOIN facturadetalle ON articulo.ART_ID_ARTICULO = facturadetalle.ARTICULO_ART_ID_ARTICULO\n"
                        + "LEFT JOIN factura ON facturadetalle.FAC_ID_FACTURA = factura.FAC_ID_FACTURA\n"
                        + "LEFT JOIN proveedor ON factura.PRO_fk_PROVEEDOR = proveedor.PRO_RUT_PROVEEDOR\n"
                        + "WHERE LOWER(articulo.ART_CODIGO) LIKE LOWER(?) OR LOWER(articulo.ART_DESCRIPCION) LIKE LOWER(?) OR LOWER(categoria_articulo.CATEGORIA) LIKE LOWER(?) OR LOWER(categoria_articulo.CATEGORIA) LIKE LOWER(?)";

                PreparedStatement smt = conn.prepareStatement(sql);
                smt.setString(1, "%" + nombreArticulo + "%");
                smt.setString(2, "%" + nombreArticulo + "%");
                smt.setString(3, "%" + nombreArticulo + "%");
                smt.setString(4, "%" + nombreArticulo + "%");

                ResultSet rs = smt.executeQuery();

                while (rs.next()) {
                    list.add(new Articulos(
                            rs.getInt("ART_ID_ARTICULO"),
                            rs.getInt("idCatArt"),
                            rs.getInt("PRO_RUT_PROVEEDOR"),
                            rs.getString("CATEGORIA"),
                            rs.getString("PRO_NOMBRE"),
                            rs.getString("ART_DESCRIPCION"),
                            rs.getString("ART_MARCA"),
                            rs.getInt("ART_STOCK"),
                            rs.getString("ART_CODIGO"),
                            rs.getDate("ART_FECHA_VENCIMIENTO"),
                            rs.getBoolean("Activo")
                    ));
                }

            } catch (Exception e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.desconectar();
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
    public boolean actualizar(String texto, int id, Articulos articulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Articulos articulo) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try { // la linea de abajo Inserta un nuevo valor. Pero si le llega un id que ya existe lo actualiza
                String sql;
                sql = "INSERT INTO articulo (ART_ID_ARTICULO, CAT_ID_CATEGORIA, ART_DESCRIPCION, ART_MARCA, ART_STOCK, ART_CODIGO, ART_FECHA_VENCIMIENTO, Activo) VALUES(?, ?, ?, ?, ?, ?, ?, ?)"
                        + " ON DUPLICATE KEY UPDATE CAT_ID_CATEGORIA=?, ART_DESCRIPCION=?, ART_MARCA=?, ART_STOCK=?, ART_CODIGO=?, ART_FECHA_VENCIMIENTO=?, Activo=?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                if (articulo.getCat_id() < 1) {
                    stmt.setNull(2, java.sql.Types.INTEGER);
                    stmt.setNull(9, java.sql.Types.INTEGER);
                } else {
                    stmt.setInt(2, articulo.getCat_id());
                    stmt.setInt(9, articulo.getCat_id());
                }

                stmt.setInt(1, articulo.getArt_id());
                stmt.setString(3, articulo.getArt_descripcion());
                stmt.setString(4, articulo.getArt_marca());
                stmt.setInt(5, articulo.getArt_stock());
                stmt.setString(6, articulo.getArt_codigo());
                stmt.setDate(7, new java.sql.Date(articulo.getArt_fecha_vencimiento().getTime()));
                stmt.setBoolean(8, articulo.isActivo());

                stmt.setString(10, articulo.getArt_descripcion());
                stmt.setString(11, articulo.getArt_marca());
                stmt.setInt(12, articulo.getArt_stock());
                stmt.setString(13, articulo.getArt_codigo());
                stmt.setDate(14, new java.sql.Date(articulo.getArt_fecha_vencimiento().getTime()));
                stmt.setBoolean(15, articulo.isActivo());

                stmt.executeUpdate();

            } catch (Exception e) {
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

        model.setRowCount(0);

        ArrayList<Articulos> list = new ArrayList<>();

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                Statement smt = conn.createStatement();

                String sql = "SELECT articulo.ART_ID_ARTICULO, articulo.ART_CODIGO, articulo.ART_DESCRIPCION, articulo.ART_STOCK, articulo.ART_FECHA_VENCIMIENTO, articulo.ART_MARCA, categoria_articulo.idCatArt, categoria_articulo.CATEGORIA, proveedor.PRO_RUT_PROVEEDOR, proveedor.PRO_NOMBRE, articulo.Activo \n"
                        + "FROM articulo\n"
                        + "LEFT JOIN categoria_articulo ON articulo.CAT_ID_CATEGORIA = categoria_articulo.idCatArt\n"
                        + "LEFT JOIN  facturadetalle ON articulo.ART_ID_ARTICULO = facturadetalle.ARTICULO_ART_ID_ARTICULO\n"
                        + "LEFT JOIN factura ON facturadetalle.FAC_ID_FACTURA = factura.FAC_ID_FACTURA\n"
                        + "LEFT JOIN proveedor ON factura.PRO_fk_PROVEEDOR = proveedor.PRO_RUT_PROVEEDOR;";

                ResultSet articulos = smt.executeQuery(sql);

                while (articulos.next()) {
                    list.add(new Articulos(
                            articulos.getInt("ART_ID_ARTICULO"),
                            articulos.getInt("idCatArt"),
                            articulos.getInt("PRO_RUT_PROVEEDOR"),
                            articulos.getString("CATEGORIA"),
                            articulos.getString("PRO_NOMBRE"),
                            articulos.getString("ART_DESCRIPCION"),
                            articulos.getString("ART_MARCA"),
                            articulos.getInt("ART_STOCK"),
                            articulos.getString("ART_CODIGO"),
                            articulos.getDate("ART_FECHA_VENCIMIENTO"),
                            articulos.getBoolean("Activo")
                    ));
                }

                Object[] row = new Object[9];

                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getArt_id();
                    row[1] = list.get(i).getArt_codigo();
                    row[2] = list.get(i).getArt_descripcion();
                    row[3] = list.get(i).getArt_stock();
                    row[4] = new SimpleDateFormat("dd-MM-yyyy").format(list.get(i).getArt_fecha_vencimiento());
                    row[5] = list.get(i).getArt_marca();
                    row[6] = new Categorias(list.get(i).getCat_id(), list.get(i).getCat_nombre(), true);
                    row[7] = list.get(i).getProv_nombre();
                    row[8] = list.get(i).isActivo();

                    model.addRow(row);
                }

            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.desconectar();
            }
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
