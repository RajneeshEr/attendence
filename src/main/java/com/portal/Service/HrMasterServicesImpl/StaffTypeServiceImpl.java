package com.portal.Service.HrMasterServicesImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.HrMasters.StaffType;
import com.portal.Repository.HrMasterRepositories.StaffTypeRepository;
import com.portal.Service.HrMasterService.StaffTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Component
public class StaffTypeServiceImpl implements CommonConstant,StaffTypeService {

    @Autowired
    private StaffTypeRepository staffTypeRepository;

    //this method will work for save or update object
    public StaffType save(StaffType staffType){
        try {
            return staffTypeRepository.save(staffType);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return staffTypeRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public StaffType findById(long id){
         try {
             return staffTypeRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    public String delete(StaffType object){
        try {
            staffTypeRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}
