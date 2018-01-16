/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.controller.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.com.mcs.springangular.model.Institucion;
import pe.com.mcs.springangular.service.preelectoral.InstitucionService;
/**
 *
 * @author MCondori
 */
@RestController()
@RequestMapping("/institucion")
public class InstitucionController {
    
    @Autowired
    InstitucionService institucionService;
    
    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<Institucion>> fetchAll(){
        List<Institucion> list = institucionService.fetchAll();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public ResponseEntity<Institucion> get(@PathVariable("id") Long id){
        Institucion institucion = institucionService.findById(id);
        if(institucion == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(institucion,HttpStatus.OK);
    }    
}
