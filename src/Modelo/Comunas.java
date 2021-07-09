
package Modelo;

public class Comunas {
    private int idComuna;
    private String descripcionComuna;
    private String codigoComuna;

    public Comunas() {
    }

    public Comunas(int idComuna, String descripcionComuna, String codigoComuna) {
        this.idComuna = idComuna;
        this.descripcionComuna = descripcionComuna;
        this.codigoComuna = codigoComuna;
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

    @Override
    public String toString() {
        return "Comunas{" + "idComuna=" + idComuna + ", descripcionComuna=" + descripcionComuna + ", codigoComuna=" + codigoComuna + '}';
    }
    
    
}
