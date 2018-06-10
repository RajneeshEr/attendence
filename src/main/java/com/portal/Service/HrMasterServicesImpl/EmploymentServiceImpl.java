package com.portal.Service.HrMasterServicesImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Employment;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Service.HrMasterService.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class EmploymentServiceImpl implements CommonConstant,EmploymentService {

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
