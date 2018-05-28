package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.Qualification;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface QualificationService {

    Qualification findById(long id);

    boolean findByIdGiven(long id);

    Qualification save(Qualification qualification);

    String delete(Qualification object);

}
