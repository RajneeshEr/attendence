package com.portal.Repository.HrMasterRepositories;

import com.portal.Entity.HrMasters.QualificationType;
import com.portal.Entity.HrMastersProjections.QualificationTypeProjection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RepositoryRestResource(excerptProjection = QualificationTypeProjection.class)
public interface QualificationTypeRepository extends CrudRepository<QualificationType, Long> {
    QualificationType findById(long id);
}
