package com.portal.Repository;

import com.portal.Entity.Designation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface DesignationRepository extends CrudRepository<Designation, Long> {
    List<Designation> findByType(String type);
    List<Designation> findByName(String name);

}
