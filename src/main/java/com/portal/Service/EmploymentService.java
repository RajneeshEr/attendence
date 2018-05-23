package com.portal.Service;

import com.portal.Entity.Employment;
import com.portal.Repository.EmploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmploymentService {

    @Autowired
    EmploymentRepository employmentRepository;

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
