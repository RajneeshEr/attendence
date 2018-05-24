package com.portal.Repository.HrMasterSetUpRepository;

import com.portal.Entity.HrMasterSetUp.StaffType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface StaffTypeRepository extends CrudRepository<StaffType, Long> {

}
