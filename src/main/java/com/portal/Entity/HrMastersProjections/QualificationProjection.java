package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.Qualification;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "qualificationProjection" , types = Qualification.class)
public interface QualificationProjection  {
    String getName();
    String getQualificationType();

}
