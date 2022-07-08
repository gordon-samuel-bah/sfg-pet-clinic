package com.bah.petclinicproject.repositories;

import com.bah.petclinicproject.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
