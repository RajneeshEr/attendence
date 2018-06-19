package com.portal.Resource.ResourceCore;

import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.Project;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RequestMapping("/rest/project")
public interface ProjectResource {

    @PostMapping("/saveProject")
    ApplicationResponse save(@RequestBody Project project);

    @GetMapping(value = "/getById/{id}")
    Project getTeamByid(@PathVariable("id") long id);
}
