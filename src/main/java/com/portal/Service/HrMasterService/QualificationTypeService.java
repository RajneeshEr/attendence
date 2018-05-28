package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.QualificationType;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface QualificationTypeService {
    QualificationType save(QualificationType qualificationType);

    boolean findByIdGiven(long id);

    QualificationType findById(long id);

    String delete(QualificationType object);

}
