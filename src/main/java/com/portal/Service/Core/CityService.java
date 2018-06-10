package com.portal.Service.Core;

import com.portal.Entity.Core.City;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public interface CityService {
    City save(City city);
    City findById(long id);
    Iterable<City> findAll();
}