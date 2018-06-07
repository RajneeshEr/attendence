package com.portal.Resource.ResourceCore;

import com.portal.Entity.Core.Project;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RequestMapping("/rest/team")
public interface ProjectResource {

    @PostMapping("/save")
    String save(@RequestBody Project project);

    @GetMapping(value = "/getById/{id}")
    Project getTeamByid(@PathVariable("id") long id);
}
