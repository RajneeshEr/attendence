package com.portal.Resource.HrMasterResource;

import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.HrMasters.Designation;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/designation")
public interface DesignationResource {

    @PostMapping("/save")
    ApplicationResponse save(@RequestBody Designation designation);

}
