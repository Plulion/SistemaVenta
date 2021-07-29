/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Meli
 */
public class CategoriaVenta {
    
    private int IdEstVta;
    private String EST_DESCRIPCION;
    private boolean Activo;
    
    //Constructor sin ID luego con ID

    public CategoriaVenta(String EST_DESCRIPCION, boolean Activo) {
        this.EST_DESCRIPCION = EST_DESCRIPCION;
        this.Activo = Activo;
    }

    public CategoriaVenta(int IdEstVta, String EST_DESCRIPCION, boolean Activo) {
        this.IdEstVta = IdEstVta;
        this.EST_DESCRIPCION = EST_DESCRIPCION;
        this.Activo = Activo;
    }

    public int getIdEstVta() {
        return IdEstVta;
    }

    public void setIdEstVta(int IdEstVta) {
        this.IdEstVta = IdEstVta;
    }

    public String getEST_DESCRIPCION() {
        return EST_DESCRIPCION;
    }

    public void setEST_DESCRIPCION(String EST_DESCRIPCION) {
        this.EST_DESCRIPCION = EST_DESCRIPCION;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }


    
}
