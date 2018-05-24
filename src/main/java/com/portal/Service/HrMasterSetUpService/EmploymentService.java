package com.portal.Service.HrMasterSetUpService;

import com.portal.Entity.HrMasterSetUp.Employment;
import com.portal.Repository.HrMasterSetUpRepository.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class EmploymentService {

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

     public Employment findById(long id){
              try {
                  return employmentRepository.findOne(id);
              } catch (Exception e) {
                  e.printStackTrace();
                  return null;
              }
     }



}
