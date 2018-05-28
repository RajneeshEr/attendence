package com.portal.Resource;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.MasterPage;
import com.portal.Service.MasterPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
@RequestMapping("/rest/master")
public class MasterPageResource implements CommonConstant{

    @Autowired
    private MasterPageService masterPageService;

    @Autowired
    ApplicationResponse applicationResponse;

    @PostMapping("/saveMasterPage")
    public String saveMasterPage(@RequestBody MasterPage masterPage){
        if (masterPageService.save(masterPage)!=null){
            return SAVE;
        }else {
            return NOT_SAVE;
        }
    }

    @GetMapping("/findMaster/{id}")
    public MasterPage getMasterById(@PathVariable("id") long id){
        if (masterPageService.findById(id)!=null){
            return masterPageService.findById(id);
        }else {
            return null;
        }
    }








}