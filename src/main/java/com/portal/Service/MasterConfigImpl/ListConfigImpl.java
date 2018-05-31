package com.portal.Service.MasterConfigImpl;


import com.portal.Repository.CoreRepository.TeamRepository;
import com.portal.Repository.HrMasterRepositories.DesignationRepository;
import com.portal.Repository.HrMasterRepositories.GradeRepository;
import com.portal.Service.MasterConfig.ListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
    GradeRepository gradeRepository;

    public ArrayList configListingOfMaster(){
        ArrayList templist=new ArrayList();
        try {
            templist.add(designationRepository.findAllProjectedBy());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return templist;
    }
}