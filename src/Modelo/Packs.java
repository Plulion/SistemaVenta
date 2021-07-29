package Modelo;

/**
 *
 * @author Jose
 */
public class Packs {

    private int idPack;
    private int idCategoria;
    private String nombre;
    private int precio;
    private int stock;
    private boolean activo;

    
    //SIN ID
    public Packs(int idCategoria, String nombre, int precio, int stock, boolean activo) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }

    public Packs(int idPack, int idCategoria, String nombre, int precio, int stock, boolean activo) {
        this.idPack = idPack;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }

    public int getIdPack() {
        return idPack;
    }

    public void setIdPack(int idPack) {
        this.idPack = idPack;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Packs{" + "nombre=" + nombre + '}';
    }

}
