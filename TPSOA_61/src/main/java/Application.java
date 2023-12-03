import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private CompteRepository compteRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajouter trois comptes de types différents
        Compte compteEpargne1 = new Compte(0, new Date(), TypeCompte.EPARGNE, EtatCompte.CREE);
        Compte compteEpargne2 = new Compte(0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
        Compte compteCourant = new Compte(0, new Date(), TypeCompte.COURANT, EtatCompte.SUSPENDU);

        compteRepository.saveAll(Arrays.asList(compteEpargne1, compteEpargne2, compteCourant));

        // Afficher les soldes des comptes
        List<Compte> comptes = compteRepository.findAll();
        for (Compte compte : comptes) {
            System.out.println("Solde du compte " + compte.getId() + ": " + compte.getSolde());
        }
    }
}
