package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.Core.CostCenter;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Projection(name = "costCenterProjection", types = CostCenter.class)
public interface CostCenterProjection {
    long getId();
    String getCode();
    String getName();
}
