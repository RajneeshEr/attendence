package com.portal.Resource.ResourceCore;

import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RequestMapping("/rest/master")
public interface MasterPageResource {

    @PostMapping("/saveMasterPage")
    @CrossOrigin
    ApplicationResponse saveMasterPage(@RequestBody MasterPageModel masterPageModel);

    @GetMapping("/findMaster/{id}")
    @CrossOrigin
    ApplicationResponse getMasterById(@PathVariable("id") long id);


    @GetMapping("/findMaster/all")
    @CrossOrigin
    Iterable<MasterPage> findAll();

}