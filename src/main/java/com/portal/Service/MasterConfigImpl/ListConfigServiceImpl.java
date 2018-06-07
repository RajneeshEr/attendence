package com.portal.Service.MasterConfigImpl;

import com.portal.Repository.CoreRepository.BusinessUnitRepository;
import com.portal.Repository.CoreRepository.CityRepository;
import com.portal.Repository.CoreRepository.LocationRepository;
import com.portal.Repository.CoreRepository.ProjectRepository;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Service.MasterConfig.ListConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

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

    @Override
    public HashMap configListingOfMaster(){
        HashMap desiEmplmntcoll= new HashMap();
        try {
            desiEmplmntcoll.put("designation",designationRepository.findAllProjectedBy()); // index 1 designation with id and code
            desiEmplmntcoll.put("employment",employmentRepository.findAllProjectedBy()); // index 2 designation with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return desiEmplmntcoll;
    }

    @Override
    public HashMap findBusinessUnit() {
        HashMap busiUnitColl= new HashMap();
        try {
            busiUnitColl.put("businessUnit",businessUnitRepository.findAllProjectedBy()); // index 0 project with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return busiUnitColl;
    }

    @Override
    public HashMap findAllProjectByBusinessUnit(long busiUnitId) {
        HashMap projectColl= new HashMap();
        try {
            projectColl.put("project",projectRepository.findByBusinessUnit(busiUnitId)); // index 0 project with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return projectColl;
    }

    @Override
    public HashMap findAllLocationByProject(long projectId) {
        HashMap locationColl= new HashMap();
        try {
            locationColl.put("location",locationRepository.findByProject(projectId)); // index 0 project with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return locationColl;
    }

    @Override
    public HashMap findAllCityByLocation(long locationId) {
        HashMap cityColl= new HashMap();
        try {
            cityColl.put("city",cityRepository.findByLocation(locationId)); // index 0 project with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cityColl;
    }
}