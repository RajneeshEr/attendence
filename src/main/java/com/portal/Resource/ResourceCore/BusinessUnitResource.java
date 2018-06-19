package com.portal.Resource.ResourceCore;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.portal.Config.ApplicationResponse;
import com.portal.Entity.Core.BusinessUnit;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import java.util.Map;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 15/6/2018
 */
@RequestMapping("/rest/businessUnit")
public interface BusinessUnitResource {

    /*Map<String,Object> map = mapper.readValue(Json, BusinessUnit.class);
    ObjectMapper mapper = new ObjectMapper();
*/

    @PostMapping("/saveBusinessUnit")
    @CrossOrigin
    ApplicationResponse saveBusinessUnit(@RequestBody BusinessUnit businessUnit);

    @DeleteMapping("/deleteBusinessUnit")
    @CrossOrigin
    ApplicationResponse deleteBusinessUnitById(long id);

    @DeleteMapping("/deleteAllBusinessUnit")
    @CrossOrigin
    ApplicationResponse deleteAllBusinessUnit(long id);
}