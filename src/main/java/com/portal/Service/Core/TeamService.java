package com.portal.Service.Core;

import com.portal.Entity.Core.Team;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 30/5/2018
 */
@Service
public interface TeamService {
    Team save(Team team);
    List<Team> findListOfTeamByName(String name);
    boolean findByIdGiven(long id);
    Team findById(long id);
    String delete(Team object);
}