package com.portal.Service.Core;

import com.portal.Entity.Core.Project;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 30/5/2018
 */
@Service
public interface ProjectService {
    Project save(Project project);
    List<Project> findByName(String name);
    boolean findByIdGiven(long id);
    Project findById(long id);
    String delete(Project object);
}