package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.Chauffeur;
import gestionvehicule.gestionvehicule.models.Trajet;
import gestionvehicule.gestionvehicule.service.ChauffeurService;
import gestionvehicule.gestionvehicule.service.TrajetService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trajet")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class TrajetController {

    TrajetService trajetService;

    @PostMapping("create")
    public Trajet create(@RequestBody Trajet trajet){
        return  trajetService.save(trajet);
    }
    @GetMapping("list")
    public List<Trajet> list(){
        return trajetService.list();
    }
}
