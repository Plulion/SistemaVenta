/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Clientes;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class VentaDAO {

    public Conexion conexion;

    public VentaDAO() {
        this.conexion = new Conexion();
    }

    public Clientes buscarCliente(String rut) {

        Connection conn = conexion.conectar();
        Clientes cliente = null;

        if (conn != null) {

            try {

                String sql = "SELECT * FROM cliente "
                        + "WHERE LOWER(RUT) LIKE LOWER(?)";

                try (PreparedStatement smt = conn.prepareStatement(sql)) {
                    smt.setString(1, "%" + rut + "%");

                    try (ResultSet rs = smt.executeQuery()) {
                        while (rs.next()) {
                            cliente = new Clientes(
                                    rs.getString("RUT"),
                                    rs.getString("CLI_NOMBRE"),
                                    rs.getString("CLI_APELLIDO"),
                                    rs.getInt("CLI_TELEFONO"),
                                    rs.getInt("CLI_CELULAR"),
                                    rs.getString("CLI_CORREO"),
                                    rs.getDate("Fecha_Nacimiento"),
                                    rs.getBoolean("Activo")
                            );
                        }
                    }
                }
            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.desconectar();
            }
        }
        return cliente;
    }

    public boolean guardarVenta(Venta venta) {

        Connection conn = conexion.conectar();

        if (conn != null) {

            try {

                String sql = "INSERT INTO venta "
                        + "(ID_CLIENTE_PK, ID_PACK_PK, idComuna_PK, idEstVta_PK, VTA_TOTAL, "
                        + "VTA_NOMBRE_DESTINATARIO, VTA_DIRECCION_DESTINATARIO, VTA_TELEFONO,"
                        + " VTA_CORREO, VTA_FECHA_ENTREGA, VTA_HORA_ENTREGA_INICIAL, VTA_HORA_ENTREGA_FINAL,"
                        + " VTA_SALUDO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement smt = conn.prepareStatement(sql)) {
                    smt.setString(1, venta.getId_cliente());
                    smt.setInt(2, venta.getIdPack());
                    smt.setInt(3, venta.getIdComuna());
                    smt.setInt(4, venta.getIdEstadoVenta());
                    smt.setInt(5, venta.getTotal());
                    smt.setString(6, venta.getNombreDestinatario());
                    smt.setString(7, venta.getDireccionDestinatario());
                    smt.setInt(8, venta.getTelefono());
                    smt.setString(9, venta.getCorreo());
                    smt.setDate(10, new java.sql.Date(venta.getFechaEntrega().getTime()));
                    smt.setString(11, venta.gethEntregaIn());
                    smt.setString(12, venta.gethEntregaFin());
                    smt.setString(13, venta.getSaludo());

                    smt.executeUpdate();
                }
            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                conexion.desconectar();
            }
        }
        return true;
    }

}
