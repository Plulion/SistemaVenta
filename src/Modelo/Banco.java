
package Modelo;

public class Banco {
    private int idBanco;
    private String nombreBanco;
    private String codigoBanco;

    public Banco() {
    }

    public Banco(int idBanco, String nombreBanco, String codigoBanco) {
        this.idBanco = idBanco;
        this.nombreBanco = nombreBanco;
        this.codigoBanco = codigoBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    @Override
    public String toString() {
        return "Banco{" + "idBanco=" + idBanco + ", nombreBanco=" + nombreBanco + ", codigoBanco=" + codigoBanco + '}';
    }
    
    
}
