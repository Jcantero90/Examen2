package com.Ejercicio.chuchip.controller;

import com.Ejercicio.chuchip.service.ControllerObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class AddControllerObjectController {

@Autowired
    ControllerObjectService controllerObject;

    @PostMapping(value = {"*","{Path}","{Path}/{Path2}"})
    public Object addObjectWithParams(@PathVariable(required = false) String Path, @PathVariable (required = false) String Path2, @RequestHeader (required = false) Map header1, @RequestParam (required = false) Map query){
//No consigo hacerlo funcionar.
//        if((header1.equals("salto") && header1.values().equals("SALTA"))){
//            return new ModelAndView("redirect:/salt");
//        }
        return controllerObject.addParamsAndHeaders(Path, Path2, header1, query);
    }

    @GetMapping(value = {"/salt"})
    public String entryJump(){
        return "he ido a Jump";
    }

    @GetMapping(value={"/","one"})
    public String entryOne( )
    {
        return "he entrado en la entroyOne";
    }
}