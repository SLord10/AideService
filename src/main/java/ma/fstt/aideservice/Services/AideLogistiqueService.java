package ma.fstt.aideservice.Services;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.AideLogistique;
import ma.fstt.aideservice.Repositories.AideLogistiqueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AideLogistiqueService {
    @Autowired
    AideLogistiqueRepo AideLogistiqueRepo;

    public void delete(Long id) {
        AideLogistiqueRepo.deleteById(id);
    }
    public AideLogistique save(AideLogistique aide) {
        return AideLogistiqueRepo.save(aide);
    }
    public AideLogistique getone(Long id) {
        return AideLogistiqueRepo.findById(id).get();
    }
    public AideLogistique update( AideLogistique aide) {
        return AideLogistiqueRepo.save(aide);
    }
    public List<AideLogistique> getall() {
        return AideLogistiqueRepo.findAll();
    }

    public List<AideLogistique> findByCatastrophe_id(Long id) {
        return AideLogistiqueRepo.findByCatastrophe_id(id);
    }
}
