package com.portal.Entity.HrMastersProjections;

import com.portal.Entity.HrMasters.Grade;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "gradeProjection" , types = Grade.class)
public interface GradeProjection  {
    String getCode();
    String getName();
}
