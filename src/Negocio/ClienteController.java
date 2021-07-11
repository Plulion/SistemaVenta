package Negocio;

import DAO.ClienteDAO;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClienteController {
    private final ClienteDAO DATOS;
    private Cliente obj;
    private DefaultTableModel modeloTabla;
    public int registrosMostrados;

    public ClienteController() {
        this.DATOS = new ClienteDAO();
        this.obj = new Cliente();
        this.registrosMostrados = 0;

    }

    public DefaultTableModel listar(String texto) {
        List<Cliente> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));

        String[] titulos = {"id", "Rut", "Nombre", "Apellido", "Direccion", "Telefono", "Correo", "Estado"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String estado;
        String[] registro = new String[8];

        this.registrosMostrados = 0;
        for (Cliente item : lista) {
            if (item.isActivo()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            registro[0] = Integer.toString(item.getIdCliente());
            registro[1] = item.getRutCliente();
            registro[2] = item.getNombreCliente();
            registro[3] = item.getApellidoCliente();
            registro[4] = item.getDireccionCliente();
            registro[5] = item.getTelefonoCliente();
            registro[6] = item.getCorreoCliente();
            registro[7] = estado;
            this.modeloTabla.addRow(registro);
            this.registrosMostrados = this.registrosMostrados + 1;
        }
        return this.modeloTabla;
    }

    public String insertar(String rutCliente, String nombreCliente, String apellidoCliente, String direccionCliente, String telefonoCliente, String correoCliente) {
        if (DATOS.existe(nombreCliente)) {
            return "El registro ya existe.";
        } else {
            obj.setRutCliente(rutCliente);
            obj.setNombreCliente(nombreCliente);
            obj.setApellidoCliente(apellidoCliente);
            obj.getDireccionCliente();
            obj.setTelefonoCliente(telefonoCliente);
            obj.setCorreoCliente(correoCliente);

            if (DATOS.insertar(obj)) {
                return "OK";
            } else {
                return "Error en el registro.";
            }
        }
    }

    public String actualizar(int id, String rutCliente, String nombreCliente, String nombreAnt, String apellidoCliente, String direccionCliente, String telefonoCliente, String correoCliente) {
        if (nombreCliente.equals(nombreAnt)) {
            obj.setIdCliente(id);
            obj.setRutCliente(rutCliente);
            obj.setNombreCliente(nombreCliente);
            obj.setApellidoCliente(apellidoCliente);
            obj.setDireccionCliente(direccionCliente);
            obj.setTelefonoCliente(telefonoCliente);
            obj.setCorreoCliente(correoCliente);
            if (DATOS.actualizar(obj)) {
                return "OK";
            } else {
                return "Error en la actualización.";
            }
        } else {
            if (DATOS.existe(nombreCliente)) {
                return "El registro ya existe.";
            } else {
                obj.setIdCliente(id);
                obj.setRutCliente(rutCliente);
                obj.setNombreCliente(nombreCliente);
                obj.setApellidoCliente(apellidoCliente);
                obj.setDireccionCliente(direccionCliente);
                obj.setTelefonoCliente(telefonoCliente);
                obj.setCorreoCliente(correoCliente);
                if (DATOS.actualizar(obj)) {
                    return "OK";
                } else {
                    return "Error en la actualización.";
                }
            }
        }
    }

    public String desactivar(int id) {
        if (DATOS.desactivar(id)) {
            return "OK";
        } else {
            return "No se puede desactivar el registro";
        }

    }

    public String activar(int id) {
        if (DATOS.activar(id)) {
            return "OK";
        } else {
            return "No se puede activar el registro";
        }
    }

    public int total() {
        return DATOS.total();
    }
    
    public int totalMostrados(){
        return this.registrosMostrados;
    }

}
