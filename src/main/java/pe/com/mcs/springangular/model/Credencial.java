/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.model;

/**
 *
 * @author MCondori
 */
public class Credencial {
    
    private Long id;
    private String numero;
    private String estado;
    private ProcesoElectoral procesoElectoral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProcesoElectoral getProcesoElectoral() {
        return procesoElectoral;
    }

    public void setProcesoElectoral(ProcesoElectoral procesoElectoral) {
        this.procesoElectoral = procesoElectoral;
    }
    
}
