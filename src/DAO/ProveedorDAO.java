/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Proveedor;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/* *
 * @author Meli
 */
public class ProveedorDAO implements CrudGeneral<Proveedor> {
    
    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Proveedor> listar(String nombreProveedor) {
              ArrayList<Proveedor> list = new ArrayList<>();

        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM proveedor WHERE LOWER(PRO_RUT_PROVEEDOR) LIKE LOWER(?) OR LOWER(PRO_NOMBRE) LIKE LOWER(?)");
            smt.setString(1, "%" + nombreProveedor + "%");
            smt.setString(2, "%" + nombreProveedor + "%");

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new Proveedor(
                        rs.getInt("ID_PRO"),
                        rs.getString("PRO_RUT_PROVEEDOR"),
                        rs.getString("PRO_NOMBRE"),
                        rs.getInt("PRO_TELEFONO"),
                        rs.getString ("PRO_CORREO"),
                        rs.getString ("PRO_DIRECCION"),
                        rs.getString ("RAZON"),
                        rs.getBoolean("Activo")));
                
                        
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
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
    public boolean actualizar(String texto, int id, Proveedor proveedor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            try {
            String sql = "UPDATE proveedor SET PRO_RUT_PROVEEDOR =?, PRO_NOMBRE=?, PRO_TELEFONO=?, PRO_CORREO=?, PRO_DIRECCION=?,RAZON=?, Activo=? WHERE ID_PRO=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            
            stmt.setString(1, proveedor.getPRO_RUT_PROVEEDOR());
            stmt.setString(2,proveedor.getPRO_NOMBRE());
            stmt.setInt(3,proveedor.getPRO_TELEFONO());
            stmt.setString(4,proveedor.getPRO_CORREO());
            stmt.setString(5,proveedor.getPRO_DIRECCION());
            stmt.setBoolean(6, proveedor.isActivo());
            
            stmt.setString(7, proveedor.getRAZON());
            

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

    
    }

    @Override
    public boolean agregar(Proveedor proveedor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           try {
            String sql = "INSERT INTO proveedor (ID_PRO, PRO_RUT_PROVEEDOR, PRO_NOMBRE, PRO_TELEFONO, PRO_CORREO, PRO_DIRECCION, RAZON, Activo) VALUES(?, ?, ?, ?, ?, ?,?,?) ON DUPLICATE KEY UPDATE PRO_RUT_PROVEEDOR=?, PRO_NOMBRE=?, PRO_TELEFONO=?, PRO_CORREO=?, PRO_DIRECCION=?,RAZON=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            stmt.setInt(1,proveedor.getID_PRO());
            stmt.setString(2,proveedor.getPRO_RUT_PROVEEDOR());
            stmt.setString(3,proveedor.getPRO_NOMBRE());
            stmt.setInt(4,proveedor.getPRO_TELEFONO());
            stmt.setString(5,proveedor.getPRO_CORREO());
            stmt.setString(6,proveedor.getPRO_DIRECCION());
            stmt.setString(7,proveedor.getRAZON());
            stmt.setBoolean(8,proveedor.isActivo());

            stmt.setString(9,proveedor.getPRO_RUT_PROVEEDOR());
            stmt.setString(10,proveedor.getPRO_NOMBRE());
            stmt.setInt(11, proveedor.getPRO_TELEFONO());
            stmt.setString(12, proveedor.getPRO_CORREO());
            stmt.setString(13, proveedor.getPRO_DIRECCION());
            stmt.setString(14, proveedor.getRAZON());
            stmt.setBoolean(15, proveedor.isActivo());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    
    }

    @Override
    public void obtenerTodos(JTable tabla, DefaultTableModel model) {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        model.setRowCount(0);

        ArrayList<Proveedor> list = new ArrayList<>(); // esta lista esta vacia

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM proveedor";

            ResultSet rs = smt.executeQuery(sql); //obtengo lista de datos 

            while (rs.next()) {
                list.add(new Proveedor(
                        
                        rs.getInt("ID_PRO"), 
                        rs.getString("PRO_RUT_PROVEEDOR"), 
                        rs.getString("PRO_NOMBRE"),  
                        rs.getInt("PRO_TELEFONO"),                      
                        rs.getString("PRO_CORREO"),
                        rs.getString("PRO_DIRECCION"),
                        rs.getString("RAZON"),
                        rs.getBoolean("Activo")
                ));
            }
            
                    Object[] row = new Object[8];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getID_PRO();
                row[1] = list.get(i).getPRO_RUT_PROVEEDOR();
                row[2] = list.get(i).getPRO_NOMBRE();
                row[3] = list.get(i).getPRO_TELEFONO();
                row[4] = list.get(i).getPRO_CORREO();
                row[5] = list.get(i).getPRO_DIRECCION(); 
                row[6] = list.get(i).getRAZON(); 
                row[7] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
    }
}

