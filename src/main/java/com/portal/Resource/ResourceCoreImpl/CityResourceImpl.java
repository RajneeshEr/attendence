package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.City;
import com.portal.Resource.ResourceCore.CityResource;
import com.portal.Service.Core.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@RestController
public class CityResourceImpl implements CityResource,CommonConstant {
    @Autowired
    private CityService cityService;

    @Override
    public String saveCity(@RequestBody City city) {
        if (cityService.save(city)!=null){
            return SAVE;
        }else {
            return NOT_SAVE;
        }
    }
}