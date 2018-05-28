package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.StaffType;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "staffTypeProjection" , types = StaffType.class)
public interface StaffTypeProjection  {
    String getCode();
    String getName();

}
