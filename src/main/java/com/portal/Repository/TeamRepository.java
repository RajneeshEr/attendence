package com.portal.Repository;

import com.portal.Entity.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TeamRepository extends CrudRepository<Team, Long> {
    List<Team> findByName(String name);
}



