package com.portal.Service;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.ReferalBuddy;
import com.portal.Repository.ReferalBuddyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class ReferalService implements CommonConstant{

    @Autowired
    private ReferalBuddyRepository referalBuddyRepository;

    //this method will work for save or update object
    public ReferalBuddy save(ReferalBuddy object){
        try {
            return referalBuddyRepository.save(object);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean findByIdGiven(long id){
        try {
            return referalBuddyRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ReferalBuddy findById(long id){
         try {
             return referalBuddyRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    public String delete(ReferalBuddy object){
        try {
            referalBuddyRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }


}
