package com.portal.Entity.Core;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String name;
    private String code;

    @ManyToOne
    //@JoinColumn(name = "businessUnit_id")
    private BusinessUnit businessUnit;

    @OneToMany(mappedBy = "project",fetch = FetchType.LAZY)
    private Set<Location> location;

    public Project() {
    }

    public Project(String name, String code, BusinessUnit businessUnit) {
        this.name = name;
        this.code = code;
        this.businessUnit = businessUnit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    public Set<Location> getLocation() {
        return location;
    }

    public void setLocation(Set<Location> location) {
        this.location = location;
    }
}