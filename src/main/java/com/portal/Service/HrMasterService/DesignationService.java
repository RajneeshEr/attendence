package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.Designation;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface DesignationService {

    boolean findByIdGiven(long id);
    Designation findById(long id);

    // this method will work for save or update object
    Designation saveDesignation(Designation designation);
    Designation getDesignationByName(String name);
    Designation getDesignationByCode(String code);
    String delete(Designation designation);

}
