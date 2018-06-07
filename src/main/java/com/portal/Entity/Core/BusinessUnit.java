package com.portal.Entity.Core;

import lombok.Data;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Entity
@Data
public class BusinessUnit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    @OneToMany(mappedBy = "businessUnit",fetch = FetchType.EAGER)
    private Set<Project> project;

    public BusinessUnit() {
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

    public Set<Project> getProject() {
        return project;
    }

    public void setProject(Set<Project> project) {
        this.project = project;
    }
}