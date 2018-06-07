package com.portal.Resource.ResourceMasterConfig;


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
    @GetMapping(value = "/findAllDesiEmplmentConfig",produces = "application/json")
    @CrossOrigin
    HashMap findAllConfigDetails();

    @GetMapping(value = "/findAllBusinessConfig",produces = "application/json")
    @CrossOrigin
    HashMap findBusinessUnit();

    @GetMapping(value = "/findAllProjectConfig",produces = "application/json")
    @CrossOrigin
    HashMap findAllProjectByBusinessUnit(long busiUnitId);

    @GetMapping(value = "/findAllLocationConfig",produces = "application/json")
    @CrossOrigin
    HashMap findAllLocationByProject(long projectId);

    @GetMapping(value = "/findAllCityConfig",produces = "application/json")
    @CrossOrigin
    HashMap findAllCityByLocation(long locationId);


}
