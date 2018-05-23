package com.portal.Service;

import com.portal.Entity.Designation;
import com.portal.Repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public List<Designation> getDesignationByType(String type){
        try{
            return designationRepository.findByType(type);
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
