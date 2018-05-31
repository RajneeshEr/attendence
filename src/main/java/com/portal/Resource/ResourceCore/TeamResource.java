package com.portal.Resource.ResourceCore;

import com.portal.Entity.Core.Team;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RequestMapping("/rest/team")
public interface TeamResource {

    @PostMapping("/save")
    String save(@RequestBody Team team);

    @GetMapping(value = "/getById/{id}")
    Team getTeamByid(@PathVariable("id") long id);
}
