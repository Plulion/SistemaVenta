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
public class Proveedor {
    
    private int ID_PRO;    
    private String PRO_RUT_PROVEEDOR;
    private String PRO_NOMBRE;
    private int PRO_TELEFONO;
    private String PRO_CORREO;
    private String PRO_DIRECCION;  
    private String RAZON; 
    private boolean Activo;

    //Constructor PRIMERO SIN ID DESPUES TODOS

    public Proveedor(String PRO_RUT_PROVEEDOR, String PRO_NOMBRE, int PRO_TELEFONO, String PRO_CORREO, String PRO_DIRECCION, String RAZON, boolean Activo) {
        this.PRO_RUT_PROVEEDOR = PRO_RUT_PROVEEDOR;
        this.PRO_NOMBRE = PRO_NOMBRE;
        this.PRO_TELEFONO = PRO_TELEFONO;
        this.PRO_CORREO = PRO_CORREO;
        this.PRO_DIRECCION = PRO_DIRECCION;
        this.RAZON = RAZON;
        this.Activo = Activo;
    }

    public Proveedor(int ID_PRO, String PRO_RUT_PROVEEDOR, String PRO_NOMBRE, int PRO_TELEFONO, String PRO_CORREO, String PRO_DIRECCION, String RAZON, boolean Activo) {
        this.ID_PRO = ID_PRO;
        this.PRO_RUT_PROVEEDOR = PRO_RUT_PROVEEDOR;
        this.PRO_NOMBRE = PRO_NOMBRE;
        this.PRO_TELEFONO = PRO_TELEFONO;
        this.PRO_CORREO = PRO_CORREO;
        this.PRO_DIRECCION = PRO_DIRECCION;
        this.RAZON = RAZON;
        this.Activo = Activo;
    }

    public int getID_PRO() {
        return ID_PRO;
    }

    public void setID_PRO(int ID_PRO) {
        this.ID_PRO = ID_PRO;
    }

    public String getPRO_RUT_PROVEEDOR() {
        return PRO_RUT_PROVEEDOR;
    }

    public void setPRO_RUT_PROVEEDOR(String PRO_RUT_PROVEEDOR) {
        this.PRO_RUT_PROVEEDOR = PRO_RUT_PROVEEDOR;
    }

    public String getPRO_NOMBRE() {
        return PRO_NOMBRE;
    }

    public void setPRO_NOMBRE(String PRO_NOMBRE) {
        this.PRO_NOMBRE = PRO_NOMBRE;
    }

    public int getPRO_TELEFONO() {
        return PRO_TELEFONO;
    }

    public void setPRO_TELEFONO(int PRO_TELEFONO) {
        this.PRO_TELEFONO = PRO_TELEFONO;
    }

    public String getPRO_CORREO() {
        return PRO_CORREO;
    }

    public void setPRO_CORREO(String PRO_CORREO) {
        this.PRO_CORREO = PRO_CORREO;
    }

    public String getPRO_DIRECCION() {
        return PRO_DIRECCION;
    }

    public void setPRO_DIRECCION(String PRO_DIRECCION) {
        this.PRO_DIRECCION = PRO_DIRECCION;
    }

    public String getRAZON() {
        return RAZON;
    }

    public void setRAZON(String RAZON) {
        this.RAZON = RAZON;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
}
   
        
        //getter and setter
   