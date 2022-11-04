package com.Ejercicio.chuchip.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class ControllerObject {

    private List<String> listPath;
    private List<Map> header;

    private List<Map> query;

    public ControllerObject(){
        listPath = new ArrayList<>();
        header = new ArrayList<>();
        query = new ArrayList<>();
    }

    public void addPath(String path, String path2){
        if(path!=null) {
            listPath.add(path);
        }
        if(path!=null) {
            listPath.add(path2);
        }
    }
    public void addHeader(Map path){
        if(path!=null) {
            header.add(path);
        }
    }

    public void addQuery(Map path){
        if(path!=null){
            query.add(path);
        }
    }
}
