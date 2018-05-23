package com.portal.Service;

import com.portal.Entity.MasterPage;
import com.portal.Repository.MasterPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterPageService {

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

     public MasterPage findById(long id){
              try {
                  return masterPageRepository.findOne(id);
              } catch (Exception e) {
                  e.printStackTrace();
                  return null;
              }
    }



}
