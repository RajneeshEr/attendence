package com.portal.Entity.HrMasterSetUp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 24/5/2018
 */
@Entity
@Getter
@Setter
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(unique = true)
    String code;
    String type;

    public Department() {
    }

}