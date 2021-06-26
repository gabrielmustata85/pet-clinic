package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
