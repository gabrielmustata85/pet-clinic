package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
