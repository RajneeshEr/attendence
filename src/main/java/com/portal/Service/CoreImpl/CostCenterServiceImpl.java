package com.portal.Service.CoreImpl;

import com.portal.Entity.Core.CostCenter;
import com.portal.Repository.CoreRepository.CostCenterRepository;
import com.portal.Service.Core.CostCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public class CostCenterServiceImpl implements CostCenterService {

    @Autowired
    private CostCenterRepository costCenterRepository;

    @Override
    public CostCenter findById(long id) {
        try {
            return costCenterRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Iterable<CostCenter> findAll() {
        Iterable<CostCenter> costCenters = null;
        try {
            costCenters=costCenterRepository.findAll();
        } catch (Exception e) {
            costCenters=null;
            e.printStackTrace();
        }
        return costCenters;
    }
}
