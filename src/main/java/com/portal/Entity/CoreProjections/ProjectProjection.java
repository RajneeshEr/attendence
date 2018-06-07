package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.Project;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 03/6/2018
 */
@Projection(name = "projectProjection", types = Project.class)
public interface ProjectProjection {
    long getId();
    String getCode();

}