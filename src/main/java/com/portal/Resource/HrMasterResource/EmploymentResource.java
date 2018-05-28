package com.portal.Resource.HrMasterResource;

import com.portal.Entity.HrMasters.Employment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/employment")
public interface EmploymentResource {
    @PostMapping("/save")
    public String save(@RequestBody Employment object);

}
