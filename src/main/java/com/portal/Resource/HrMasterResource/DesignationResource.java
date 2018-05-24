package com.portal.Resource.HrMasterResource;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasterSetUp.Designation;
import com.portal.Service.HrMasterServices.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
@RequestMapping("/rest/designation")
public class DesignationResource implements CommonConstant{

    @Autowired
    private DesignationService designationService;

    @PostMapping("/saveDesignation")
    public String saveMasterPage(@RequestBody Designation designation){
        if (designationService.saveDesignation(designation)!=null){
            return SAVE;
        }else {
            return NOT_SAVE;
        }
    }


}
