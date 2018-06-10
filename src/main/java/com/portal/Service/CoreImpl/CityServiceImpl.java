package com.portal.Service.CoreImpl;

import com.portal.Entity.Core.City;
import com.portal.Repository.CoreRepository.CityRepository;
import com.portal.Service.Core.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City save(City city){
        try {
            return cityRepository.save(city);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public City findById(long id) {
        try {
            return cityRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterable<City> findAll() {
        Iterable<City> cities = null;
        try {
            cities=cityRepository.findAll();
        } catch (Exception e) {
            cities=null;
            e.printStackTrace();
        }
        return cities;
    }
}
