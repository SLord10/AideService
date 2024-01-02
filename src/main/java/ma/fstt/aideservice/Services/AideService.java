package ma.fstt.aideservice.Services;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Repositories.AideRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AideService {
    @Autowired
    AideRepo AideRepo;

    public Aide save(Aide aide) {
        return AideRepo.save(aide);
    }
    public Aide getone(Long id) {
        return AideRepo.findById(id).get();
    }
    public List<Aide> getall() {
        return AideRepo.findAll();
    }
    public void delete(Long id) {
        AideRepo.deleteById(id);
    }
    public Aide update( Aide aide) {
        return AideRepo.save(aide);
    }

    public List<Aide> findByCatastrophe_id(Long id) {
        return AideRepo.findByCatastrophe_id(id);
    }



}
