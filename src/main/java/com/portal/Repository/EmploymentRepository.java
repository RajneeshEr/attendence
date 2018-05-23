package com.portal.Repository;

import com.portal.Entity.Employment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmploymentRepository extends CrudRepository<Employment, Long> {

}
