package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.Chauffeur;
import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.service.ChauffeurService;
import gestionvehicule.gestionvehicule.service.TypeVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chauffeur")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ChauffeurController {
    ChauffeurService chauffeurService;

    @PostMapping("create")
    public Chauffeur create(@RequestBody Chauffeur chauffeur){
        return  chauffeurService.save(chauffeur);
    }
    @GetMapping("list")
    public List<Chauffeur> list(){
        return chauffeurService.list();
    }

}
