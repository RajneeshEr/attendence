package com.portal.Service.CoreImpl;

import com.portal.CommonConstant.CommonConstant;
import com.portal.Entity.Core.Team;
import com.portal.Repository.CoreRepository.TeamRepository;
import com.portal.Service.Core.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Service
public class TeamServiceImpl implements CommonConstant,TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team save(Team team){
        try{
            return teamRepository.save(team);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Team> findListOfTeamByName(String name){
        try{
            return teamRepository.findByName(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean findByIdGiven(long id){
        try {
            return teamRepository.existsById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Team findById(long id){
         try {
             return teamRepository.findById(id);
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
    }

    @Override
    public String delete(Team object){
        try {
            teamRepository.delete(object);
            return DELETE;
        } catch (Exception e) {
            e.printStackTrace();
            return NOT_DELETE;
        }
    }

}