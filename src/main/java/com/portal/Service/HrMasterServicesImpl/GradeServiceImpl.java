package com.portal.Service.HrMasterServicesImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.Grade;
import com.portal.Repository.HrMasterRepositories.GradeRepository;
import com.portal.Service.HrMasterService.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class GradeServiceImpl implements CommonConstant,GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    // we can use on save as well as on update case
    public Grade save(Grade grade){
        try{
            return gradeRepository.save(grade);
        }catch (Exception e ){
            e.printStackTrace();
            return null;
        }
    }

    public Grade findGradeBYName(String name){
        try{
            return gradeRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Grade findById(long id){
        try {
            return gradeRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   public boolean findByIdGiven(long id){
       try {
           return gradeRepository.existsById(id);
       } catch (Exception e) {
           e.printStackTrace();
           return false;
       }
   }

    public String delete(Grade grade){
        try {
            gradeRepository.delete(grade);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }


}
