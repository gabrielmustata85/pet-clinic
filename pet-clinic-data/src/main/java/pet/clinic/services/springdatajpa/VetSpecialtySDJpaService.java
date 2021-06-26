package pet.clinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pet.clinic.model.Speciality;
import pet.clinic.repositories.SpecialtyRepository;
import pet.clinic.services.SpecialtyService;
import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public VetSpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);

    }

    @Override
    public Speciality save(Speciality object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
