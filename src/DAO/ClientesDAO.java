/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Clientes;
import Conexion.Conexion;
import java.sql.Date;
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
 * @author Meli
 */
public class ClientesDAO implements CrudGeneral<Clientes> {
    Conexion conexion = new Conexion();

    @Override
    public ArrayList<Clientes> listar(String nombreCliente) {
       ArrayList<Clientes> list = new ArrayList<>();
//buscar
        try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM cliente WHERE LOWER(CLI_NOMBRE) LIKE LOWER(?) OR LOWER(CLI_APELLIDO)LIKE LOWER(?) OR LOWER (CLI_TELEFONO) LIKE LOWER(?) OR LOWER (CLI_CELULAR)LIKE LOWER(?)");
            smt.setString(1, "%" + nombreCliente + "%");
            smt.setString(2, "%" + nombreCliente + "%");
            smt.setString(3, "%" + nombreCliente + "%");
            smt.setString(4, "%" + nombreCliente + "%");
            
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new Clientes(
                        rs.getString("RUT"),
                        rs.getString("CLI_NOMBRE"),
                        rs.getString("CLI_APELLIDO"),
                        rs.getInt ("CLI_TELEFONO"),
                        rs.getInt ("CLI_CELULAR"),
                        rs.getString ("CLI_CORREO"),
                        rs.getDate("Fecha_Nacimiento"),
                        rs.getBoolean("Activo")));
                
                        
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        return list;
        
        

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public boolean actualizar(String texto, int id, Clientes cliente) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
            String sql = "UPDATE cliente SET CLI_NOMBRE =?, CLI_APELLIDO=?, CLI_TELEFONO=?,CLI_CELULAR=?, CLI_CORREO=?, Fecha_Nacimiento=?, Activo=? WHERE RUT=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            
            stmt.setString(1, cliente.getCLI_NOMBRE());
            stmt.setString(2,cliente.getCLI_APELLIDO());
            stmt.setInt(3,cliente.getCLI_TELEFONO());
            stmt.setInt(4,cliente.getCLI_CELULAR());
            stmt.setString(5,cliente.getCLI_CORREO());
            stmt.setDate(6, new java.sql.Date(cliente.getFecha_Nacimiento().getTime()));
            stmt.setBoolean(7, cliente.isActivo());
            
            stmt.setString(8, cliente.getRUT());
            

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    
    
    
    }

    @Override
    public boolean agregar(Clientes cliente) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try {
            String sql = "INSERT INTO cliente (RUT, CLI_NOMBRE, CLI_APELLIDO, CLI_TELEFONO, CLI_CELULAR, CLI_CORREO, Fecha_Nacimiento, Activo) VALUES(?, ?, ?, ?, ?, ?,?,?) ON DUPLICATE KEY UPDATE RUT=?, CLI_NOMBRE=?, CLI_APELLIDO=?, CLI_TELEFONO=?, CLI_CELULAR=?, CLI_CORREO=?, Fecha_Nacimiento=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            stmt.setString(1,cliente.getRUT());
            stmt.setString(2,cliente.getCLI_NOMBRE());
            stmt.setString(3,cliente.getCLI_APELLIDO());
            stmt.setInt(4,cliente.getCLI_TELEFONO());
            stmt.setInt(5,cliente.getCLI_CELULAR());
            stmt.setString(6,cliente.getCLI_CORREO());
            stmt.setDate(7, new java.sql.Date(cliente.getFecha_Nacimiento().getTime()));
            stmt.setBoolean(8,cliente.isActivo());

            //
            stmt.setString(9,cliente.getRUT());
            stmt.setString(10,cliente.getCLI_NOMBRE());
            stmt.setString(11,cliente.getCLI_APELLIDO());
            stmt.setInt(12,cliente.getCLI_TELEFONO());
            stmt.setInt(13,cliente.getCLI_CELULAR());
            stmt.setString(14,cliente.getCLI_CORREO());
            stmt.setDate(15, new java.sql.Date(cliente.getFecha_Nacimiento().getTime()));
            
            stmt.setBoolean(16,cliente.isActivo());

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

        ArrayList<Clientes> list = new ArrayList<>(); // esta lista esta vacia

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM cliente";

            ResultSet rs = smt.executeQuery(sql); //obtengo lista de datos 

            while (rs.next()) {
                list.add(new Clientes(
                        
                        rs.getString("RUT"), 
                        rs.getString("CLI_NOMBRE"), 
                        rs.getString("CLI_APELLIDO"),  
                        rs.getInt("CLI_TELEFONO"),  
                        rs.getInt("CLI_CELULAR"),  
                        rs.getString("CLI_CORREO"),
                        rs.getDate("Fecha_Nacimiento"),
                        rs.getBoolean("Activo")
                ));
            }
            
                    Object[] row = new Object[8];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getRUT();
                row[1] = list.get(i).getCLI_NOMBRE();
                row[2] = list.get(i).getCLI_APELLIDO();
                row[3] = list.get(i).getCLI_TELEFONO();
                row[4] = list.get(i).getCLI_CELULAR();
                row[5] = list.get(i).getCLI_CORREO(); 
                row[6] = list.get(i).getFecha_Nacimiento();
                row[7] = list.get(i).isActivo();

                model.addRow(row);
            }
            //new SimpleDateFormat("yyyy-MM-dd").format(list.get(i).getFecha_Nacimiento());

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
    }
    
    
    }
    
    

