package com.portal.Resource.ResourceMasterConfigImpl;

import com.portal.Resource.ResourceMasterConfig.MasterConfig;
import com.portal.Service.MasterConfig.ListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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
    public ArrayList findAllConfigDetails(){
        ArrayList configList=null;
        if (listConfig.configListingOfMaster()!=null){
            configList = listConfig.configListingOfMaster();
        }
        return configList;
    }
}
