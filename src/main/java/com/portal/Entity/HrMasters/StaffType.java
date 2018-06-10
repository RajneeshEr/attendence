package com.portal.Entity.HrMasters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.portal.Entity.Core.Employee;
import lombok.Data;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Entity
public class StaffType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String code;
    private String name;

    @OneToMany @JsonIgnore
    private Set<Employee> employee;

    public StaffType() {
    }

}