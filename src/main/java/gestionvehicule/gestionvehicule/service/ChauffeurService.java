package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Chauffeur;
import gestionvehicule.gestionvehicule.models.TypeVehicule;

import java.util.List;

public interface ChauffeurService {
    Chauffeur save(Chauffeur chauffeur);

    List<Chauffeur> list();
}
