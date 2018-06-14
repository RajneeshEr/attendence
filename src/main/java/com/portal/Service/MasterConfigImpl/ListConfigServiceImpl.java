package com.portal.Service.MasterConfigImpl;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.Core.CostCenter;
import com.portal.Repository.CoreRepository.*;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Service.MasterConfig.ListConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@Component
public class ListConfigServiceImpl implements ListConfigService {

    @Autowired
    DesignationRepository designationRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    EmploymentRepository employmentRepository;

    @Autowired
    private BusinessUnitRepository businessUnitRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CostCenterRepository costCenterRepository;

    @Override
    public HashMap configListingOfMaster(){
        HashMap desiEmplmntcoll= new HashMap();
        try {
            desiEmplmntcoll.put("designation",designationRepository.findAllProjectedBy().size()>0?designationRepository.findAllProjectedBy():null);
            desiEmplmntcoll.put("employment",employmentRepository.findAllProjectedBy().size()>0?employmentRepository.findAllProjectedBy():null);
            desiEmplmntcoll.put("businessUnit",businessUnitRepository.findAllProjectedBy().size()>0?businessUnitRepository.findAllProjectedBy():null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return desiEmplmntcoll;
    }

    @Override
    public ArrayList findBusinessUnit() {
        ArrayList businessUnitList=new ArrayList();
        try {
            businessUnitList=businessUnitRepository.findAllProjectedBy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (businessUnitList!=null && businessUnitList.size()>0){
            return businessUnitList;
        }else {
            return null;
        }
    }

    @Override
    public ArrayList findAllProjectByBusinessUnit(long busiUnitId) {
        ArrayList projectList=new ArrayList();
        try {
            projectList=projectRepository.findByBusinessUnitId(busiUnitId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (projectList!=null && projectList.size()>0){
            return projectList;
        }else {
            return null;
        }
    }

    @Override
    public ArrayList findAllLocationByProject(long projectId) {
        ArrayList locationList=new ArrayList();
        try {
            locationList=locationRepository.findByProjectId(projectId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (locationList!=null && locationList.size()>0){
            return locationList;
        }else {
            return null;
        }
    }

    @Override
    public ArrayList findAllCityByLocation(long locationId) {
        //HashMap cityColl= new HashMap();
        ArrayList cityList=new ArrayList();
        try {
            cityList=cityRepository.findByLocationId(locationId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cityList!=null && cityList.size()>0){
            return cityList;
        }else {
            return null;
        }
    }

    @Override
    public ArrayList findAllCostCenterByCity(long cityId) {
        ArrayList costCenterList= new ArrayList();
        try {
            costCenterList=costCenterRepository.findByCityId(cityId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (costCenterList!=null && costCenterList.size()>0){
            return costCenterList;
        }else {
            return null;
        }

    }

}