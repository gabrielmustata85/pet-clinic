package pet.clinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pet.clinic.model.Owner;

import java.util.Set;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);


}
