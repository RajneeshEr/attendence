package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Designation;
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
public class DesignationResourceImpl implements CommonConstant {

    @Autowired
    private DesignationService designationService;

    public String save(@RequestBody Designation designation){
        if (designationService.saveDesignation(designation)!=null){
            return SAVE;
        }else {
            return NOT_SAVE;
        }
    }

}
