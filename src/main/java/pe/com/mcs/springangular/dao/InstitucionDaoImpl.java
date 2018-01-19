/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.mcs.springangular.model.Institucion;

/**
 *
 * @author MCondori
 */
@Repository("institucionDao")
public class InstitucionDaoImpl implements InstitucionDao{
    @Override
    public Institucion findById(Long id){
        Institucion oInstitucion = new Institucion();
        oInstitucion.setId(1L);
        return oInstitucion;
    }
    @Override
    public List<Institucion> fetchAll(){
        List<Institucion> lstInstitucion = new ArrayList<>();
        Institucion oInstitucionA = new Institucion();
        oInstitucionA.setId(1L);
        oInstitucionA.setNombre("COLEGIO PROFESIONAL A");
        oInstitucionA.setRuc("20304050607");
        oInstitucionA.setTlfnoPrincipal("3456789");
        
        lstInstitucion.add(oInstitucionA);
        Institucion oInstitucionB = new Institucion();
        oInstitucionB.setId(2L);
        oInstitucionB.setNombre("COLEGIO PROFESIONAL B");
        oInstitucionB.setRuc("20304050608");
        oInstitucionB.setTlfnoPrincipal("3456780");
        lstInstitucion.add(oInstitucionB);
        
        return lstInstitucion;
    }
    @Override
    public void create(Institucion institucion){
        
    }
    @Override
    public void update(Institucion institucion){
        
    }
    @Override
    public void delete(Long id){
        
    }
    
}
