/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.mcs.springangular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author MCondori
 */
@Controller
public class DemoController {
    @RequestMapping(value = {"/inicio"}, method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("user", "Usuario prueba");
        return "index";
    }
    
    @RequestMapping(value = {"/procesos"}, method = RequestMethod.GET)
    public String procesos(ModelMap model){
        model.addAttribute("user", "Usuario prueba");
        return "listProcesos";
    }
}
