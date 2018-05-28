package com.portal.Entity.HrMastersProjections;

//import com.portal.Entity.HrMasters.Department;
import com.portal.Entity.HrMasters.Department;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "departmentProjection" , types = {Department.class})
public interface DepartmentProjection  {
    String getCode();
    //String getType();
}
