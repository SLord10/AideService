package ma.fstt.aideservice.Repositories;

import ma.fstt.aideservice.Entities.Aide;
import ma.fstt.aideservice.Entities.AideFinancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AideFinancierRepo extends JpaRepository<AideFinancier, Long> {
    @Query("select a from AideFinancier a where a.catastrophe_id = ?1")
    List<AideFinancier> findByCatastrophe_id(Long catastrophe_id);
}
