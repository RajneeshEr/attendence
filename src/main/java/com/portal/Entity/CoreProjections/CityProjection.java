package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.City;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 08/6/2018
 */
@Projection(name = "cityProjection", types = City.class)
public interface CityProjection {
    long getId();
    String getCode();
    String getName();
}
