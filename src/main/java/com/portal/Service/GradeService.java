package com.portal.Service;

import com.portal.Entity.Grade;
import com.portal.Repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    // we can use on save as well as on update case
    public Grade saveGrade(Grade grade){
        try{
            return gradeRepository.save(grade);
        }catch (Exception e ){
            e.printStackTrace();
            return null;
        }
    }

    public List<Grade> getGradeBYName(String name){
        try{
            return gradeRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Grade getGradeById(long id){
        try {
            return gradeRepository.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteGradeById(long id){
        try {
            gradeRepository.delete(id);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
