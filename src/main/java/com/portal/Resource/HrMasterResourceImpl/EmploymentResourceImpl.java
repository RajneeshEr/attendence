package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
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

    public ApplicationResponse save(@RequestBody Employment employment) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        Employment employment1=employmentService.save(employment);
        if (employment1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(employment1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }
}