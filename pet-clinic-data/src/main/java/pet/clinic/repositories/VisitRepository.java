package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
