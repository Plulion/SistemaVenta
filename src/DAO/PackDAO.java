package DAO;

import Conexion.Conexion;
import Modelo.Articulos;
import Modelo.Packs;
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
public class PackDAO implements CrudGeneral<Packs> {

    public Conexion conexion;
    public int lasInsertId;

    public PackDAO() {
        this.conexion = new Conexion();
    }

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
    public boolean actualizar(String texto, int id, Packs clase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Packs pack) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try { // la linea de abajo Inserta un nuevo valor. Pero si le llega un id que ya existe lo actualiza
                String sql = "INSERT INTO pack (ID_PACK, ID_CATEGORIA, PCK_NOMBRE, PCK_COSTO, PCK_STOCK, Activo)"
                        + " VALUES(?, ?, ?, ? ,?, ?)"
                        + " ON DUPLICATE KEY"
                        + " UPDATE ID_CATEGORIA=?, PCK_NOMBRE=?, PCK_COSTO=?, PCK_STOCK=?, Activo=?";
                PreparedStatement stmt = null;
                stmt = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);

                stmt.setInt(1, pack.getIdPack());
                stmt.setInt(2, pack.getIdCategoria());
                stmt.setString(3, pack.getNombre());
                stmt.setInt(4, pack.getPrecio());
                stmt.setInt(5, pack.getStock());
                stmt.setBoolean(6, pack.isActivo());

                stmt.setInt(7, pack.getIdCategoria());
                stmt.setString(8, pack.getNombre());
                stmt.setInt(9, pack.getPrecio());
                stmt.setInt(10, pack.getStock());
                stmt.setBoolean(11, pack.isActivo());

                stmt.executeUpdate();

                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    lasInsertId = generatedKeys.getInt(1);
                }

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

            ArrayList<Packs> list = new ArrayList<>();

            try {

                Statement smt = conn.createStatement();

                String sql = "SELECT * FROM pack";

                ResultSet rs = smt.executeQuery(sql);

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

                Object[] row = new Object[4];

                for (int i = 0; i < list.size(); i++) {
                    row[0] = list.get(i).getIdPack();
                    row[1] = list.get(i).getNombre();
                    row[2] = list.get(i).getStock();
                    row[3] = list.get(i).isActivo();

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

    public void insertarArticulosAsociados(ArrayList<Integer> idArticulos, ArrayList<Integer> cantidadArticulos) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try { // la linea de abajo Inserta un nuevo valor. Pero si le llega un id que ya existe lo actualiza
                String sql = "INSERT INTO articulo_has_pack "
                        + "(ID_ARTICULO, ID_PACK_FK, CANTIDAD) "
                        + "VALUES(?, ?, ?) ";

                PreparedStatement stmt = conn.prepareStatement(sql);

                for (int i = 0; i < idArticulos.size(); i++) {

                    stmt.setInt(1, idArticulos.get(i));
                    stmt.setInt(2, lasInsertId);
                    stmt.setInt(3, cantidadArticulos.get(i));

                    stmt.addBatch();
                }

                stmt.executeBatch();

                stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
        }

    }

    public void obtenerArticulosDePack(DefaultTableModel model, int idPack) {

        Connection conn = conexion.conectar();

        model.setRowCount(0);

        if (conn != null) {

            try { // la linea de abajo Inserta un nuevo valor. Pero si le llega un id que ya existe lo actualiza
                String sql = "SELECT ART_ID_ARTICULO, ART_DESCRIPCION, CANTIDAD FROM articulo_has_pack \n"
                        + "LEFT JOIN articulo ON articulo.ART_ID_ARTICULO = articulo_has_pack.ID_ARTICULO\n"
                        + "WHERE articulo_has_pack.ID_PACK_FK = ?;";

                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setInt(1, idPack);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    Object[] row = new Object[2];
                    row[0] = new Articulos(rs.getInt("ART_ID_ARTICULO"), rs.getString("ART_DESCRIPCION"));
                    row[1] = rs.getInt("CANTIDAD");
                    model.addRow(row);
                }

                stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
        }

    }

    public ArrayList<Packs> obtenerTodosPacks() throws SQLException {

        Connection conn = conexion.conectar();

        ResultSet cat = null;

        ArrayList<Packs> packs = new ArrayList<Packs>();

        if (conn != null) {

            Statement smt = conn.createStatement();

            try {

                String sql = "SELECT * FROM pack";
                cat = smt.executeQuery(sql);

                while (cat.next()) {
                    packs.add(new Packs(
                            cat.getInt("ID_PACK"),
                            cat.getInt("ID_CATEGORIA"),
                            cat.getString("PCK_NOMBRE"),
                            cat.getInt("PCK_COSTO"),
                            cat.getInt("PCK_STOCK"),
                            cat.getBoolean("Activo")
                    ));

                }

            } catch (SQLException e) {
                System.err.println("ERROR: Al obtener categorias " + e);
            } finally {
                if (smt != null) {
                    smt.close();
                }
                conexion.desconectar();
            }
        }
        return packs;
    }

}
