package pet.clinic.services;

import pet.clinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);


}
