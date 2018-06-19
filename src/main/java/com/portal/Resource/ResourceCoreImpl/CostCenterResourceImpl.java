package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.CostCenter;
import com.portal.Resource.ResourceCore.CostCenterResource;
import com.portal.Service.Core.CostCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 19/6/2018
 */
@RestController
public class CostCenterResourceImpl implements CostCenterResource,CommonConstant{

    @Autowired
    private CostCenterService costCenterService;

    @Override
    public ApplicationResponse saveCostCenter(@RequestBody CostCenter costCenter) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        CostCenter costCenter1=costCenterService.save(costCenter);
        if (costCenter1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(costCenter1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }
}
