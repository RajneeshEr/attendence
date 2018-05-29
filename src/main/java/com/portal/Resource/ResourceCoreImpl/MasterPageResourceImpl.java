package com.portal.Resource.ResourceCoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import com.portal.Resource.ResourceCore.MasterPageResource;
import com.portal.Service.MasterPageService;
import org.aspectj.lang.annotation.Before;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    ApplicationResponse applicationResponse;

    @Override
    public String saveMasterPage(@RequestBody MasterPage masterPage){
        /*Mapper mapper = new DozerBeanMapper();
        MasterPage masterPage=mapper.map(masterPageModel,MasterPage.class);
*/
        if (masterPageService.save(masterPage)!=null){
            return SAVE;
        }else {
            return NOT_SAVE;
        }
    }

    /*@Before(value = "java")
    public void before() throws Exception {
        mapper = new DozerBeanMapper();
    }*/



   /* @Override
    public String saveMasterPage(MasterPageModel masterPage) {
        return null;
    }*/

    @Override
    public MasterPage getMasterById(@PathVariable("id") long id){
        if (masterPageService.findById(id)!=null){
            return masterPageService.findById(id);
        }else {
            return null;
        }
    }








}