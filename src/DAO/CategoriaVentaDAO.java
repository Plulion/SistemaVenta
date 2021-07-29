/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import Conexion.Conexion;
import Modelo.CategoriaVenta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Meli
 */
public class CategoriaVentaDAO implements CrudGeneral<CategoriaVenta> {
    
     Conexion conexion = new Conexion();

    @Override
    public ArrayList<CategoriaVenta> listar(String descripcioncategoriaventa) {
        
        ArrayList<CategoriaVenta> list = new ArrayList<>();
        
                try {

            PreparedStatement smt = conexion.conectar().prepareStatement("SELECT * FROM estados_venta WHERE LOWER(EST_DESCRIPCION) LIKE LOWER(?)");
            smt.setString(1, "%" + descripcioncategoriaventa + "%");
            

            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                list.add(new CategoriaVenta(
                        rs.getInt("IdEstVta"),
                        rs.getString("EST_DESCRIPCION"),
                        rs.getBoolean("Activo")
                ));
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        return list;
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
    public boolean actualizar(String texto, int id, CategoriaVenta categoriaventa) {
   
     // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             try {
            String sql = "UPDATE estados_venta SET EST_DESCRIPCION=?, Activo=? WHERE IdEstVta=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            
            stmt.setString(1, categoriaventa.getEST_DESCRIPCION());
            stmt.setBoolean(2,categoriaventa.isActivo());
            

            stmt.executeUpdate();

            return true;

        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;

     
    }
    
    

    @Override
    public boolean agregar(CategoriaVenta categoriaventa) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 
     try {
            String sql = "INSERT INTO estados_venta (IdEstVta, EST_DESCRIPCION,  Activo) VALUES( ?, ?, ?) ON DUPLICATE KEY UPDATE EST_DESCRIPCION=?, Activo=?";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);

            stmt.setInt(1, categoriaventa.getIdEstVta());
            stmt.setString(2, categoriaventa.getEST_DESCRIPCION());
            stmt.setBoolean(3, categoriaventa.isActivo());

            stmt.setString(4, categoriaventa.getEST_DESCRIPCION());
            stmt.setBoolean(5, categoriaventa.isActivo());

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

        ArrayList<CategoriaVenta> list = new ArrayList<>(); // esta lista esta vacia

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM estados_venta";

            ResultSet rs = smt.executeQuery(sql); //obtengo lista de datos 

            while (rs.next()) {
                list.add(new CategoriaVenta(
                        rs.getInt("IdEstVta"),                        
                        rs.getString("EST_DESCRIPCION"),                      
                        rs.getBoolean("Activo")
                ));
            }
        Object[] row = new Object[3];

            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getIdEstVta();
                row[1] = list.get(i).getEST_DESCRIPCION();
                row[2] = list.get(i).isActivo();

                model.addRow(row);
            }

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
    }
}

    
    
    

