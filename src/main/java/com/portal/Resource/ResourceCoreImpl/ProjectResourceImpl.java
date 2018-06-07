package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Project;
import com.portal.Resource.ResourceCore.ProjectResource;
import com.portal.Service.Core.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
public class ProjectResourceImpl implements CommonConstant,ProjectResource {

    @Autowired
    private ProjectService teamService;

    @Override
    public String save(@RequestBody Project project){
        if (teamService.save(project) !=null){
            return SAVE;
        }else{
            return NOT_SAVE;
        }
    }

    @Override
    public Project getTeamByid(@PathVariable("id") long id){
        return teamService.findById(id);
    }


}