package com.bah.petclinicproject.services;

import com.bah.petclinicproject.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
