package ma.fstt.aideservice.Services;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.AideFinancier;
import ma.fstt.aideservice.Repositories.AideFinancierRepo;
import ma.fstt.aideservice.Repositories.AideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AideFinancierService {
    @Autowired
    AideFinancierRepo AideFinancierRepo;

    public void delete(Long id) {
        AideFinancierRepo.deleteById(id);
    }
    public AideFinancier save(AideFinancier aide) {
        return AideFinancierRepo.save(aide);
    }
    public AideFinancier getone(Long id) {
        return AideFinancierRepo.findById(id).get();
    }
    public AideFinancier update( AideFinancier aide) {
        return AideFinancierRepo.save(aide);
    }
    public List<AideFinancier> getall() {
        return AideFinancierRepo.findAll();
    }

    public List<AideFinancier> findByCatastrophe_id(Long id) {
        return AideFinancierRepo.findByCatastrophe_id(id);
    }
}
