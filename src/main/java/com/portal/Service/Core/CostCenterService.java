package com.portal.Service.Core;

import com.portal.Entity.Core.CostCenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public interface CostCenterService {
    CostCenter findById(long id);
    Iterable<CostCenter> findAll();
}
