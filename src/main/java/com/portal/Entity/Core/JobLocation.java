package com.portal.Entity.Core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 21/5/2018
 */
@Entity
@Getter
@Setter
public class JobLocation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String jobLocationName;

    @JsonIgnore
    @ManyToOne
    private MasterPage masterPage;

    public JobLocation() {
    }

}