package com.bah.petclinicproject.services;

import com.bah.petclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
