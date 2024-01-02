package ma.fstt.aideservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aidefinancier")
@DiscriminatorValue("1")

public class AideFinancier extends Aide {

    private Float montant;
}
