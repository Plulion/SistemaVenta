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
public class OrdenCompraDetalle {

    
    private int ocd_id_detalle;
    private int art_id_articulo;
    private int ocd_cantidad;
    private int det_valor;
    private int orc_id_orden;

    public OrdenCompraDetalle(int ocd_id_detalle, int art_id_articulo, int ocd_cantidad, int det_valor, int orc_id_orden) {
        this.ocd_id_detalle = ocd_id_detalle;
        this.art_id_articulo = art_id_articulo;
        this.ocd_cantidad = ocd_cantidad;
        this.det_valor = det_valor;
        this.orc_id_orden = orc_id_orden;
    }

    public int getOcd_id_detalle() {
        return ocd_id_detalle;
    }

    public void setOcd_id_detalle(int ocd_id_detalle) {
        this.ocd_id_detalle = ocd_id_detalle;
    }

    public int getArt_id_articulo() {
        return art_id_articulo;
    }

    public void setArt_id_articulo(int art_id_articulo) {
        this.art_id_articulo = art_id_articulo;
    }

    public int getOcd_cantidad() {
        return ocd_cantidad;
    }

    public void setOcd_cantidad(int ocd_cantidad) {
        this.ocd_cantidad = ocd_cantidad;
    }

    public int getDet_valor() {
        return det_valor;
    }

    public void setDet_valor(int det_valor) {
        this.det_valor = det_valor;
    }

    public int getOrc_id_orden() {
        return orc_id_orden;
    }

    public void setOrc_id_orden(int orc_id_orden) {
        this.orc_id_orden = orc_id_orden;
    }
    
    
}
