package ma.fstt.aideservice.Repositories;

import ma.fstt.aideservice.Entities.Aide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface AideRepo extends JpaRepository<Aide,Long> {
    @Query("select a from Aide a where a.catastrophe_id = ?1")
    List<Aide> findByCatastrophe_id(Long catastrophe_id);

}
