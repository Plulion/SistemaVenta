/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose
 */
public class ListaDestinoDAO {

    public Conexion conexion;

    public ListaDestinoDAO() {
    }

    static public ResultSet obtenerDestinosDespachosDia() {

        Conexion conexion = new Conexion();

        Connection conn = conexion.conectar();
        ResultSet destinos = null;

        if (conn != null) {

            try {

                Statement smt = conn.createStatement();

                String sql = "SELECT "
                        + "ID_VENTA, PCK_NOMBRE, VTA_NOMBRE_DESTINATARIO, VTA_FECHA_ENTREGA, COM_DESCRIPCION, "
                        + "VTA_DIRECCION_DESTINATARIO, VTA_HORA_ENTREGA_INICIAL, VTA_HORA_ENTREGA_FINAL FROM venta\n"
                        + "LEFT JOIN pack ON venta.ID_PACK_PK = pack.ID_PACK\n"
                        + "LEFT JOIN comunas ON  venta.idComuna_PK = comunas.idComuna\n"
                        + "ORDER BY VTA_FECHA_ENTREGA, VTA_HORA_ENTREGA_INICIAL";

                destinos = smt.executeQuery(sql);

            } catch (SQLException e) {
                System.err.println("ERROR en:" + e);
            } finally {
                //conexion.desconectar();
            }
        }

        return destinos;
    }

}
