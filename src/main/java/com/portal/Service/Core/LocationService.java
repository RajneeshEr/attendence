package com.portal.Service.Core;

import com.portal.Entity.Core.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public interface LocationService {
    Location save(Location location);
    Location findById(long id);
    String delete(Location object);
}