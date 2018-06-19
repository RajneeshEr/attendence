package com.portal.Resource.HrMasterResource;


import com.portal.Config.ApplicationResponse;
import com.portal.Entity.HrMasters.StaffType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@RequestMapping("/rest/staffType")
public interface StaffTypeResource {

    @PostMapping("/save")
    ApplicationResponse save(@RequestBody StaffType staffType);
}
