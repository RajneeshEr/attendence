package com.portal.Service;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.MasterPage;
import com.portal.Repository.MasterPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class MasterPageService implements CommonConstant {

    @Autowired
    private MasterPageRepository masterPageRepository;

    //this method will work for save or update object
    public MasterPage save(MasterPage masterPage){
        try {
            return masterPageRepository.save(masterPage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
