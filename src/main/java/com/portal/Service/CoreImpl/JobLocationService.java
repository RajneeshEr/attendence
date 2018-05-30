package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.JobLocation;
import com.portal.Repository.JobLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class JobLocationService implements CommonConstant {

    @Autowired
    private JobLocationRepository jobLocationRepository;

    //this method will work for save or update object
     public JobLocation save(JobLocation jobLocation){
         try {
             return jobLocationRepository.save(jobLocation);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }

     public boolean findByIdGiven(long id){
         try {
             return jobLocationRepository.existsById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return false;
         }
     }

     public JobLocation findById(long id){
          try {
              return jobLocationRepository.findById(id);
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
     }

     public List<JobLocation> findByJobLocationName(String name){
         try {
             return jobLocationRepository.findByJobLocationName(name);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }

    public String delete(JobLocation object){
        try {
            jobLocationRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }



}
