package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.Chauffeur;
import gestionvehicule.gestionvehicule.repository.ChauffeurRepository;
import gestionvehicule.gestionvehicule.repository.TypeVehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChauffeurServiceImpl implements  ChauffeurService{
    ChauffeurRepository chauffeurRepository;

    @Override
    public Chauffeur save(Chauffeur chauffeur) {
        return chauffeurRepository.save(chauffeur);
    }

    @Override
    public List<Chauffeur> list() {
        return chauffeurRepository.findAll();

    }
}
