package pet.clinic.services.map;


import pet.clinic.model.Owner;
import org.springframework.stereotype.Service;
import pet.clinic.model.Pet;
import pet.clinic.model.PetType;
import pet.clinic.services.OwnerService;
import pet.clinic.services.PetService;
import pet.clinic.services.PetTypeService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        Owner saveOwner = null;
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId() == null) {
                        Pet savePet = petService.save(pet);
                        pet.setId(savePet.getId());
                    }
                });

            }
            return super.save(object);
        } else {
            return null;
        }
    }

        @Override
        public void delete (Owner object){
            super.delete(object);
        }


        @Override
        public Owner findByLastName (String lastName){
            return null;
        }
    }
