package com.portal.Resource.ResourceMasterConfig;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@RequestMapping("/rest/config")
public interface MasterConfig {
    @GetMapping("/findAll")
    @CrossOrigin
    ArrayList findAllConfigDetails();
}
