package com.portal.Service;

import com.portal.Entity.JobLocation;
import com.portal.Repository.JobLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobLocationService {

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

     public JobLocation findById(long id){
         try {
             return jobLocationRepository.findOne(id);
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





}
