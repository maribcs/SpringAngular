/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author MCondori
 */
public class Elector implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    
    @Column(name = "num_documento")
    private String numeroDocumento;
    
    @Column(name = "nombres")
    private String nombres;
    
    @Column(name = "ape_paterno")
    private String apellidoPaterno;
    
    @Column(name = "ape_materno")
    private String apellidoMaterno;
    
    @Column(name = "correo_principal")
    private String correoPrincipal;
    
    @Column(name = "correo_alterno")
    private String correoAlterno;
    
    @Column(name = "telefono_principal")
    private String telefonoPrincipal;
    
    @Column(name = "telefono_alterno")
    private String telefonoAlterno;
    
    @Column(name = "proceso_id")
    private ProcesoElectoral procesoElectoral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreoPrincipal() {
        return correoPrincipal;
    }

    public void setCorreoPrincipal(String correoPrincipal) {
        this.correoPrincipal = correoPrincipal;
    }

    public String getCorreoAlterno() {
        return correoAlterno;
    }

    public void setCorreoAlterno(String correoAlterno) {
        this.correoAlterno = correoAlterno;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTelefonoAlterno() {
        return telefonoAlterno;
    }

    public void setTelefonoAlterno(String telefonoAlterno) {
        this.telefonoAlterno = telefonoAlterno;
    }

    public ProcesoElectoral getProcesoElectoral() {
        return procesoElectoral;
    }

    public void setProcesoElectoral(ProcesoElectoral procesoElectoral) {
        this.procesoElectoral = procesoElectoral;
    }
    
    
}
