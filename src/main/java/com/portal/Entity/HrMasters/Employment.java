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
public class Employment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String code;
    private String type;
    @OneToMany
    private Set<Employee> employee;

    public Employment() {
    }

}