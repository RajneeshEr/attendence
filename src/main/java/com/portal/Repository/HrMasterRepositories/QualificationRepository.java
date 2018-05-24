package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasterSetUp.Qualification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface QualificationRepository extends CrudRepository<Qualification, Long> {
    Qualification findById(long id);

}
