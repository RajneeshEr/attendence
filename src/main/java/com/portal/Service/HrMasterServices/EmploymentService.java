package com.portal.Service.HrMasterServices;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasterSetUp.Employment;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class EmploymentService implements CommonConstant {

    @Autowired
    private EmploymentRepository employmentRepository;

    //this method will work for save and update employment object
    public Employment save(Employment employment){
        try {
            return employmentRepository.save(employment);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return employmentRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Employment findById(long id){
          try {
              return employmentRepository.findById(id);
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
    }


    public Employment findByCode(String code){
        try {
            return employmentRepository.findByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String delete(Employment employment){
        try {
            employmentRepository.delete(employment);
            return DELETE;
        } catch (Exception e) {
            return NOT_DELETE;
        }
    }





}
