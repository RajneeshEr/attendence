package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Department;
import com.portal.Resource.HrMasterResource.DepartmentResource;
import com.portal.Service.HrMasterService.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class DepartmentResourceImpl implements CommonConstant,DepartmentResource{

    @Autowired
    private DepartmentService departmentService;

    public String save(@RequestBody Department object) {
        if (departmentService.save(object) != null) {
            return SAVE;
        } else {
            return NOT_SAVE;
        }
    }

    public Department get(long id) {
       return departmentService.findById(1);
    }

}