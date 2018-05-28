package com.portal.Resource.HrMasterResource;

import com.portal.Entity.HrMasters.Department;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/department")
public interface DepartmentResource {

    @PostMapping("/save")
    public String save(@RequestBody Department object) ;

    @GetMapping("/get")
    @CrossOrigin
    public Department get(long id) ;


}
