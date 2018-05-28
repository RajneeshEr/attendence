package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.QualificationType;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "qualificationTypeProjection" , types = QualificationType.class)
public interface QualificationTypeProjection  {
    String getCode();
    String getName();
}

