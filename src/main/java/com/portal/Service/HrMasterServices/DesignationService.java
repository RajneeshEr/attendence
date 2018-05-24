package com.portal.Service.HrMasterServices;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasterSetUp.Designation;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class DesignationService implements CommonConstant {

    @Autowired
    private DesignationRepository designationRepository;

    public boolean findByIdGiven(long id){
        try{
            return designationRepository.existsById(id);
        }catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }

    public Designation findById(long id){
        try{
            return designationRepository.findById(id);
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
