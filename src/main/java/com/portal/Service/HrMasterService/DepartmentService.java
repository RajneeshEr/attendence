package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.Department;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface DepartmentService {
    //this method will work for save or update object
    Department save(Department department);

    Department findById(long id);

    Department findByCode(String code);

    String delete(Department department);

}