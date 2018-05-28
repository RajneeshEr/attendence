package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.Employment;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "employmentProjection" , types = Employment.class)
public interface EmploymentProjection  {
    String getCode();
    String getType();
}
