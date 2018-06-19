package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.Location;
import com.portal.Resource.ResourceCore.LocationResource;
import com.portal.Service.Core.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 18/6/2018
 */
@RestController
public class LocationResourceImpl implements LocationResource,CommonConstant{

    @Autowired
    private LocationService locationService;

    @Override
    public ApplicationResponse saveLocation(@RequestBody Location location) {
        ApplicationResponse applicationResponse = new ApplicationResponse();
        Location location1=locationService.save(location);
        if (location1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(location1);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }
        return applicationResponse ;
    }
}
