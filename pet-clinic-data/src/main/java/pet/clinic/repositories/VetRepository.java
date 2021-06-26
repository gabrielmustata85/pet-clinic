package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
