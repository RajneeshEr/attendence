package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasterSetUp.Designation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface DesignationRepository extends CrudRepository<Designation, Long> {
    Designation findByCode(String code);
    Designation findByName(String name);
    Designation findById(long id);

}
