package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Chauffeur;
import gestionvehicule.gestionvehicule.models.Trajet;

import java.util.List;

public interface TrajetService {
    Trajet save(Trajet trajet);

    List<Trajet> list();
}
