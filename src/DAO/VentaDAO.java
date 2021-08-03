/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jose
 */
public class VentaDAO {

    Conexion conexion = new Conexion();

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
                conexion.conectar();
            }
        }
        return cliente;
    }

}
