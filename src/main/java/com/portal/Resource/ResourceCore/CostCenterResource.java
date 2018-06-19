package com.portal.Resource.ResourceCore;

import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.CostCenter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 19/6/2018
 */
@RequestMapping("/rest/costCenter")
public interface CostCenterResource {
    @PostMapping("/saveCostCenter")
    @CrossOrigin
    ApplicationResponse saveCostCenter(@RequestBody CostCenter costCenter);
}
