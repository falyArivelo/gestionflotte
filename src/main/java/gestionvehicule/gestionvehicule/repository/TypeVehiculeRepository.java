package gestionvehicule.gestionvehicule.repository;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeVehiculeRepository extends JpaRepository<TypeVehicule,Integer> {
}
