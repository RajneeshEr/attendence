package com.portal.Entity.HrMasters;

import lombok.Data;
import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Entity
public class Qualification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    private String name;
    private QualificationType qualificationType;

    public Qualification() {
    }

}