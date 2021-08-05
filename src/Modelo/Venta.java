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
public class Venta {
    
    private int id;
    private String id_cliente;
    private int idPack;
    private int idBanco;
    private int idRrss;
    private int idComuna;
    private int idEstadoVenta;
    private int total;
    private Date fechaVenta;
    private Date fechaTranferencia;
    private int codigoTransferencia;
    private int stIdEstado;
    private String nombreDestinatario;
    private String direccionDestinatario;
    private int comIdComuna;
    private int telefono;
    private String correo;
    private Date fechaEntrega;
    private String hEntregaIn;
    private String hEntregaFin;
    private String saludo;


    //sin ID
    public Venta(String id_cliente, int idPack, int idBanco, int idRrss, int idComuna, int idEstadoVenta, int total, Date fechaVenta, Date fechaTranferencia, int codigoTransferencia, int stIdEstado, String nombreDestinatario, String direccionDestinatario, int comIdComuna, int telefono, String correo, Date fechaEntrega, String hEntregaIn, String hEntregaFin, String saludo) {
        this.id_cliente = id_cliente;
        this.idPack = idPack;
        this.idBanco = idBanco;
        this.idRrss = idRrss;
        this.idComuna = idComuna;
        this.idEstadoVenta = idEstadoVenta;
        this.total = total;
        this.fechaVenta = fechaVenta;
        this.fechaTranferencia = fechaTranferencia;
        this.codigoTransferencia = codigoTransferencia;
        this.stIdEstado = stIdEstado;
        this.nombreDestinatario = nombreDestinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.comIdComuna = comIdComuna;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaEntrega = fechaEntrega;
        this.hEntregaIn = hEntregaIn;
        this.hEntregaFin = hEntregaFin;
        this.saludo = saludo;
    }

    public Venta(int id, String id_cliente, int idPack, int idBanco, int idRrss, int idComuna, int idEstadoVenta, int total, Date fechaVenta, Date fechaTranferencia, int codigoTransferencia, int stIdEstado, String nombreDestinatario, String direccionDestinatario, int comIdComuna, int telefono, String correo, Date fechaEntrega, String hEntregaIn, String hEntregaFin, String saludo) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.idPack = idPack;
        this.idBanco = idBanco;
        this.idRrss = idRrss;
        this.idComuna = idComuna;
        this.idEstadoVenta = idEstadoVenta;
        this.total = total;
        this.fechaVenta = fechaVenta;
        this.fechaTranferencia = fechaTranferencia;
        this.codigoTransferencia = codigoTransferencia;
        this.stIdEstado = stIdEstado;
        this.nombreDestinatario = nombreDestinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.comIdComuna = comIdComuna;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaEntrega = fechaEntrega;
        this.hEntregaIn = hEntregaIn;
        this.hEntregaFin = hEntregaFin;
        this.saludo = saludo;
    }

    //lo uso solo al crear ya que faltan datos
    public Venta(String id_cliente, int idPack, int idComuna, int idEstadoVenta, int total, String nombreDestinatario, String direccionDestinatario, int telefono, String correo, String hEntregaIn, String hEntregaFin, String saludo) {
        this.id_cliente = id_cliente;
        this.idPack = idPack;
        this.idComuna = idComuna;
        this.idEstadoVenta = idEstadoVenta;
        this.total = total;
        this.nombreDestinatario = nombreDestinatario;
        this.direccionDestinatario = direccionDestinatario;
        this.telefono = telefono;
        this.correo = correo;
        this.hEntregaIn = hEntregaIn;
        this.hEntregaFin = hEntregaFin;
        this.saludo = saludo;
    }

    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getIdPack() {
        return idPack;
    }

    public void setIdPack(int idPack) {
        this.idPack = idPack;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public int getIdRrss() {
        return idRrss;
    }

    public void setIdRrss(int idRrss) {
        this.idRrss = idRrss;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public int getIdEstadoVenta() {
        return idEstadoVenta;
    }

    public void setIdEstadoVenta(int idEstadoVenta) {
        this.idEstadoVenta = idEstadoVenta;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String gethEntregaIn() {
        return hEntregaIn;
    }

    public void sethEntregaIn(String hEntregaIn) {
        this.hEntregaIn = hEntregaIn;
    }

    public String gethEntregaFin() {
        return hEntregaFin;
    }

    public void sethEntregaFin(String hEntregaFin) {
        this.hEntregaFin = hEntregaFin;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    
    
}
