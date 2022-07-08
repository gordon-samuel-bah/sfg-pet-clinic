package com.bah.petclinicproject.repositories;

import com.bah.petclinicproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
