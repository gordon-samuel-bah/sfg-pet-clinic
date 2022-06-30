package com.bah.petclinicproject.services;

import com.bah.petclinicproject.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);
}
