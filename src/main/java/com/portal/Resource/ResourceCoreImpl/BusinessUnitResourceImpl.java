package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.BusinessUnit;
import com.portal.Resource.ResourceCore.BusinessUnitResource;
import com.portal.Service.Core.BusinessUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 15/6/2018
 */
@RestController
public class BusinessUnitResourceImpl implements BusinessUnitResource,CommonConstant {

    @Autowired
    private BusinessUnitService businessUnitService;

    @Override
    public ApplicationResponse saveBusinessUnit(@RequestBody BusinessUnit businessUnit) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        BusinessUnit businessUnit1=businessUnitService.save(businessUnit);
        if (businessUnit1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(businessUnit1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }

    @Override
    public ApplicationResponse findAllBusinessUnit() {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        ArrayList businessList= (ArrayList) businessUnitService.findAll();
        if (businessList.size()>0 && businessList!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(businessList);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }

    @Override
    public ApplicationResponse deleteBusinessUnitById(long id) {
        //todo
        return null;
    }

    @Override
    public ApplicationResponse deleteAllBusinessUnit(long id) {
        //todo
        return null;
    }
}
