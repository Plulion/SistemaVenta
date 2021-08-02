/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose
 */
public class ArticuloHasPack {
    
    private int id;
    private int id_articulo;
    private int id_pack;
    private int cantidad;

    public ArticuloHasPack(int id_articulo, int id_pack, int cantidad) {
        this.id_articulo = id_articulo;
        this.id_pack = id_pack;
        this.cantidad = cantidad;
    }

    public ArticuloHasPack(int id, int id_articulo, int id_pack, int cantidad) {
        this.id = id;
        this.id_articulo = id_articulo;
        this.id_pack = id_pack;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getId_pack() {
        return id_pack;
    }

    public void setId_pack(int id_pack) {
        this.id_pack = id_pack;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
       
}
