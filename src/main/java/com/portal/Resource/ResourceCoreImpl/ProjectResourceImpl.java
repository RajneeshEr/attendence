package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
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
    private ProjectService projectService;

    @Override
    public ApplicationResponse save(@RequestBody Project project){
        ApplicationResponse applicationResponse = new ApplicationResponse();
        Project project1 =projectService.save(project);

        if (project1!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            applicationResponse.setData(project1);
        }else{
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(NOT_SAVE);
            applicationResponse.setData(null);
        }

        return applicationResponse ;
    }

    @Override
    public Project getTeamByid(@PathVariable("id") long id){
        return projectService.findById(id);
    }

}