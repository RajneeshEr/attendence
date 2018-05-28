package com.portal.Entity.Core;

import com.portal.Entity.HrMasters.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 23/5/2018
 */
@Entity
@Getter
@Setter
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String role;
    @Column(unique = true)
    private String code;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String sex;
    private String mobileNumber;
    private String passportNumber;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Department department;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Designation designation;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private StaffType staffType;
   /* @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Qualification qualification;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Employment employment;*/

    public Employee() {
    }

}