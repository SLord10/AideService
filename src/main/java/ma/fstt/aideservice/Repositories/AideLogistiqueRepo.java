package ma.fstt.aideservice.Repositories;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.AideLogistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AideLogistiqueRepo extends JpaRepository<AideLogistique, Long> {
    @Query("select a from AideLogistique a where a.catastrophe_id = ?1")
    List<AideLogistique> findByCatastrophe_id(Long catastrophe_id);
}
