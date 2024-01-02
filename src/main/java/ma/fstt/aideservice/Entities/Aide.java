package ma.fstt.aideservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aide")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_aide",discriminatorType = DiscriminatorType.INTEGER)
public class Aide {
    @Id
    @GeneratedValue
    private Long aide_id;
    protected Float coordoonnees_x;
    protected Float coordoonnees_y;
    protected Date dateDebut;
    protected Date dateFin;
    protected Long catastrophe_id;
}
