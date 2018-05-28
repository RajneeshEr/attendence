package com.portal.Repository;

import com.portal.Entity.Core.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findById(long id);

}
