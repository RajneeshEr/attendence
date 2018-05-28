package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Team;
import com.portal.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
@RequestMapping("/rest/team")
public class TeamResourceImpl implements CommonConstant {

    @Autowired
    private TeamService teamService;

    @PostMapping("/saveTeam")
    public String save(@RequestBody Team team){
        if (teamService.save(team) !=null){
            return SAVE;
        }else{
            return NOT_SAVE;
        }
    }

    @GetMapping(value = "/getTeamById/{id}", produces = "application/json")
    public Team getTeamByid(@PathVariable("id") long id){
        return teamService.findById(id);
    }

}