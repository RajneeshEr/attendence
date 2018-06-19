package com.portal.Entity.Core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Getter
@Setter
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Project project;

/*
    @OneToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<City> cities;
*/

    public Location() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

/*
    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
*/
}