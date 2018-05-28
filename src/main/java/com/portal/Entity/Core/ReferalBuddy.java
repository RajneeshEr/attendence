package com.portal.Entity.Core;

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
public class ReferalBuddy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String sex;
    private String mobileNumber;


    public ReferalBuddy() {
    }

    public ReferalBuddy(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}