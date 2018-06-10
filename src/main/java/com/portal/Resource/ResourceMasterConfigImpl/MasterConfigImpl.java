package com.portal.Resource.ResourceMasterConfigImpl;

import com.portal.Resource.ResourceMasterConfig.MasterConfig;
import com.portal.Service.MasterConfig.ListConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RestController
public class MasterConfigImpl implements MasterConfig{
    @Autowired
    ListConfigService listConfig;

    @Override
    public HashMap findAllConfigDetails(){
        HashMap configListColl=null;
        if (listConfig.configListingOfMaster()!=null){
            configListColl = listConfig.configListingOfMaster();
        }
        return configListColl;
    }

    @Override
    public HashMap findBusinessUnit() {
        HashMap businessUnitColl=null;
        if (listConfig.findBusinessUnit()!=null){
            businessUnitColl = listConfig.findBusinessUnit();
        }
        return businessUnitColl;
    }

    @Override
    public HashMap findAllProjectByBusinessUnit(long busiUnitId) {
        HashMap projectColl=null;
        if (listConfig.findAllProjectByBusinessUnit(busiUnitId)!=null){
            projectColl = listConfig.findAllProjectByBusinessUnit(busiUnitId);
        }
        return projectColl;
    }

    @Override
    public HashMap findAllLocationByProject(long projectId) {
        HashMap locationColl=null;
        if (listConfig.findAllLocationByProject(projectId)!=null){
            locationColl = listConfig.findAllLocationByProject(projectId);
        }
        return locationColl;
    }

    @Override
    public HashMap findAllCityByLocation(long locationId) {
        HashMap cityColl=null;
        if (listConfig.findAllCityByLocation(locationId)!=null){
            cityColl = listConfig.findAllCityByLocation(locationId);
        }
        return cityColl;
    }

    @Override
    public HashMap findAllCostCenterByCity(long cityId) {
        HashMap costCenterColl=null;
        if (listConfig.findAllCostCenterByCity(cityId)!=null){
            costCenterColl = listConfig.findAllCostCenterByCity(cityId);
        }
        return costCenterColl;
    }
}