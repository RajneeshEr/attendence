package com.portal.Repository.CoreRepository;

import com.portal.Entity.Core.CostCenter;
import com.portal.Entity.CoreProjections.CostCenterProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RepositoryRestResource
public interface CostCenterRepository extends CrudRepository<CostCenter, Long> {
    CostCenter findById(long id);
    List<CostCenterProjection> findByCityId(long id);
    List<CostCenterProjection> findAllProjectedBy();
}
