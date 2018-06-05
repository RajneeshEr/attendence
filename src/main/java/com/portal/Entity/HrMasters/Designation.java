package com.portal.Entity.HrMasters;

import com.portal.Entity.Core.Employee;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Data
public class Designation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String code; // mandatory field

    private String name; // mandatory field

    private StaffType staffType;

    private String bandLevel;

    @OneToMany
    private Set<Employee> employee;

    public Designation() {
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

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }

    public String getBandLevel() {
        return bandLevel;
    }

    public void setBandLevel(String bandLevel) {
        this.bandLevel = bandLevel;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }
}