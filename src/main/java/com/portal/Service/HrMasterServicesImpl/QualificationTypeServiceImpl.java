package com.portal.Service.HrMasterServicesImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.QualificationType;
import com.portal.Repository.HrMasterRepositories.QualificationTypeRepository;
import com.portal.Service.HrMasterService.QualificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Component
public class QualificationTypeServiceImpl implements CommonConstant,QualificationTypeService {

    @Autowired
    private QualificationTypeRepository qualificationTypeRepository;

    //this method will work for save or update object
    public QualificationType save(QualificationType qualificationType){
        try {
            return qualificationTypeRepository.save(qualificationType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return qualificationTypeRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public QualificationType findById(long id){
         try {
             return qualificationTypeRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    public String delete(QualificationType object){
        try {
            qualificationTypeRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }


}
