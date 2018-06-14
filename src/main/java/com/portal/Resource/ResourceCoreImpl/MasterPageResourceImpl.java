package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Resource.ResourceCore.MasterPageResource;
import com.portal.Service.Core.MasterPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@RestController
public class MasterPageResourceImpl implements CommonConstant,MasterPageResource {
    @Autowired
    private MasterPageService masterPageService;

    @Autowired
    private ApplicationResponse applicationResponse;

    //private Mapper mapper;

    @Override
    public ApplicationResponse saveMasterPage(@RequestBody MasterPageModel masterPageModel){
        //HashMap hashMap=new HashMap();
        MasterPage masterPage=masterPageService.save(masterPageModel);
        if (masterPage!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
           // hashMap.put("data",masterPage);
            applicationResponse.setData(masterPage);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(SAVE);
            //hashMap.put("data",null);
            applicationResponse.setData(null);
        }
        return applicationResponse;
    }

    @Override
    public ApplicationResponse getMasterById(@PathVariable("id") long id){
        //HashMap hashMap=new HashMap();
        MasterPage masterPage=masterPageService.findById(id);
        if (masterPage!=null){
            applicationResponse.setStatus(true);
            applicationResponse.setMessage(SAVE);
            //hashMap.put("data",masterPage);
            applicationResponse.setData(masterPage);
        }else {
            applicationResponse.setStatus(false);
            applicationResponse.setMessage(SAVE);
            //hashMap.put("data",null);
            applicationResponse.setData(null);
        }
        return applicationResponse;
    }

    @Override
    public Iterable<MasterPage> findAll(){
        return masterPageService.findAll();
    }

}