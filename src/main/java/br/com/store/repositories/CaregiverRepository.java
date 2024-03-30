package br.com.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.store.models.Caregiver;
// the jpa will make all methods with the responsability to manipulate the data from model. (update, create, delete, read)
// repository always will be a interface to make the pattern methods. receive <model type, and id type from model>
public interface CaregiverRepository extends JpaRepository<Caregiver, Long> {
    
}
