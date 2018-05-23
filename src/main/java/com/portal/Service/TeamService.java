package com.portal.Service;

import com.portal.Entity.Team;
import com.portal.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team saveTeam(Team team){
        try{
            return teamRepository.save(team);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public Team getTeamByID(long id){
        try{
            return teamRepository.findOne(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public List<Team> findListOfTeamByName(String name){
        try{
            return teamRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

