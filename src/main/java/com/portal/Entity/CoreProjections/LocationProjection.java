package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.Location;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 08/6/2018
 */
@Projection(name = "locationProjection", types = Location.class)
public interface LocationProjection {
    long getId();
    String getName();
    String getCode();
}
