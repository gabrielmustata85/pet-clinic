package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
