package ma.fstt.aideservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "volontariat")
@DiscriminatorValue("3")

public class Volontariat extends Aide{

    private String domaine;
}
