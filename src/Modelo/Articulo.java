
package Modelo;

public class Articulo {
    private int idArticulo;
    private String descripcionArticulo;
    private int articuloStock;
    private String fechaVencimiento;

    public Articulo() {
    }

    public Articulo(int idArticulo, String descripcionArticulo, int articuloStock, String fechaVencimiento) {
        this.idArticulo = idArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.articuloStock = articuloStock;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public int getArticuloStock() {
        return articuloStock;
    }

    public void setArticuloStock(int articuloStock) {
        this.articuloStock = articuloStock;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", descripcionArticulo=" + descripcionArticulo + ", articuloStock=" + articuloStock + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
    
    
}
