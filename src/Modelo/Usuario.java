package Modelo;

public class Usuario {

    private int USU_ID_USUARIO;
    private String USU_NOMBRE;
    private String USU_CLAVE;
    private boolean Activo;

    public Usuario(String USU_NOMBRE, String USU_CLAVE, boolean Activo) {
        this.USU_NOMBRE = USU_NOMBRE;
        this.USU_CLAVE = USU_CLAVE;
        this.Activo = Activo;
    }

    public Usuario(int USU_ID_USUARIO, String USU_NOMBRE, String USU_CLAVE, boolean Activo) {
        this.USU_ID_USUARIO = USU_ID_USUARIO;
        this.USU_NOMBRE = USU_NOMBRE;
        this.USU_CLAVE = USU_CLAVE;
        this.Activo = Activo;
    }

    public int getBAN_ID_BANCO() {
        return USU_ID_USUARIO;
    }

    public void setUSU_ID_USUARIO(int USU_ID_USUARIO) {
        this.USU_ID_USUARIO = USU_ID_USUARIO;
    }

    public String getUSU_NOMBRE() {
        return USU_NOMBRE;
    }

    public void setUSU_NOMBRE(String USU_NOMBRE) {
        this.USU_NOMBRE = USU_NOMBRE;
    }

    public String getUSU_CLAVE() {
        return USU_CLAVE;
    }

    public void setUSU_CLAVE(String USU_CLAVE) {
        this.USU_CLAVE = USU_CLAVE;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "USU_ID_USUARIO=" + USU_ID_USUARIO + ", USU_NOMBRE=" + USU_NOMBRE + ", USU_CLAVE=" + USU_CLAVE + '}';
    }

    public int getUSU_ID_USUARIO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

