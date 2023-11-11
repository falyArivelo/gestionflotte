package gestionvehicule.gestionvehicule.repository;

import gestionvehicule.gestionvehicule.models.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet,Integer> {
}
