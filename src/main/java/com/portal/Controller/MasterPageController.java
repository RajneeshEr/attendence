package com.portal.Controller;

import com.portal.CommonConstant.CommonConstant;
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
@RequestMapping("/master")
public class MasterPageController implements CommonConstant{

    @Autowired
    private MasterPageService masterPageService;

    @PostMapping("/saveMasterPage")
    public String saveMasterPage(@RequestBody MasterPage masterPage){
        if (masterPageService.save(masterPage)!=null){
            return SAVE;
        }else {
            return FAIL;
        }
    }




}