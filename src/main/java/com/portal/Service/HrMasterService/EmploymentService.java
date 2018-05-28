package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.Employment;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface EmploymentService {
    //this method will work for save and update employment object
    Employment save(Employment employment);

    boolean findByIdGiven(long id);
    Employment findById(long id);

    Employment findByCode(String code);
    String delete(Employment employment);

}
