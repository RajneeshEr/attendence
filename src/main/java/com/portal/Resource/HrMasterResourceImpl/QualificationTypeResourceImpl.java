package com.portal.Resource.HrMasterResourceImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Resource.HrMasterResource.QualificatoinTypeResource;
import com.portal.Service.HrMasterService.QualificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@RestController
public class QualificationTypeResourceImpl implements CommonConstant,QualificatoinTypeResource {

    @Autowired
    private QualificationTypeService qualificationTypeService;

}