package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Repository.HrMasterRepositories.QualificationRepository;
import com.portal.Repository.CoreRepository.LocationRepository;
import com.portal.Repository.CoreRepository.MasterPageRepository;
import com.portal.Repository.CoreRepository.ProjectRepository;
import com.portal.Service.Core.MasterPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class MasterPageServiceImpl implements CommonConstant,MasterPageService {

    @Autowired
    private MasterPageRepository masterPageRepository;

    @Autowired
    private DesignationRepository designationRepository;

    @Autowired
    private ProjectRepository teamRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    EmploymentRepository employmentRepository;

    @Autowired
    private QualificationRepository qualificationRepository;


    //this method will work for save or update object
    public MasterPage save(MasterPageModel masterPageModel){
        MasterPage masterPage;
        masterPage=convertModelToEntity(masterPageModel);
        try {
            return masterPageRepository.save(masterPage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public MasterPage convertModelToEntity(MasterPageModel masterPageModel){
        MasterPage masterPage=new MasterPage(masterPageModel);
        long desiId=masterPageModel.getDesignationId();
        //long gradeId=masterPageModel.getGradeId();  // this is not required replace with band
        long teamId=masterPageModel.getProjectId();  // project Id is team id
        //long jobLocId=masterPageModel.getJobLocation();
        long employmentId=masterPageModel.getEmploymentId();

        //master page designation
        if(desiId>0){
            if(designationRepository.existsById(desiId)){
                masterPage.setDesignation(designationRepository.findById(desiId));
            }else { masterPage.setDesignation(null);}
        }else { masterPage.setDesignation(null);}

        //master page team
        if (teamId>0) {
            if (teamRepository.existsById(teamId)) {
                masterPage.setProject(teamRepository.findById(teamId));
            } else { masterPage.setProject(null); }
        }else{ masterPage.setProject(null);}

        //master page employment
        if (employmentId>0) {
            if (employmentRepository.existsById(employmentId)) {
                masterPage.setEmployment(employmentRepository.findById(employmentId));
            } else { masterPage.setEmployment(null); }
        }else{ masterPage.setEmployment(null);}

        return masterPage;
    }

    public boolean findByIdGiven(long id){
        try {
            return masterPageRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MasterPage findById(long id){
         try {
             return masterPageRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    public Iterable<MasterPage> findAll(){
        Iterable<MasterPage> masterPages = null;
        try {
            masterPages=masterPageRepository.findAll();
        } catch (Exception e) {
            masterPages=null;
            e.printStackTrace();
        }
        return masterPages;
    }

    public String delete(MasterPage object){
        try {
            masterPageRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}
