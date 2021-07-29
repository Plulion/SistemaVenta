/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;


/**
 *
 * @author Meli
 */
public class Clientes {
    
    private String RUT;
    private String CLI_NOMBRE;
    private String CLI_APELLIDO;
    private int CLI_TELEFONO;
    private int CLI_CELULAR;
    private String CLI_CORREO;
    private Date Fecha_Nacimiento;
    private boolean Activo;
    
    //Constructor

    public Clientes(String RUT, String CLI_NOMBRE, String CLI_APELLIDO, int CLI_TELEFONO, int CLI_CELULAR, String CLI_CORREO, Date Fecha_Nacimiento, boolean Activo) {
        this.RUT = RUT;
        this.CLI_NOMBRE = CLI_NOMBRE;
        this.CLI_APELLIDO = CLI_APELLIDO;
        this.CLI_TELEFONO = CLI_TELEFONO;
        this.CLI_CELULAR = CLI_CELULAR;
        this.CLI_CORREO = CLI_CORREO;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Activo = Activo;
    }

    public Clientes(String text, String text0, int parseInt, int parseInt0, String text1, Date date, boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//getter and setter
    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public String getCLI_NOMBRE() {
        return CLI_NOMBRE;
    }

    public void setCLI_NOMBRE(String CLI_NOMBRE) {
        this.CLI_NOMBRE = CLI_NOMBRE;
    }

    public String getCLI_APELLIDO() {
        return CLI_APELLIDO;
    }

    public void setCLI_APELLIDO(String CLI_APELLIDO) {
        this.CLI_APELLIDO = CLI_APELLIDO;
    }

    public int getCLI_TELEFONO() {
        return CLI_TELEFONO;
    }

    public void setCLI_TELEFONO(int CLI_TELEFONO) {
        this.CLI_TELEFONO = CLI_TELEFONO;
    }

    public int getCLI_CELULAR() {
        return CLI_CELULAR;
    }

    public void setCLI_CELULAR(int CLI_CELULAR) {
        this.CLI_CELULAR = CLI_CELULAR;
    }

    public String getCLI_CORREO() {
        return CLI_CORREO;
    }

    public void setCLI_CORREO(String CLI_CORREO) {
        this.CLI_CORREO = CLI_CORREO;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
}

   