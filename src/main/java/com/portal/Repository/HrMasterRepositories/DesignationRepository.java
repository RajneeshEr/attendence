package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasters.Designation;
import com.portal.Entity.HrMastersProjections.DesignationProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource(excerptProjection = DesignationProjection.class)
public interface DesignationRepository extends CrudRepository<Designation, Long> {
    Designation findByCode(String code);
    Designation findByName(String name);
    Designation findById(long id);

}
