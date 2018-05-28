package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasters.Employment;
import com.portal.Entity.HrMastersProjections.EmploymentProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource(excerptProjection = EmploymentProjection.class)
public interface EmploymentRepository extends CrudRepository<Employment, Long> {
        Employment findByCode(String code);
        Employment findById(long id);
}
