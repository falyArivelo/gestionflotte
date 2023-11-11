package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.models.Vehicule;

import java.util.List;

public interface TypeVehiculeService {
    TypeVehicule save(TypeVehicule typeVehicule);

    List<TypeVehicule> list();
}
