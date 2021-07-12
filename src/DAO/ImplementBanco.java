package DAO; 

import Modelo.Bancos;
import java.sql.PreparedStatement;
import Conexion.Conexion;

public class ImplementBanco implements IBanco{
    
    @Override
    public Bancos listarBanco(String nombreBanco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            stmt.setInt(3, banco.getCODIGO_BANCO());
            

            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        return false;
    }
}
