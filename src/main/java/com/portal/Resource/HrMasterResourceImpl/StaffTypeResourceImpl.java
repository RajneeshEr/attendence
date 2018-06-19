package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.HrMasters.StaffType;
import com.portal.Resource.HrMasterResource.StaffTypeResource;
import com.portal.Service.HrMasterService.StaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class StaffTypeResourceImpl implements CommonConstant,StaffTypeResource{

    @Autowired
    private StaffTypeService staffTypeService;

    @Override
    public ApplicationResponse save(@RequestBody StaffType staffType) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        StaffType staffType1=staffTypeService.save(staffType);
        if (staffType1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(staffType1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }
}