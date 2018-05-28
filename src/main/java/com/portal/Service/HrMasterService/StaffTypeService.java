package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.StaffType;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface StaffTypeService {

    StaffType save(StaffType staffType);

    boolean findByIdGiven(long id);

    StaffType findById(long id);

    String delete(StaffType object);

}
