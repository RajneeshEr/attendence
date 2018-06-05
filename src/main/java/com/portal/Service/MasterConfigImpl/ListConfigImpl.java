package com.portal.Service.MasterConfigImpl;

import com.portal.Repository.CoreRepository.TeamRepository;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.EmploymentRepository;
import com.portal.Service.MasterConfig.ListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 31/5/2018
 */
@Component
public class ListConfigImpl implements ListConfig {

    @Autowired
    DesignationRepository designationRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    EmploymentRepository employmentRepository;



    public HashMap configListingOfMaster(){
        HashMap hashMap= new HashMap();
        try {
            hashMap.put("project",teamRepository.findAllProjectedBy()); // index 0 project with id and code
            hashMap.put("designation",designationRepository.findAllProjectedBy()); // index 1 designation with id and code
            hashMap.put("employment",employmentRepository.findAllProjectedBy()); // index 1 designation with id and code
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }
}