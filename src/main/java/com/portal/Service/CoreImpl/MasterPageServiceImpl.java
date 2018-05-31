package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Repository.CoreRepository.EmployeeRepository;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Repository.HrMasterRepositories.GradeRepository;
import com.portal.Repository.HrMasterRepositories.QualificationRepository;
import com.portal.Repository.CoreRepository.JobLocationRepository;
import com.portal.Repository.CoreRepository.MasterPageRepository;
import com.portal.Repository.CoreRepository.TeamRepository;
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
    private TeamRepository teamRepository;
    @Autowired
    private JobLocationRepository jobLocationRepository;
    @Autowired
    EmploymentRepository employmentRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private QualificationRepository qualificationRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

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
        long desiId=masterPageModel.getDesignation();
        long gradeId=masterPageModel.getGrade();
        long teamId=masterPageModel.getTeam();
        long jobLocId=masterPageModel.getJobLocation();
        long employmentId=masterPageModel.getEmployment();
        long qualificationId=masterPageModel.getQualification();
        long reportingManagerId=masterPageModel.getReportingManager();


        //master page designation
        if(desiId>0){
            if(designationRepository.existsById(desiId)){
                masterPage.setDesignation(designationRepository.findById(desiId));
            }else { masterPage.setDesignation(null);}
        }else { masterPage.setDesignation(null);}

        //master page grdae
        if (gradeId>0) {
            if (gradeRepository.existsById(gradeId)) {
                masterPage.setGrade(gradeRepository.findById(gradeId));
            } else { masterPage.setGrade(null); }
        }else{ masterPage.setGrade(null);}

        //master page team
        if (teamId>0) {
            if (teamRepository.existsById(teamId)) {
                masterPage.setTeam(teamRepository.findById(teamId));
            } else { masterPage.setTeam(null); }
        }else{ masterPage.setTeam(null);}

        //master page job location
        if (jobLocId>0) {
            if (jobLocationRepository.existsById(jobLocId)) {
                masterPage.setJobLocation(jobLocationRepository.findById(jobLocId));
            } else { masterPage.setJobLocation(null); }
        }else{ masterPage.setJobLocation(null);}

        //master page employment
        if (employmentId>0) {
            if (employmentRepository.existsById(employmentId)) {
                masterPage.setEmployment(employmentRepository.findById(employmentId));
            } else { masterPage.setEmployment(null); }
        }else{ masterPage.setEmployment(null);}

        //master page employment
        if (qualificationId>0) {
            if (qualificationRepository.existsById(qualificationId)) {
                masterPage.setQualification(qualificationRepository.findById(qualificationId));
            } else { masterPage.setQualification(null); }
        }else{ masterPage.setQualification(null);}

        //master page employment
        if (reportingManagerId>0) {
            if (employeeRepository.existsById(reportingManagerId)) {
                masterPage.setReportingManager(employeeRepository.findById(reportingManagerId));
            } else { masterPage.setReportingManager(null); }
        }else{ masterPage.setReportingManager(null);}

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
