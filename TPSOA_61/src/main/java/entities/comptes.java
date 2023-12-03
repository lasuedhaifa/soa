import lombok.Data;
import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
    @Enumerated(EnumType.STRING)
    private EtatCompte etat;
    public Compte() {
    }
    public Compte(double solde, Date dateCreation, TypeCompte type, EtatCompte etat) {
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
        this.etat = etat;
    }

}
