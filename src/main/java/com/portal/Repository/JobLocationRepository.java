package com.portal.Repository;

import com.portal.Entity.JobLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface JobLocationRepository extends CrudRepository<JobLocation, Long> {
    List<JobLocation> findByJobLocationName(String jobloctaionName);

}
