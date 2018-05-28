package com.portal.Resource.HrMasterResource;

import com.portal.Entity.MasterPage;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/designation")
public interface DesignationResource {

    @PostMapping("/saveMasterPage")
    String saveMasterPage(@RequestBody MasterPage masterPage);

}
