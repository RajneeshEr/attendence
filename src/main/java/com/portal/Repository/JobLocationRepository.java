package com.portal.Repository;

import com.portal.Entity.JobLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface JobLocationRepository extends CrudRepository<JobLocation, Long> {
    List<JobLocation> findByJobLocationName(String jobloctaionName);

}
