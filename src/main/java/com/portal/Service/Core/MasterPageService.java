package com.portal.Service.Core;

import com.portal.Entity.Core.MasterPage;
import com.portal.Entity.CoreModel.MasterPageModel;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 30/5/2018
 */
@Service
public interface MasterPageService {
    MasterPage save(MasterPageModel masterPageModel);
    boolean findByIdGiven(long id);
    MasterPage findById(long id);
    Iterable<MasterPage> findAll();
}
