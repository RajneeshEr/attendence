package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.Designation;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "designationProjection" , types = Designation.class)
public interface DesignationProjection  {
    String getCode();
    String getName();

}
