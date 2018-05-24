package com.portal.Service.HrMasterServices;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasterSetUp.Qualification;
import com.portal.Repository.HrMasterRepositories.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Service
public class QualificationService implements CommonConstant {

    @Autowired
    private QualificationRepository qualificationRepository;


     public Qualification findById(long id){
          try {
              return qualificationRepository.findById(id);
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
     }

     public boolean findByIdGiven(long id){
         try {
             return qualificationRepository.existsById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return false;
         }
     }

     //this method will work for save or update object
     public Qualification save(Qualification qualification){
         try {
             return qualificationRepository.save(qualification);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }

     public String delete(Qualification object){
         try {
             qualificationRepository.delete(object);
             return DELETE;
         } catch (Exception e) {
             e.printStackTrace();
             return NOT_DELETE;
         }
     }



}
