/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.service.preelectoral;

import java.util.List;
import pe.com.mcs.springangular.model.Institucion;

/**
 *
 * @author MCondori
 */
public interface InstitucionService {
    public Institucion findById(Long id);
    public List<Institucion> fetchAll();
    public void create(Institucion institucion);
    public void update(Institucion institucion);
    public void delete(Long id);
}
