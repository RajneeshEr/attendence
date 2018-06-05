package com.portal.Entity.CoreProjections;

import com.portal.Entity.Core.Team;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 03/6/2018
 */
@Projection(name = "teamProjection", types = Team.class)
public interface TeamProjection {
    String getId();
    String getCode();

}
