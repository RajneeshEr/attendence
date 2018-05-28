package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Grade;
import com.portal.Resource.HrMasterResource.GradeResource;
import com.portal.Service.HrMasterService.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class GradeResourceImpl implements CommonConstant,GradeResource {

    @Autowired
    private GradeService gradeService;


    public String save(@RequestBody Grade object) {
        if (gradeService.save(object) != null) {
            return SAVE;
        } else {
            return NOT_SAVE;
        }
    }

}