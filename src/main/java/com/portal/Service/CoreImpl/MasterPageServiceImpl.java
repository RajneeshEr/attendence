package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Repository.CoreRepository.*;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Service.Core.MasterPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class MasterPageServiceImpl implements CommonConstant,MasterPageService {

    @Autowired
    private MasterPageRepository masterPageRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private EmploymentRepository employmentRepository;

    @Autowired
    private BusinessUnitRepository businessUnitRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CostCenterRepository costCenterRepository;

    //this method will work for save or update object
    public MasterPage save(MasterPageModel masterPageModel){
        MasterPage masterPage;
        masterPage=convertModelToEntity(masterPageModel);
        try {
            masterPageRepository.save(masterPage);
        } catch (Exception e) {
            e.printStackTrace();
            masterPage=null;
        }
        return masterPage;
    }

    public MasterPage convertModelToEntity(MasterPageModel masterPageModel){
        MasterPage masterPage=new MasterPage(masterPageModel);
        long desiId=masterPageModel.getDesignationId();
        long employmentId=masterPageModel.getEmploymentId();
        long busiUnitId=masterPageModel.getBusinessUnitId();
        long projectId=masterPageModel.getProjectId();  // project Id is team id
        long locationId=masterPageModel.getLocationId();
        long cityId=masterPageModel.getCityId();
        long costCenterId=masterPageModel.getCostCenterId();

        //master page designation
        if(desiId>0){
            if(designationRepository.existsById(desiId)){
                masterPage.setDesignation(designationRepository.findById(desiId));
            }else { masterPage.setDesignation(null);}
        }else { masterPage.setDesignation(null);}

        if (employmentId>0) {
            if (employmentRepository.existsById(employmentId)) {
                masterPage.setEmployment(employmentRepository.findById(employmentId));
            } else { masterPage.setEmployment(null); }
        }else{ masterPage.setEmployment(null);}

        if (busiUnitId>0) {
            if (businessUnitRepository.existsById(busiUnitId)) {
                masterPage.setBusinessUnit(businessUnitRepository.findById(busiUnitId));
            } else { masterPage.setBusinessUnit(null); }
        }else{ masterPage.setBusinessUnit(null);}

        if (projectId>0) {
            if (projectRepository.existsById(projectId)) {
                masterPage.setProject(projectRepository.findById(projectId));
            } else { masterPage.setProject(null); }
        }else{ masterPage.setProject(null);}

        if (locationId>0) {
            if (locationRepository.existsById(locationId)) {
                masterPage.setLocation(locationRepository.findById(locationId));
            } else { masterPage.setLocation(null); }
        }else{ masterPage.setLocation(null);}

        if (cityId>0) {
            if (cityRepository.existsById(cityId)) {
                masterPage.setCity(cityRepository.findById(cityId));
            } else { masterPage.setCity(null); }
        }else{ masterPage.setCity(null);}

        if (costCenterId>0) {
            if (costCenterRepository.existsById(costCenterId)) {
                masterPage.setCostCenter(costCenterRepository.findById(costCenterId));
            } else { masterPage.setCostCenter(null); }
        }else{ masterPage.setCostCenter(null);}

        return masterPage;
    }

    public boolean findByIdGiven(long id){
        try {
            return masterPageRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MasterPage findById(long id){
        try {
            return masterPageRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Iterable<MasterPage> findAll(){
        Iterable<MasterPage> masterPages = null;
        try {
            masterPages=masterPageRepository.findAll();
        } catch (Exception e) {
            masterPages=null;
            e.printStackTrace();
        }
        return masterPages;
    }

    public String delete(MasterPage object){
        try {
            masterPageRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}
