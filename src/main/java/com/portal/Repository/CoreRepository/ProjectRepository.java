package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.Core.Project;
import com.portal.Entity.CoreProjections.ProjectProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface ProjectRepository extends CrudRepository<Project, Long> {
    List<Project> findByName(String name);
    Project findById(long id);
    List<ProjectProjection> findAllProjectedBy();
    //@Query("select p from Project p where p.businessUnit_id = ?1")
    ArrayList<ProjectProjection> findByBusinessUnitId(long businessUnit);
}