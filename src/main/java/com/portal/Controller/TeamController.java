package com.portal.Controller;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Team;
import com.portal.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
@RequestMapping("/hire")
public class TeamController implements CommonConstant {

    @Autowired
    private TeamService teamService;

    @PostMapping("/saveTeam")
    public String save(@RequestBody Team team){
        if (teamService.saveTeam(team) !=null){
            return SAVE;
        }else{
            return FAIL;
        }
    }

    @GetMapping(value = "/getTeamById/{id}", produces = "application/json")
    public Team getTeamByid(@PathVariable("id") long id){
        return teamService.getTeamByID(id);
    }


}