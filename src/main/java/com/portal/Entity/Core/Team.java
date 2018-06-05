package com.portal.Entity.Core;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Getter
@Setter
public class Team{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    public Team() {
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
}