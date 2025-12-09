package com.maxime.Timeleaf.controler;


import com.maxime.Timeleaf.service.ServiceHello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Controler {
    private ServiceHello serviceHello;// instanciation de l'objet crée dans service

    public Controler(ServiceHello serviceHello) {
        this.serviceHello = serviceHello;
    }




    @GetMapping("/")
    public String templatesHello (Model model){
        model.addAttribute("prenom",serviceHello.getPrenom()); // Permet l affichage sur la page web
        return "hello";
    }
    @GetMapping("/model")
    public String getModel (Model model){
        model.addAttribute("models",serviceHello.getListModel());
        return "model";

    }
    @GetMapping("/model/{id}")
    public String getDetails (Model model,@PathVariable Long id){
        model.addAttribute("model", serviceHello.getmodelbyid(id));
        return "modelDetail";

    }


}
