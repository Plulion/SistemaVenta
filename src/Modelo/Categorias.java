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
public class Categorias {

    private int id;
    private String categoria;
    private boolean activo;

    //este lo uso cuando quiero que el id sea autoincremental
    public Categorias(String categoria, boolean activo) {
        this.categoria = categoria;
        this.activo = activo;
    }

    public Categorias(int id, String categoria, boolean activo) {
        this.id = id;
        this.categoria = categoria;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return categoria;
    }

}
