/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.service.preelectoral;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.mcs.springangular.dao.InstitucionDao;
import pe.com.mcs.springangular.model.Institucion;

/**
 *
 * @author MCondori
 */
@Service("institucionService")
public class InstitucionServiceImpl implements InstitucionService{
    
    @Autowired
    private InstitucionDao institucionDao;
    
    @Override
    public Institucion findById(Long id){
        return institucionDao.findById(id);
    }
    @Override
    public List<Institucion> fetchAll(){
        return institucionDao.fetchAll();
    }
    @Override
    public void create(Institucion institucion){
        institucionDao.create(institucion);
    }
    @Override
    public void update(Institucion institucion){
        institucionDao.update(institucion);
    }
    @Override
    public void delete(Long id){
        institucionDao.delete(id);
    }
}
