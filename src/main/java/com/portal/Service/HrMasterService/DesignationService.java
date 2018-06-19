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
    Designation findById(long id);
    Designation save(Designation designation);
    Designation findByName(String name);
    Designation findByCode(String code);
    String delete(Designation designation);
}
