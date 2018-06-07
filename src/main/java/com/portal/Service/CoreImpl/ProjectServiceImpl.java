package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Project;
import com.portal.Repository.CoreRepository.ProjectRepository;
import com.portal.Service.Core.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class ProjectServiceImpl implements CommonConstant,ProjectService {

    @Autowired
    private ProjectRepository teamRepository;

    @Override
    public Project save(Project project){
        try{
            return teamRepository.save(project);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Project> findByName(String name){
        try{
            return teamRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean findByIdGiven(long id){
        try {
            return teamRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Project findById(long id){
         try {
             return teamRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    @Override
    public String delete(Project object){
        try {
            teamRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}