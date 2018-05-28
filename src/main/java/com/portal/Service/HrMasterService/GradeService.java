package com.portal.Service.HrMasterService;

import com.portal.Entity.HrMasters.Grade;
import org.springframework.stereotype.Service;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 28/5/2018
 */
@Service
public interface GradeService {
    Grade save(Grade grade);

    Grade findGradeBYName(String name);

    Grade findById(long id);

    boolean findByIdGiven(long id);

    String delete(Grade grade);

}
