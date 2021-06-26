package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
