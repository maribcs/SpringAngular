/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.controller.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@RestController()
@RequestMapping("entrega")
public class EntregaController {
    
    // procesos
    @RequestMapping(value = "/proceso", method = RequestMethod.GET)
    public ResponseEntity<List<Map<String, Object>>> listProcesos(){
        
        /*Map<String,String> list = new HashMap<String,String>();
        list.put("1", "PROCESO ELECTORAL 1");
        list.put("2", "PROCESO ELECTORAL 2");*/
        String res = "data";
        
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> mapA = new HashMap<String, Object>();
        mapA.put("P00001", "Proceso 1");
        
        Map<String, Object> mapB = new HashMap<String, Object>();
        mapB.put("P00002", "Proceso 2");
        
        list.add(mapA);
        list.add(mapB);
        
        
        /*if(list.isEmpty()){
            return new ResponseEntity<Map<String,String>>(HttpStatus.NO_CONTENT);
        }*/
        
        if(list.isEmpty()){
            return new ResponseEntity<List<Map<String, Object>>>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<List<Map<String, Object>>>(list,HttpStatus.OK);
    }
    
}
