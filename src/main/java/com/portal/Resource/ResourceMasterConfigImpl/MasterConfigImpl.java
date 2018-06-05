package com.portal.Resource.ResourceMasterConfigImpl;

import com.portal.Resource.ResourceMasterConfig.MasterConfig;
import com.portal.Service.MasterConfig.ListConfig;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RestController
public class MasterConfigImpl implements MasterConfig{
    @Autowired
    ListConfig listConfig;

    @Override
    public HashMap findAllConfigDetails(){
        HashMap configList=null;
        if (listConfig.configListingOfMaster()!=null){
            configList = listConfig.configListingOfMaster();
        }
        return configList;
    }
}
