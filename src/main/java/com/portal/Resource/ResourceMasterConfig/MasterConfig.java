package com.portal.Resource.ResourceMasterConfig;


import com.portal.Config.ApplicationResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RequestMapping("/rest/config")
public interface MasterConfig {
    @GetMapping(value = "/findAllConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findAllConfigDetails();

    @GetMapping(value = "/findAllBusinessConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findBusinessUnit();

    @GetMapping(value = "/findAllProjectConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findAllProjectByBusinessUnit(long busiUnitId);

    @GetMapping(value = "/findAllLocationConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findAllLocationByProject(long projectId);

    @GetMapping(value = "/findAllCityConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findAllCityByLocation(long locationId);

    @GetMapping(value = "/findAllCostCenterConfig",produces = "application/json")
    @CrossOrigin
    ApplicationResponse findAllCostCenterByCity(long cityId);
}
