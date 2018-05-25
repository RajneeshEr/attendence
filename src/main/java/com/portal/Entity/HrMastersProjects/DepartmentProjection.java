package com.portal.Entity.HrMastersProjects;

import com.portal.Entity.HrMasters.Department;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "departmentProjection" , types = Department.class)
public interface DepartmentProjection  {
    public String getCode();
    public String getType();
}
