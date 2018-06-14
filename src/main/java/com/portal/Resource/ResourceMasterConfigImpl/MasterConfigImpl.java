package com.portal.Resource.ResourceMasterConfigImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Resource.ResourceMasterConfig.MasterConfig;
import com.portal.Service.MasterConfig.ListConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RestController
public class MasterConfigImpl implements MasterConfig,CommonConstant{
    @Autowired
    ListConfigService listConfig;

    @Override
    public ApplicationResponse findAllConfigDetails(){
        ApplicationResponse applicationResponse= new ApplicationResponse();
        HashMap configListColl=listConfig.configListingOfMaster();
        ArrayList desiList= (ArrayList) configListColl.get("designation");
        ArrayList employmentList= (ArrayList) configListColl.get("employment");
        ArrayList businessUnitList= (ArrayList) configListColl.get("businessUnit");
        boolean status=false;
        String mess=NOT_FIND;
        if (desiList!=null && desiList.size()>0){
            status=true;
            if (status && employmentList!=null && employmentList.size()>0){
                status=true;
                if (status && businessUnitList!=null && businessUnitList.size()>0){
                    status=true;
                    applicationResponse.setStatus(true);
                    applicationResponse.setMessage(FIND);
                    applicationResponse.setData(configListColl);
                }else {status=false;mess=mess+" for businessUnit: ";}
            }else {status=false;mess=mess+" for employment: ";}
        }else {status=false;mess=mess+" for designation: ";}
        if (status==false){
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(mess);
            applicationResponse.setData(null);
        }

        return applicationResponse;
    }

    @Override
    public ApplicationResponse findBusinessUnit() {
        ApplicationResponse applicationResponse=new ApplicationResponse();
        HashMap hashMap=new HashMap();
        ArrayList businessUnitList=listConfig.findBusinessUnit();
        if (businessUnitList!=null && businessUnitList.size()>0){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(FIND+" for businessUnit");
            hashMap.put("businessUnit",businessUnitList);
            applicationResponse.setData(hashMap);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_FIND+" for businessUnit");
            hashMap.put("businessUnit",null);
            applicationResponse.setData(hashMap);
        }
        return applicationResponse;
    }

    @Override
    public ApplicationResponse findAllProjectByBusinessUnit(long busiUnitId) {
        ApplicationResponse applicationResponse=new ApplicationResponse();
        HashMap hashMap=new HashMap();
        ArrayList projectList=listConfig.findAllProjectByBusinessUnit(busiUnitId);
        if (projectList!=null && projectList.size()>0){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(FIND+" for project by businessUnit id : "+busiUnitId);
            hashMap.put("project",projectList);
            applicationResponse.setData(hashMap);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_FIND+" for project by businessUnit id : "+busiUnitId);
            hashMap.put("project",null);
            applicationResponse.setData(hashMap);
        }
        return applicationResponse;
    }

    @Override
    public ApplicationResponse findAllLocationByProject(long projectId) {
        ApplicationResponse applicationResponse=new ApplicationResponse();
        HashMap hashMap=new HashMap();
        ArrayList locationList=listConfig.findAllLocationByProject(projectId);
        if (locationList!=null && locationList.size()>0){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(FIND+" for location by project id : "+projectId);
            hashMap.put("location",locationList);
            applicationResponse.setData(hashMap);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_FIND+" for location by project id : "+projectId);
            hashMap.put("location",null);
            applicationResponse.setData(null);
        }
        return applicationResponse;
    }

    @Override
    public ApplicationResponse findAllCityByLocation(long locationId) {
        ApplicationResponse applicationResponse=new ApplicationResponse();
        HashMap hashMap=new HashMap();
        ArrayList cityList=listConfig.findAllCityByLocation(locationId);
        if (cityList!=null && cityList.size()>0){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(FIND+" for city by location id : "+locationId);
            hashMap.put("city",cityList);
            applicationResponse.setData(hashMap);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_FIND+" for city by location id : "+locationId);
            hashMap.put("city",null);
            applicationResponse.setData(hashMap);
        }
        return applicationResponse;
    }

    @Override
    public ApplicationResponse findAllCostCenterByCity(long cityId) {
        ApplicationResponse applicationResponse=new ApplicationResponse();
        HashMap hashMap=new HashMap();
        ArrayList costCenterList=listConfig.findAllCostCenterByCity(cityId);
        if (costCenterList!=null && costCenterList.size()>0){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(FIND+" for costCenter by city id : "+cityId);
            hashMap.put("costCenter",costCenterList);
            applicationResponse.setData(hashMap);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_FIND+" for costCenter by city id : "+cityId);
            hashMap.put("costCenter",null);
            applicationResponse.setData(hashMap);
        }
        return applicationResponse;
    }
}