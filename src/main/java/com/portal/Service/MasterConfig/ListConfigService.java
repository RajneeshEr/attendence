package com.portal.Service.MasterConfig;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@Service
public interface ListConfigService {
    HashMap configListingOfMaster();
    ArrayList findBusinessUnit();
    ArrayList findAllProjectByBusinessUnit(long busiUnitId);
    ArrayList findAllLocationByProject(long projectId);
    ArrayList findAllCityByLocation(long locationId);
    ArrayList findAllCostCenterByCity(long cityId);
}
