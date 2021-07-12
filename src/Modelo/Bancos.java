package Modelo;


public class Bancos {
    private int BAN_ID_BANCO;
    private String BAN_DESCRIPCION;
    private String CODIGO_BANCO;

    public Bancos() {
    }

    public Bancos(int BAN_ID_BANCO, String BAN_DESCRIPCION, String CODIGO_BANCO) {
        this.BAN_ID_BANCO = BAN_ID_BANCO;
        this.BAN_DESCRIPCION = BAN_DESCRIPCION;
        this.CODIGO_BANCO = CODIGO_BANCO;
    }

    public int getBAN_ID_BANCO() {
        return BAN_ID_BANCO;
    }

    public void setBAN_ID_BANCO(int BAN_ID_BANCO) {
        this.BAN_ID_BANCO = BAN_ID_BANCO;
    }

    public String getBAN_DESCRIPCION() {
        return BAN_DESCRIPCION;
    }

    public void setBAN_DESCRIPCION(String BAN_DESCRIPCION) {
        this.BAN_DESCRIPCION = BAN_DESCRIPCION;
    }

    public String getCODIGO_BANCO() {
        return CODIGO_BANCO;
    }

    public void setCODIGO_BANCO(String CODIGO_BANCO) {
        this.CODIGO_BANCO = CODIGO_BANCO;
    }

    @Override
    public String toString() {
        return "Bancos{" + "BAN_ID_BANCO=" + BAN_ID_BANCO + ", BAN_DESCRIPCION=" + BAN_DESCRIPCION + ", CODIGO_BANCO=" + CODIGO_BANCO + '}';
    }

    
}
