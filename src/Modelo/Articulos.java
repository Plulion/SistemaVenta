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
public class Articulos {

    private int art_id;
    private int cat_id;
    private int prov_id;
    private String cat_nombre;
    private String prov_nombre;
    private String art_descripcion;
    private String art_marca;
    private int art_stock;
    private String art_codigo;
    private Date art_fecha_vencimiento;
    private boolean Activo;

    //este es el constructor con ID unicamente para articulos no relacionados a otras tablas
    public Articulos(int art_id, int cat_id, String art_descripcion, String art_marca, int art_stock, String art_codigo, Date art_fecha_vencimiento, boolean Activo) {
        this.art_id = art_id;
        this.cat_id = cat_id;
        this.art_descripcion = art_descripcion;
        this.art_marca = art_marca;
        this.art_stock = art_stock;
        this.art_codigo = art_codigo;
        this.art_fecha_vencimiento = art_fecha_vencimiento;
        this.Activo = Activo;
    }

    //este es el constructor sin ID unicamente para articulos no relacionados a otras tablas
    public Articulos(int cat_id, String art_descripcion, String art_marca, int art_stock, String art_codigo, Date art_fecha_vencimiento, boolean Activo) {
        this.cat_id = cat_id;
        this.art_descripcion = art_descripcion;
        this.art_marca = art_marca;
        this.art_stock = art_stock;
        this.art_codigo = art_codigo;
        this.art_fecha_vencimiento = art_fecha_vencimiento;
        this.Activo = Activo;
    }

    //relacion con otras tablas sin ID
    public Articulos(int cat_id, int prov_id, String cat_nombre, String prov_nombre, String art_descripcion, String art_marca, int art_stock, String art_codigo, Date art_fecha_vencimiento, boolean Activo) {
        this.cat_id = cat_id;
        this.prov_id = prov_id;
        this.cat_nombre = cat_nombre;
        this.prov_nombre = prov_nombre;
        this.art_descripcion = art_descripcion;
        this.art_marca = art_marca;
        this.art_stock = art_stock;
        this.art_codigo = art_codigo;
        this.art_fecha_vencimiento = art_fecha_vencimiento;
        this.Activo = Activo;
    }

    //relacion con otras tablas con ID
    public Articulos(int art_id, int cat_id, int prov_id, String cat_nombre, String prov_nombre, String art_descripcion, String art_marca, int art_stock, String art_codigo, Date art_fecha_vencimiento, boolean Activo) {
        this.art_id = art_id;
        this.cat_id = cat_id;
        this.prov_id = prov_id;
        this.cat_nombre = cat_nombre;
        this.prov_nombre = prov_nombre;
        this.art_descripcion = art_descripcion;
        this.art_marca = art_marca;
        this.art_stock = art_stock;
        this.art_codigo = art_codigo;
        this.art_fecha_vencimiento = art_fecha_vencimiento;
        this.Activo = Activo;
    }

    public Articulos(int art_id, String art_descripcion) {
        this.art_id = art_id;
        this.art_descripcion = art_descripcion;
    }

    public Articulos(int art_id, int prov_id, String art_descripcion) {
        this.art_id = art_id;
        this.prov_id = prov_id;
        this.art_descripcion = art_descripcion;
    }
    
    

    public int getArt_id() {
        return art_id;
    }

    public void setArt_id(int art_id) {
        this.art_id = art_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }

    public String getProv_nombre() {
        return prov_nombre;
    }

    public void setProv_nombre(String prov_nombre) {
        this.prov_nombre = prov_nombre;
    }

    public String getArt_descripcion() {
        return art_descripcion;
    }

    public void setArt_descripcion(String art_descripcion) {
        this.art_descripcion = art_descripcion;
    }

    public String getArt_marca() {
        return art_marca;
    }

    public void setArt_marca(String art_marca) {
        this.art_marca = art_marca;
    }

    public int getArt_stock() {
        return art_stock;
    }

    public void setArt_stock(int art_stock) {
        this.art_stock = art_stock;
    }

    public String getArt_codigo() {
        return art_codigo;
    }

    public void setArt_codigo(String art_codigo) {
        this.art_codigo = art_codigo;
    }

    public Date getArt_fecha_vencimiento() {
        return art_fecha_vencimiento;
    }

    public void setArt_fecha_vencimiento(Date art_fecha_vencimiento) {
        this.art_fecha_vencimiento = art_fecha_vencimiento;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    @Override
    public String toString() {
        return art_descripcion;
    }

}
