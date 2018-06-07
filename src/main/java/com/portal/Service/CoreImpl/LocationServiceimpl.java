package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Location;
import com.portal.Repository.CoreRepository.LocationRepository;
import com.portal.Service.Core.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class LocationServiceimpl implements CommonConstant,LocationService {

    @Autowired
    private LocationRepository locationRepository;

    //this method will work for save or update object
    @Override
     public Location save(Location location){
         try {
             return locationRepository.save(location);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }

    @Override
     public Location findById(long id){
          try {
              return locationRepository.findById(id);
          } catch (Exception e) {
              e.printStackTrace();
              return null;
          }
     }
/*
    @Override
     public List<Location> findByName(String name){
         try {
             return locationRepository.findByName(name);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }*/

    @Override
    public String delete(Location object){
        try {
            locationRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}
