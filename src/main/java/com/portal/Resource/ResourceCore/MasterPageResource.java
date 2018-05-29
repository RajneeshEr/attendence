package com.portal.Resource.ResourceCore;

import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/rest/master")
public interface MasterPageResource {

    @PostMapping("/saveMasterPage")
    String saveMasterPage(@RequestBody MasterPage masterPage);

    @GetMapping("/findMaster/{id}")
    MasterPage getMasterById(@PathVariable("id") long id);

}
