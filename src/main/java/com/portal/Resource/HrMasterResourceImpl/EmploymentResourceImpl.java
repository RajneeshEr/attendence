package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Employment;
import com.portal.Resource.HrMasterResource.EmploymentResource;
import com.portal.Service.HrMasterService.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class EmploymentResourceImpl implements CommonConstant,EmploymentResource {

    @Autowired
    private EmploymentService employmentService;

    public String save(@RequestBody Employment object) {
        if (employmentService.save(object) != null) {
            return SAVE;
        } else {
            return NOT_SAVE;
        }
    }



}