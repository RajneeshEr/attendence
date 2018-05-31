package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Team;
import com.portal.Resource.ResourceCore.TeamResource;
import com.portal.Service.Core.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
public class TeamResourceImpl implements CommonConstant,TeamResource {

    @Autowired
    private TeamService teamService;

    @Override
    public String save(@RequestBody Team team){
        if (teamService.save(team) !=null){
            return SAVE;
        }else{
            return NOT_SAVE;
        }
    }

    @Override
    public Team getTeamByid(@PathVariable("id") long id){
        return teamService.findById(id);
    }


}