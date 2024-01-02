package ma.fstt.aideservice.Repositories;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.AideFinancier;
import ma.fstt.aideservice.Entities.Volontariat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VolontariatRepo extends JpaRepository<Volontariat, Long> {
    @Query("select a from Volontariat a where a.catastrophe_id = ?1")
    List<Volontariat> findByCatastrophe_id(Long catastrophe_id);
}
