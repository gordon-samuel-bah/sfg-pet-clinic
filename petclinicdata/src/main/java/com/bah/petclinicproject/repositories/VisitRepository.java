package com.bah.petclinicproject.repositories;

import com.bah.petclinicproject.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
