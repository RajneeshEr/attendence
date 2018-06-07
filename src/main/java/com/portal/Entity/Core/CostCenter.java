package com.portal.Entity.Core;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;

/**
 * @author rajneesh yadav
 * email er.rajyd@gmamil.com
 * date 06/6/2018
 */
@Entity
@Data
public class CostCenter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String code;
    private String name;

    @OneToOne
    private City city;

    public CostCenter() {
    }

}