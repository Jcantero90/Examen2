package com.Ejercicio.chuchip.service;

import com.Ejercicio.chuchip.model.ControllerObject;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ControllerObjectService {

    ControllerObject controllerObject = new ControllerObject();

    public ControllerObject addParamsAndHeaders(String path, String path2, Map header, Map query){
        controllerObject.addPath(path, path2);
        controllerObject.addHeader(header);
        controllerObject.addQuery(query);
        return controllerObject;
    }

}
