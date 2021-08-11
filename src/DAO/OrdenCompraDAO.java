/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Articulos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jose
 */
public class OrdenCompraDAO {

    public Conexion conexion;
    //public static ArrayList<Integer> lasInsertId = new ArrayList<>();
    public static int lasInsertId;

    public OrdenCompraDAO() {
        this.conexion = new Conexion();
    }

    public boolean insertarOrdenCompra(ArrayList<Articulos> articulos, Date fechaPedido) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                String sql = "INSERT INTO orden_compra (ORC_FECHA_ORDEN)"
                        + "VALUES(?)";

                PreparedStatement stmt = null;

                stmt = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);

                stmt.setDate(1, new java.sql.Date(fechaPedido.getTime()));

//                for (int i = 0; i < articulos.size(); i++) {
//
//                    stmt.setDate(1, new java.sql.Date(fechaPedido.getTime()));
//
//                    stmt.addBatch();
//                }
//
//                stmt.executeBatch();
                stmt.executeUpdate();

                ResultSet generatedKeys = stmt.getGeneratedKeys();

                if (generatedKeys.next()) {
                    lasInsertId = generatedKeys.getInt(1);
                }

//                while (generatedKeys.next()) {
//                    lasInsertId.add(generatedKeys.getInt(1));
//                    System.out.println("numeros" + lasInsertId);
//                }
                stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
            return true;
        }

        return false;
    }
    
    public boolean actualizarOrdenCompra (int idProveedor, Date fechaOrden, int numeroOrden) {
        
        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                String sql = "UPDATE orden_compra SET PRO_ID_PROVEEDOR = ?, ORC_FECHA_ORDEN = ?"
                        + "WHERE ORC_ID_ORDEN = ?";

                PreparedStatement stmt = null;

                stmt = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
                
                stmt.setInt(1, idProveedor);
                stmt.setDate(2, new java.sql.Date(fechaOrden.getTime()));
                stmt.setInt(3, numeroOrden);

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
    }

    public boolean insertarOrdenCompraDetalle(ArrayList<Integer> cantidades, ArrayList<Articulos> articulos) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                String sql = "INSERT INTO orden_compra_detalle (ART_ID_ARTICULO, OCD_CANTIDAD, ORC_ID_ORDEN)"
                        + "VALUES(?, ?, ?)";

                PreparedStatement stmt = null;

                stmt = conn.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);

                for (int i = 0; i < cantidades.size(); i++) {

                    stmt.setInt(1, articulos.get(i).getArt_id());
                    stmt.setInt(2, cantidades.get(i));
                    stmt.setInt(3, lasInsertId);

                    stmt.addBatch();
                }

                stmt.executeBatch();

                stmt.close();

            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                conexion.desconectar();
            }
            return true;
        }

        return false;
    }

    static public ResultSet obtenerTodosPedidosRealizados() {

        Conexion conexion = new Conexion();

        Connection conn = conexion.conectar();
        ResultSet datos = null;

        if (conn != null) {

            try {

                String sql = "SELECT *, SUM(OCD_CANTIDAD) as CANTIDAD_TOTAL\n"
                        + "FROM orden_compra\n"
                        + "LEFT JOIN orden_compra_detalle\n"
                        + "ON orden_compra.ORC_ID_ORDEN = orden_compra_detalle.ORC_ID_ORDEN\n"
                        + "GROUP BY orden_compra.ORC_ID_ORDEN;";

                PreparedStatement stmt = null;

                stmt = conn.prepareStatement(sql);

                datos = stmt.executeQuery();

                //stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                //conexion.desconectar();
            }

        }
        return datos;
    }

    public static ResultSet obtenerPedidoPorId(int idPedido) {

        Conexion conexion = new Conexion();

        Connection conn = conexion.conectar();
        ResultSet datos = null;

        if (conn != null) {

            try {

                String sql = "SELECT articulo.ART_ID_ARTICULO, ART_DESCRIPCION, OCD_CANTIDAD FROM orden_compra_detalle\n"
                        + "LEFT JOIN articulo\n"
                        + "ON orden_compra_detalle.ART_ID_ARTICULO = articulo.ART_ID_ARTICULO\n"
                        + "WHERE ORC_ID_ORDEN = ?";

                PreparedStatement stmt = null;

                stmt = conn.prepareStatement(sql);
                
                stmt.setInt(1, idPedido);

                datos = stmt.executeQuery();

                //stmt.close();
            } catch (SQLException e) {
                System.err.println("ERROR: " + e);
            } finally {
                //conexion.desconectar();
            }

        }
        return datos;

    }
}
