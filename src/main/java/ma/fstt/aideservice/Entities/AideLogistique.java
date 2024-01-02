package ma.fstt.aideservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aidelogistique")
@DiscriminatorValue("2")

public class AideLogistique extends Aide{

    private String type;
    private Integer quantite;
}
