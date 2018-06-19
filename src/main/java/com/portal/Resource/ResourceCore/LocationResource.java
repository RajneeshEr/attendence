package com.portal.Resource.ResourceCore;

import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.Location;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 18/6/2018
 */
@RequestMapping("/rest/location")
public interface LocationResource {

    @PostMapping("/saveLocation")
    @CrossOrigin
    ApplicationResponse saveLocation(@RequestBody Location location);
}
