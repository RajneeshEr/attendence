package com.portal.Service.MasterConfig;

import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@Service
public interface ListConfigService {
    HashMap configListingOfMaster();
    HashMap findBusinessUnit();
    HashMap findAllProjectByBusinessUnit(long busiUnitId);
    HashMap findAllLocationByProject(long projectId);
    HashMap findAllCityByLocation(long locationId);
    HashMap findAllCostCenterByCity(long cityId);
}
