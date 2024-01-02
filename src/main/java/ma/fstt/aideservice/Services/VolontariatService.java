package ma.fstt.aideservice.Services;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.Volontariat;
import ma.fstt.aideservice.Repositories.VolontariatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolontariatService {
    @Autowired
    VolontariatRepo VolontariatRepo;

    public void delete(Long id) {
        VolontariatRepo.deleteById(id);
    }

    public Volontariat save(Volontariat aide) {
        return VolontariatRepo.save(aide);
    }

    public Volontariat getone(Long id) {
        return VolontariatRepo.findById(id).get();
    }

    public Volontariat update(Volontariat aide) {
        return VolontariatRepo.save(aide);
    }

    public List<Volontariat> getall() {
        return VolontariatRepo.findAll();
    }

    public List<Volontariat> findByCatastrophe_id(Long id) {
        return VolontariatRepo.findByCatastrophe_id(id);
    }
}
