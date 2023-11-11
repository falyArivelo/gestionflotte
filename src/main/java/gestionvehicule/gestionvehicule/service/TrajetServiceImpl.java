package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Trajet;
import gestionvehicule.gestionvehicule.repository.ChauffeurRepository;
import gestionvehicule.gestionvehicule.repository.TrajetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrajetServiceImpl implements TrajetService{
    TrajetRepository trajetRepository;

    @Override
    public Trajet save(Trajet trajet) {
        return trajetRepository.save(trajet);
    }

    @Override
    public List<Trajet> list() {
        return trajetRepository.findAll();
    }
}
