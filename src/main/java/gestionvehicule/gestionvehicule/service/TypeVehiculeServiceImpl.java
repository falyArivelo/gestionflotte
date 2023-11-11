package gestionvehicule.gestionvehicule.service;

import gestionvehicule.gestionvehicule.models.TypeVehicule;
import gestionvehicule.gestionvehicule.models.Vehicule;
import gestionvehicule.gestionvehicule.repository.TypeVehiculeRepository;
import gestionvehicule.gestionvehicule.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TypeVehiculeServiceImpl implements TypeVehiculeService{
    TypeVehiculeRepository typeVehiculeRepository;

    @Override
    public TypeVehicule save(TypeVehicule typeVehicule) {
        return typeVehiculeRepository.save(typeVehicule);

    }

    @Override
    public List<TypeVehicule> list() {
        return typeVehiculeRepository.findAll();

    }
}
