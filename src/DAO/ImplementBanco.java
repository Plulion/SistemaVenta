package DAO;

import Modelo.Bancos;
import java.sql.PreparedStatement;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImplementBanco implements IBanco {
    
    
    @Override
    public Bancos listarBanco(String nombreBanco) {
        throw new UnsupportedOperationException("Not supported yet.");
//        Conexion conexion = new Conexion();
//        
//        try {
//            
//            Statement smt = conexion.conectar().createStatement();
////            String sql = "SELECT * from Bancos where BAN_DESCRIPCION = '"+nombreBanco"'";
//             String sql = "SELECT * from bancos";
//             
//            
//        } catch (Exception e) {
//            System.err.println("ERROR: "+e);
//        }
    }

    @Override
    public boolean eliminarBanco(String nombreBanco, int codigoBanco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarBanco(Bancos banco) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        Conexion conexion = new Conexion();

        try {
            String sql = "INSERT INTO bancos (BAN_ID_BANCO, BAN_DESCRIPCION, CODIGO_BANCO) VALUES(?, ?, ?)";
            PreparedStatement stmt = conexion.conectar().prepareStatement(sql);
            stmt.setInt(1, banco.getBAN_ID_BANCO());
            stmt.setString(2, banco.getBAN_DESCRIPCION());
            stmt.setString(3, banco.getCODIGO_BANCO());

            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    }

    @Override
    public ArrayList<Bancos> obtenerTodos() {
        
        ArrayList<Bancos> list = new ArrayList<>();

        Conexion conexion = new Conexion();

        try {

            Statement smt = conexion.conectar().createStatement();

            String sql = "SELECT * FROM bancos";

            ResultSet rs = smt.executeQuery(sql);

            while (rs.next()) {
                list.add(new Bancos(
                        rs.getInt("BAN_ID_BANCO"),
                        rs.getString("BAN_DESCRIPCION"),
                        rs.getString("CODIGO_BANCO")
                ));
            }
            

        } catch (Exception e) {
            System.err.println("ERROR en:" + e);
        }
        
        return list;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
