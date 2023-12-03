package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, Long> {
    List<Compte> findByType(TypeCompte type);
}
