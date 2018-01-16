/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.model;

import java.io.Serializable;

/**
 *
 * @author MCondori
 */
public class Institucion implements Serializable {
    
    private Long id;
    private String nombre;
    private String tipo;
    private String ruc;
    private String direccion;
    private String tlfnoPrincipal;
    private String tlfnoAlterno;
    private String correo;
    private String Logo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTlfnoPrincipal() {
        return tlfnoPrincipal;
    }

    public void setTlfnoPrincipal(String tlfnoPrincipal) {
        this.tlfnoPrincipal = tlfnoPrincipal;
    }

    public String getTlfnoAlterno() {
        return tlfnoAlterno;
    }

    public void setTlfnoAlterno(String tlfnoAlterno) {
        this.tlfnoAlterno = tlfnoAlterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }
    
    
}
