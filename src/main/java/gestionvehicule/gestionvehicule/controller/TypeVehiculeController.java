package gestionvehicule.gestionvehicule.controller;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.models.Vehicule;
import gestionvehicule.gestionvehicule.service.TypeVehiculeService;
import gestionvehicule.gestionvehicule.service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typevehicule")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class TypeVehiculeController {
    TypeVehiculeService typeVehiculeService;
    @PostMapping("create")
    public TypeVehicule create(@RequestBody TypeVehicule typeVehicule){
        return  typeVehiculeService.save(typeVehicule);
    }
    @GetMapping("list")
    public List<TypeVehicule> list(){
        return typeVehiculeService.list();
    }
}
