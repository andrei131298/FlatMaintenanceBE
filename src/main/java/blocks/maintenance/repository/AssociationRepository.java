package blocks.maintenance.repository;

import blocks.maintenance.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Long> {
}
