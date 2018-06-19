package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.HrMasters.Designation;
import com.portal.Resource.HrMasterResource.DesignationResource;
import com.portal.Service.HrMasterService.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class DesignationResourceImpl implements DesignationResource, CommonConstant {

    @Autowired
    private DesignationService designationService;

    public ApplicationResponse save(@RequestBody Designation designation){
        ApplicationResponse applicationResponse = new ApplicationResponse();
        Designation designation1=designationService.save(designation);
        if (designation1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(designation1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }


}
