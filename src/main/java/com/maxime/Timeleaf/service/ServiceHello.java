package com.maxime.Timeleaf.service;


import com.maxime.Timeleaf.model.Model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceHello {
    private String prenom = "hello";
    private List<Model> listModel = new ArrayList<>();

    public List<Model> getListModel(){
        listModel.add(new Model(1,"Bob", 12));
        listModel.add(new Model(2,"BobA", 14));
        listModel.add(new Model(3,"BobB", 15));
        listModel.add(new Model(4,"BobC", 16));
        return listModel;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Model getmodelbyid (Long id){
        for (Model a : listModel){
            if (a.getId()==id){
                return a;
            }
        }
        return null;
    }
}
