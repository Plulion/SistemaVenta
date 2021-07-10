
package Modelo;

public class Clientes {
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private String  correoCliente;
    private boolean activo;

    public Clientes() {
    }

    public Clientes(int idCliente, String nombreCliente, String apellidoCliente, String direccionCliente, String telefonoCliente, String correoCliente, boolean activo) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.activo = activo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", direccionCliente=" + direccionCliente + ", telefonoCliente=" + telefonoCliente + ", correoCliente=" + correoCliente + ", activo=" + activo + '}';
    }
    
    
}
