
package Modelo;

public class Comunas {
    private int idComuna;
    private String descripcionComuna;
    private String codigoComuna;
    private boolean Activo;

    public Comunas() {
    }

    public Comunas(String descripcionComuna, String codigoComuna, boolean Activo) {
        this.descripcionComuna = descripcionComuna;
        this.codigoComuna = codigoComuna;
        this.Activo = Activo;
    }

    public Comunas(int idComuna, String descripcionComuna, String codigoComuna, boolean Activo) {
        this.idComuna = idComuna;
        this.descripcionComuna = descripcionComuna;
        this.codigoComuna = codigoComuna;
        this.Activo = Activo;
    }
    
    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getDescripcionComuna() {
        return descripcionComuna;
    }

    public void setDescripcionComuna(String descripcionComuna) {
        this.descripcionComuna = descripcionComuna;
    }

    public String getCodigoComuna() {
        return codigoComuna;
    }

    public void setCodigoComuna(String codigoComuna) {
        this.codigoComuna = codigoComuna;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
    @Override
    public String toString() {
        return "Comunas{" + "idComuna=" + idComuna + ", descripcionComuna=" + descripcionComuna + ", codigoComuna=" + codigoComuna + '}';
    }
    
    
}
