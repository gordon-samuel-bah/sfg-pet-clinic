package com.bah.petclinicproject.repositories;

import com.bah.petclinicproject.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);
}
