package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasters.StaffType;
import com.portal.Entity.HrMastersProjections.StaffTypeProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource(excerptProjection = StaffTypeProjection.class)
public interface StaffTypeRepository extends CrudRepository<StaffType, Long> {
    StaffType findById(long id);

}
