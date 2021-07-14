package Modelo;


public class RRSS {
    private int id;
    private String rrsNombre;
    private String codigoRs;
    private boolean activo;

    public RRSS() {
    }

    public RRSS(int id, String rrsNombre, String codigoRs, boolean activo) {
        this.id = id;
        this.rrsNombre = rrsNombre;
        this.codigoRs = codigoRs;
        this.activo = activo;
    }

    public RRSS(String rrsNombre, String codigoRs, boolean activo) {
        this.rrsNombre = rrsNombre;
        this.codigoRs = codigoRs;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRrsNombre() {
        return rrsNombre;
    }

    public void setRrsNombre(String rrsNombre) {
        this.rrsNombre = rrsNombre;
    }

    public String getCodigoRs() {
        return codigoRs;
    }

    public void setCodigoRs(String codigoRs) {
        this.codigoRs = codigoRs;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "RRSS{" + "id=" + id + ", rrsNombre=" + rrsNombre + ", codigoRs=" + codigoRs + ", activo=" + activo + '}';
    }

   
    
    
         
}
