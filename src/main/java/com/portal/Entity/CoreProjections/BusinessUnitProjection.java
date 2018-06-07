package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.Core.Project;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Projection(name = "businessUnitProjection", types = BusinessUnit.class)
public interface BusinessUnitProjection {
    long getId();
    String getCode();

}
