package com.portal.Resource.HrMasterResource;

import com.portal.Entity.HrMasters.Grade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/grade")
public interface GradeResource {
    @PostMapping("/save")
    public String save(@RequestBody Grade object);

}
