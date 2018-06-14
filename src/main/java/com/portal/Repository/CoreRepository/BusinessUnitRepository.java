package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.CoreProjections.BusinessUnitProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@RepositoryRestResource
public interface BusinessUnitRepository extends CrudRepository<BusinessUnit, Long> {
    BusinessUnit findById(long id);
    ArrayList<BusinessUnitProjection> findAllProjectedBy();
}