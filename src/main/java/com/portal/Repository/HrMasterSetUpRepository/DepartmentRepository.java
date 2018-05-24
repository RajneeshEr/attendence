package com.portal.Repository.HrMasterSetUpRepository;

import com.portal.Entity.HrMasterSetUp.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RepositoryRestResource
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
