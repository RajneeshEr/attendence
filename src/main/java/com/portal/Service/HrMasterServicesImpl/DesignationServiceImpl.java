package com.portal.Service.HrMasterServicesImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Designation;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Service.HrMasterService.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Component
public class DesignationServiceImpl implements CommonConstant,DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

    public Designation findById(long id){
        try{
            return null;
        }catch (Exception e ){
            e.printStackTrace();
            return null;
        }
    }

    // this method will work for save or update object
    public Designation saveDesignation(Designation designation){
        try{
            return designationRepository.save(designation);
        }catch (Exception e ){
            e.printStackTrace();
            return null;
        }
    }

    public Designation getDesignationByName(String name){
        try{
            return designationRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Designation getDesignationByCode(String code){
        try{
            return designationRepository.findByName(code);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public String delete(Designation designation){
        try {
            designationRepository.delete(designation);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }


}
