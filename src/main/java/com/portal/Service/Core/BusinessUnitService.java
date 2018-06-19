package com.portal.Service.Core;

import com.portal.Entity.Core.BusinessUnit;
import com.portal.Entity.Core.MasterPage;
import com.portal.Repository.CoreRepository.BusinessUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Service
public interface BusinessUnitService {
    BusinessUnit save(BusinessUnit businessUnit);
    BusinessUnit findById(long id);
    Iterable<BusinessUnit> findAll();

}
