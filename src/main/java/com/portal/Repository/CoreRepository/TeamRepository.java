package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.Team;
import com.portal.Entity.CoreProjections.TeamProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface TeamRepository extends CrudRepository<Team, Long> {
    List<Team> findByName(String name);
    Team findById(long id);
    List<TeamProjection> findAllProjectedBy();
}