package com.portal.Service.HrMasterSetUpService;

import com.portal.Entity.HrMasterSetUp.Designation;
import com.portal.Repository.HrMasterSetUpRepository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class DesignationService {

    @Autowired
    private DesignationRepository designationRepository;

    public Designation getDesignationById(long id){
        try{
            return designationRepository.findOne(id);
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

    public List<Designation> getDesignationByName(String name){
        try{
            return designationRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
