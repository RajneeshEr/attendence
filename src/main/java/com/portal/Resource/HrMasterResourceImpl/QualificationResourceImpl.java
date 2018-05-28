package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Resource.HrMasterResource.QualificationResource;
import com.portal.Service.HrMasterService.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class QualificationResourceImpl implements CommonConstant,QualificationResource {

    @Autowired
    private QualificationService qualificationService;


}