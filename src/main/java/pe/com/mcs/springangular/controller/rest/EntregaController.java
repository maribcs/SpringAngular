/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.controller.rest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MCondori
 */
@RestController("entrega")
public class EntregaController {
    
    // procesos
    @RequestMapping(value = "proc", method = RequestMethod.GET)
    public ResponseEntity<Map<String,String>> listProcesos(){
        
        Map<String,String> list = new HashMap<>();
        list.put("1", "PROCESO ELECTORAL 1");
        list.put("2", "PROCESO ELECTORAL 2");
        
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
}
