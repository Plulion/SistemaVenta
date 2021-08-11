/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;

/**
 *
 * @author Jose
 */
public class OrdenCompra {
    

    private int orc_id_orden;
    private int orc_numero;
    private int pro_id_proveedor;
    private Date orc_fecha_orden;

    public OrdenCompra(int orc_id_orden, int orc_numero, int pro_id_proveedor, Date orc_fecha_orden) {
        this.orc_id_orden = orc_id_orden;
        this.orc_numero = orc_numero;
        this.pro_id_proveedor = pro_id_proveedor;
        this.orc_fecha_orden = orc_fecha_orden;
    }

    public int getOrc_id_orden() {
        return orc_id_orden;
    }

    public void setOrc_id_orden(int orc_id_orden) {
        this.orc_id_orden = orc_id_orden;
    }

    public int getOrc_numero() {
        return orc_numero;
    }

    public void setOrc_numero(int orc_numero) {
        this.orc_numero = orc_numero;
    }

    public int getPro_id_proveedor() {
        return pro_id_proveedor;
    }

    public void setPro_id_proveedor(int pro_id_proveedor) {
        this.pro_id_proveedor = pro_id_proveedor;
    }

    public Date getOrc_fecha_orden() {
        return orc_fecha_orden;
    }

    public void setOrc_fecha_orden(Date orc_fecha_orden) {
        this.orc_fecha_orden = orc_fecha_orden;
    }

    
    
}
