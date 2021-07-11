package DAO;

import Conexion.Conexion;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.*;

public class ClienteDAO implements CrudSimpleInterface<Cliente> {

    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public ClienteDAO() {
        CON = Conexion.getInstancia();
    }

    @Override
    public List<Cliente> listar(String texto) {
        List<Cliente> registros = new ArrayList();
        try {
            ps = CON.conectar().prepareStatement("SELECT id, rut, cli_nombre, cli_apellido, cli_direccion, cli_telefono, cli_correo, activo FROM CLIENTE  WHERE cli_nombre LIKE ?");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Cliente(rs.getInt(1), rs.getString(2), getString(3), getString(4), getString(5), getString(6), getString(7), getBoolean(8)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return registros;
    }

    @Override
    public boolean insertar(Cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("INSERT INTO cliente (RUT,CLI_NOMBRE,CLI_APELLIDO,CLI_DIRECCION,CLI_TELEFONO,CLI_CORREO,ACTIVO) VALUES (?,?,?,?,?,1)");
            ps.setString(1, obj.getRutCliente());
            ps.setString(2, obj.getNombreCliente());
            ps.setString(3, obj.getApellidoCliente());
            ps.setString(4, obj.getDireccionCliente());
            ps.setString(5, obj.getTelefonoCliente());
            ps.setString(6, obj.getCorreoCliente());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;

    }

    @Override
    public boolean actualizar(Cliente obj) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE cliente SET RUT=?, CLI_NOMBRE=?,CLI_APELLIDO=?,CLI_DIRECCION=?,CLI_TELEFONO=?,CLI_CORREO=? WHERE id=? ");
            ps.setString(1, obj.getRutCliente());
            ps.setString(2, obj.getNombreCliente());
            ps.setString(3, obj.getApellidoCliente());
            ps.setString(4, obj.getDireccionCliente());
            ps.setString(5, obj.getTelefonoCliente());
            ps.setString(6, obj.getCorreoCliente());
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;
    }

    @Override
    public boolean desactivar(int id) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE cliente SET activo=0 WHERE id=? ");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;

    }

    @Override
    public boolean activar(int id) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("UPDATE cliente SET activo=1 WHERE id=? ");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CON.desconectar();
        }
        return resp;

    }

    @Override
    public int total() {
        int totalRegistros = 0;
        try {
            ps = CON.conectar().prepareStatement("SELECT COUNT(id) FROM cliente");
            rs = ps.executeQuery();

            while (rs.next()) {
                totalRegistros = rs.getInt("COUNT(id)");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return totalRegistros;

    }

    @Override
    public boolean existe(String texto) {
        resp = false;
        try {
            ps = CON.conectar().prepareStatement("SELECT cli_nombre FROM cliente WHERE cli_nombre=?");
            ps.setString(1,texto);
            rs = ps.executeQuery();
            rs.last();
            if (rs.getRow() > 0) {
                resp = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CON.desconectar();
        }
        return resp;

    }

}
