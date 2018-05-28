package com.portal.Entity.HrMasters;


import com.portal.Entity.Employee;
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
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String code;
    @Column(unique = true)
    private String name;
    @OneToMany
    private Set<Employee> employee;

    public Grade() {
    }

}