package com.portal.Resource.ResourceCore;

import com.portal.Entity.Core.City;
import com.portal.Entity.CoreModel.CityModel;
import com.portal.Entity.CoreModel.MasterPageModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@RequestMapping("/rest/city")
public interface CityResource {

    @PostMapping("/saveCity")
    @CrossOrigin
    String saveCity(@RequestBody City cityModel);

}
